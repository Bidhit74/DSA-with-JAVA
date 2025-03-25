import java.util.ArrayList;
public class ArrayListIntro {
    public static void main(String[] args) {
        // ArrayList is part of the Java Collections Framework
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list.add(10);
        list2.add("Hello");
        System.out.println(list2);
        // Operations Perform in ArrayList
        // Add Elements  --> Time Complexity -- O(1)
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        // Another Add Elements with indexes : Time Complexity -- O(n)
        list.add(1, 50);
        System.out.println(list);

        // Get Elements  --> Time Complexity -- O(1)
        int element = list.get(2);
        System.out.println(element);

        // Update Elements --> Time Complexity -- O(n)
        list.set(2, 25);
        System.out.println(list);

        // Remove Elements --> Time Complexity -- O(n)
        list.remove(2);
        System.out.println(list);

        // Contains Elements --> Time Complexity -- O(n)
        
        System.out.println(list.contains(20));

        // Size of ArrayList --> Time Complexity -- O(1)
        System.out.println(list.size());

        // Check if ArrayList is Empty --> Time Complexity -- O(1)
        System.out.println(list.isEmpty());

        // Clear ArrayList --> Time Complexity -- O(1)
        list.clear();
        System.out.println(list);
    }
}
