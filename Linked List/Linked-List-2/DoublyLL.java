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

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        System.out.println(size);
        dll.print();
    }
}
