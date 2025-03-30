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
    
    // Time complexity : O(1)
    public int removeFirst() {
        if (size == 0) {
            System.out.println("List is empty");
            return -1;
        } else if (size == 1) {
            int data = head.data;
            head = tail = null;
            size = 0;
            return data;
        }
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }
    
    // Time complexity : O(n)
    public int removeLast() {
        if (size == 0) {
            System.out.println("List is empty");
            return -1;
        } else if (size == 1) {
            int val = tail.data;
            head = tail = null;
            size--;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        // last tail index previous index = prev
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    // Time complexity : O(n)
    public int itrSearch(int key) {
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.data == key) { // key found
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        //key not found
        return -1;
    }

    // Time complexity and Space Complexity: O(n)
    public int recSearchHelper(Node head, int key) { 
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = recSearchHelper(head.next, key);
        if (idx == -1) { // key not found
            return -1;
        }
        // key found
        return idx + 1;
    }
    public int recSearch(int key) {
        return recSearchHelper(head, key);
    }
    public static void main(String[] args) {
        LinkedListIntro l1 = new LinkedListIntro();
        // l1.addFirst(1);
        l1.addFirst(5);
        l1.addFirst(4);
        l1.addFirst(3);
        l1.addFirst(2);
        l1.addFirst(1);
        l1.printLinkedList();
        System.out.println(l1.itrSearch(6)); 
        System.out.println(l1.recSearch(6)); 
        System.out.println(l1.recSearch(5)); 
    }
}
