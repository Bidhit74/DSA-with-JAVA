public class DoublyLL {

    public class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
    
    public void addFirst(int data) {
        // Step 1: Create Node
        Node newNode = new Node(data);
        size++;
        //Base Case
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //Step 2: Link
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }
    //Print Doubly LL
    public void print() {
        Node temp = head;
        if (head != null) {
            System.out.print("null<-->");
        }
        while (temp != null) {
            System.out.print(temp.data + "<-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

        // Remove First Element
        public void removeFirst() {
            if (size == 0 || head == null) {
                System.out.println("Doubly Linked List is Empty.");
                return;
            } else if (size == 1) {
                head = tail = null;
                size--;
                return;
            }
            head = head.next;
            head.prev = null;
            size--;
        }
        // Add Last Element
        public void addLast(int data) {
            // Step 1: create Node
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        // Remove Last Element
        public void removeLast() {
            if (size == 0 || head == null) {
                System.out.println("Doubly Linked List is Empty.");
                return;
            } else if (size == 1) {
                head = tail = null;
                size--;
                return;
            }
            tail = tail.prev;
            tail.next = null;
            size--;
        }
        
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println(size);
        dll.addLast(6);
        dll.print();
        System.out.println(size);
        dll.removeLast();
        dll.print();
        System.out.println(size);
        
        
    }
}
