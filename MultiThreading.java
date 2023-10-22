import java.util.Random;

class Thread1 extends Thread {
    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int n = random.nextInt(0, 100);
            System.out.println("N = " + n);
            if (n % 2 == 0) {
                Thread2 thread2 = new Thread2(n);
                thread2.run();
            } else {
                Thread3 thread3 = new Thread3(n);
                thread3.run();
            }
            try {
                sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread2 extends Thread {
    int n;

    public Thread2(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        System.out.println("Square = " + n * n);
    }
}

class Thread3 extends Thread {
    int n;

    public Thread3(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        System.out.println("Cube = " + n * n * n);
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.run();
    }
}