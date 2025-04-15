import java.util.LinkedList; // JCF --> Optimized
public class CollectionFramework {
    public static void main(String[] args) {
        //Create Linked List
        LinkedList<Integer> ll = new LinkedList<>();

        //Add Linked List
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addFirst(2);
        ll.add(0, 1);

        System.err.println(ll);

        //Remove Linked List
        ll.remove();
        System.err.println(ll);
        ll.removeLast();
        System.err.println(ll);
        ll.removeFirst();
        System.err.println(ll);
        ll.remove(1);
        System.err.println(ll);
        
    }
}
