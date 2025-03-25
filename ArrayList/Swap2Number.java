// Swap 2 Numbers
// list = 2, 5, 9, 3, 6;  --> index --> idx1 = 1, idx2 = 3
// Output : 2, 3, 9, 5, 6

import java.util.ArrayList;
import java.util.List;

public class Swap2Number {
    public static void main(String[] args) {
        ArrayList<Integer> listNum = new ArrayList<Integer>(List.of(5, 9, 10, 20, 25));
        int idx1 = 1, idx2 = 3;

        System.out.println(listNum);
        //swap
        int temp = listNum.get(idx1);
        listNum.set(idx1, listNum.get(idx2));
        listNum.set(idx2, temp);
        System.out.println(listNum);


    }
}
