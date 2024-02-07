package reverseArray;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(reverseByReverse(array));
    }

    private static ArrayList<Integer> reverseByReverse(int[] arr) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i : arr) {
            array.add(i);
        }
        Collections.reverse(array);
        return array;
    }
}
