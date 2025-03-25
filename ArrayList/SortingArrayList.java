import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> listNum = new ArrayList<Integer>(List.of(35, 9, 40, 20, 25));
        
        // Sorting ArrayList in ascending order 
        System.out.println(listNum);
        Collections.sort(listNum);
        System.out.println(listNum);

        // Sorting ArrayList in descending order
        
        Collections.sort(listNum, Collections.reverseOrder());
        // Comparator -- fnx logic
        System.out.println(listNum);

    }
}