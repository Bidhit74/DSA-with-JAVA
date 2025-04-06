// Check if the LinkedList is a palindrome.
// 1221 , 1441


public class CheckPalindrome {

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

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    // Slow - Fast techniques
    public Node getMidNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // this is middle node
    }

    public boolean isPalindrome() {
        // Base Case
        if (head == null || head.next == null) {
            return true;
        }
        // Step - 1 : Find middle node
        Node middleNode = getMidNode(head);

        // Step 2 : Reverse 2nd half of linked list
        Node prev = null;
        Node curr = middleNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half ka head
        Node left = head; // left half ka head

        // Step 3 : CHeck left half and right half is equal 
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        CheckPalindrome ll = new CheckPalindrome();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println(ll.isPalindrome());
        ll.print();
    }
}