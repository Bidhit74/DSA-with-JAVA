public class MergeSortLL {
    
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private static Node mergeLL(Node head1, Node head2) {
        Node mergeLinkList = new Node(-1);
        Node temp = mergeLinkList;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        // bache hua element ko add karne ke liye
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergeLinkList.next; // -1 ko hatane ke liye next ka use kiye hai
    }

    public static Node mergeSortLL(Node head) {
        //Base case 
        if(head == null || head.next == null){
            return head;
        }
        //1. Find Mid
        Node mid = getMid(head);
        //2. left and Right --> MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSortLL(head); // left half
        Node newRight = mergeSortLL(rightHead); // right half

        //3. Merge
        return mergeLL(newLeft,newRight);
    }
    public static void main(String[] args) {
        MergeSortLL ll = new MergeSortLL();
        ll.addLast(5);
        ll.addLast(4); 
        ll.addLast(3); 
        ll.addLast(2); 
        ll.addLast(1);
        printList(head);
        head = mergeSortLL(head);
        printList(head);

    }
}
