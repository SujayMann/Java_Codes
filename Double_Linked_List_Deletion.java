import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    void insert(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    Boolean delete(int val) {
        Boolean del = false;
        Node temp = head;
        if (head == tail) {
            head = tail = null;
            return true;
        }
        while (temp != null) {
            if (temp.data == val) {
                del = true;
                if(temp == head)
                    head = head.next;
                else if(temp == tail)
                    tail.prev.next = null;
                else{
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
            }
            temp = temp.next;
        }
        return del;
    }

    void traverse(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}

public class Double_Linked_List_Deletion {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of nodes in list: ");
        int n = input.nextInt();
        while (n <= 0) {
            System.out.println("Enter 1 or more number of nodes");
            n = input.nextInt();
        }
        System.out.println("Enter values in list:");
        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            doublyLinkedList.insert(a);
        }
        System.out.println("Doubly Linked List formed:");
        doublyLinkedList.traverse(doublyLinkedList.head);
        System.out.print("Enter a value to delete: ");
        int x = input.nextInt();
        Boolean del = doublyLinkedList.delete(x);
        if (del) {
            System.out.println("After deletion:");
            if (doublyLinkedList.head != null)
                doublyLinkedList.traverse(doublyLinkedList.head);
            else
                System.out.println("List Empty");
        } else
            System.out.println("Value not found");
        input.close();
    }
}