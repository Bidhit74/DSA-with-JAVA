public class CircularSinglyLL {
    //Singly Circular Linked List:
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;

    // Add at beginning : TC = O(1)
    static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head; // point to itself
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; // point last to head
        }
    }

    // Add at end TC --> O(1)
    static void addEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Add at index :  TC --> O(n)
    static void addAtIndex(int index, int data) {
        Node newNode = new Node(data);
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node temp = head;
        for (int i = 0; (i < index-1 && temp.next != head); i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        if (temp == tail) {
            newNode = tail;
        }
    }
    // Print Linked List
    static void printLinkedList() {
        if (head == null) {
            System.out.println("Linked List is Empty!!!");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.err.println();
        
    }


    public static void main(String[] args) {
        CircularSinglyLL cll = new CircularSinglyLL();
        cll.addFirst(5);
        cll.addFirst(3);
        cll.addFirst(1);
        cll.printLinkedList();
        cll.addEnd(7);
        cll.printLinkedList();
        cll.addAtIndex(0, 8);
        cll.addAtIndex(2, 8);
        cll.addAtIndex(5, 8);
        cll.printLinkedList();
    }
}