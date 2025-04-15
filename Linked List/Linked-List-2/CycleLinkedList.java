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

    // Remove a Loop/Cycle in a LL.
    public static void removeCycle(){
        // detect the cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
                if(slow==fast){
                    cycle = true;
                    break;
                }
        }
        if(!cycle) return;

        // find meeting point
        slow = head;
        Node prev = null; // last node
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //remove cycle --> last.next = null
        prev.next = null;
    }
    

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        // 1 --> 2 --> 3 --> 2

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
        

    }
}