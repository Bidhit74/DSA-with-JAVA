public class LinkedListIntro {

    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
    // Linked list access karne ke liye Methods banayenge
    // Time complexity: O(1)
    public void addFirst(int data) {
        // Step 1: Create a new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2: Update the new node's next pointer to the current head
        newNode.next = head; // Link
        // Step 3: head is now the new node
        head = newNode;
    }
    // Time complexity: O(1)
    public void addLast(int data) {
        // Step 1: Create a new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2: Update the tail node's next pointer to the new node
        tail.next = newNode; // Link
        // Step 3: Update the tail to the new node
        tail = newNode;
    }
    // Time Complexity : O(n)
    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // Add in the Middle index
    // Time Complexity : O(n)
    public void addAtMiddle(int index, int data) {
        Node newNode = new Node(data);
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node temp = head;
        size++;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        // i = index - 1, temp = previous
        newNode.next = temp.next;
        temp.next = newNode; 
    }
    public static void main(String[] args) {
        LinkedListIntro l1 = new LinkedListIntro();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addLast(3);
        l1.addAtMiddle(0, 5);
        l1.addAtMiddle(2, 8);
        l1.printLinkedList();
        // System.out.println(l1.size);
        System.out.println(LinkedListIntro.size);
    }
}
