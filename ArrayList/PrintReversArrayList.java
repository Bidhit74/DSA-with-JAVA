// Print reverse of an ArrayList
// List = 1, 2, 3, 4, 5, 
// Output = 5, 4, 3, 2, 1
import java.util.ArrayList;
import java.util.Collections;
// import java.util.List;

public class PrintReversArrayList {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // or
        // ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        
        // or
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);

        System.out.println(list);

        for (int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }

    }
}
