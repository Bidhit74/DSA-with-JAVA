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

    // Linked list access karne ke liye Methods banayenge
    // Add(), remove(), print(), search()

    // Time complexity: O(1)
    public void addFirst(int data) {
        // Step 1: Create a new node
        Node newNode = new Node(data);
        if (head == null) {
            // head = newNode;
            // tail = newNode; // If list is empty, both head and tail are new node
            // or
            head = tail = newNode;
        }
        // Step 2: Update the new node's next pointer to the current head
        newNode.next = head; // Link
        // Step 3: head is now the new node
        head = newNode;

    }
    public static void main(String[] args) {
        LinkedListIntro l1 = new LinkedListIntro();
        l1.addFirst(1);
        l1.addFirst(2);
    }
}
