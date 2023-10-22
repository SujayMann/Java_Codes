import java.util.ArrayList;

public class Producer_Consumer {
    public static void main(String[] args) throws InterruptedException {
        final PC pc = new PC();
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }

    public static class PC {
        int capacity = 2;
        ArrayList<Integer> list = new ArrayList<>(capacity);
        public void produce() throws InterruptedException {
            int value = 0;
            while (true) {
                synchronized (this) {
                    while (list.size() == capacity){
                        System.out.println("Full");
                        wait();
                    }
                    System.out.println("Producer produced: " + value);
                    list.add(value++);
                    notify();
                    Thread.sleep(1000);
                }
            }
        }
        public void consume() throws InterruptedException {
            while (true) {
                synchronized (this) {
                    while (list.size() == 0){
                        System.out.println("Empty");
                        wait();
                    }
                    int val = list.remove(0);
                    System.out.println("Consumer consumed: " + val);
                    notify();
                    Thread.sleep(1000);
                }
            }
        }
    }
}
