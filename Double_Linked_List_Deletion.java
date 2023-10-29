import java.util.Scanner;
class Node {
    int data;
    Node prev, next;
    public Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}
class DoublyLinkedList {
    Node head, tail;
    public DoublyLinkedList() {
        head = tail = null;
    }
    void insert(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }
    Boolean delete(int val) {
        Boolean del = false;
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                del = true;
                if (head == tail) {
                    head = tail = null;
                    return del;
                }
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
        DoublyLinkedList dLL = new DoublyLinkedList();
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
            dLL.insert(a);
        }
        System.out.println("Doubly Linked List formed:");
        dLL.traverse(dLL.head);
        System.out.print("Enter a value to delete: ");
        int x = input.nextInt();
        Boolean del = dLL.delete(x);
        if (del) {
            System.out.println("List after deletion:");
            if (dLL.head != null)
                dLL.traverse(dLL.head);
            else
                System.out.println("List Empty");
        } else
            System.out.println("Value not found");
        input.close();
    }
}
