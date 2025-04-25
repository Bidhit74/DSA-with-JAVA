// Question : Zig-Zag Linked List
// (1)->(2)->(3)->(4)->(5)
// Convert Zig-Zag
// (1)->(5)->(2)->(4)->(3)

// Approach
// Step 1: Find Mid node
// Step 2: 2nd Half Reverse
// Step 3: Alternate Merging

public class ZigZagLL {

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

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    // Find mid 
    public Node getMid(Node head) {
        Node fast = head.next;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void zigZagll() {
        //Base Case
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        // Step 1: Find Mid node
        Node midNode = getMid(head);

        // Step 2: 2nd Half Reverse
        Node prev = null;
        Node curr = midNode;
        Node newNext;
        while (curr != null) {
            newNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newNext;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        // Step 3: Alternate Merging
        while (left != null && right != null) {
            //Convert Zig-zag 
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            //Update
            left = nextL;
            right = nextR;
        }

    } 
    public static void main(String[] args) {
        ZigZagLL ll = new ZigZagLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.print();
        ll.zigZagll();
        ll.print();
        
    }
}
