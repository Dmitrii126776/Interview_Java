package tregulov.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedMethod {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 6};
        arr = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(arr));

        int[] array = {5, 9, 3, 8, 1};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array)); // [1, 3, 5, 8, 9]


        ArrayList<Integer> list = new ArrayList<>(List.of(5, 9, 3, 8, 1, 5, 1));
//        list.sort(Comparator.reverseOrder());
        list.sort(Comparator.naturalOrder());
        System.out.println(list); // 9, 8, 5, 3, 1]
    }
}
