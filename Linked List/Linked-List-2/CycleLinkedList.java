// Detect a Loop/Cycle in a Linked List

// Floyd's cycle finding algorithm
// slow-fast algorithm --> two pointer approach

// Moves       --->   Distance
// 0           --->   0
// 1           --->   1
// 2           --->   2
// 3           --->   3
// .           --->   .
// n           --->   d

public class CycleLinkedList {

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

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    // Detect Cycle/loop in a ll.
    // This is Floyd’s Cycle Detection Algorithm (also called the Tortoise and Hare algorithm).
    // Time Complexity : O(n)
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2

            if (slow == fast) { // cycle exist
                return true;
            }
        }
        // cycle does not exist
        return false;
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        // 1 --> 2 --> 3 --> 1

        System.out.println(isCycle());

    }
}