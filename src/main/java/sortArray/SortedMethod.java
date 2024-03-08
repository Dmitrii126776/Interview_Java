package sortArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethod {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 6};

        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
        System.out.println(Arrays.toString(sorted)); // [2, 3, 5, 6, 8]

        arr = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(arr)); // [2, 3, 5, 6, 8]

        int[] array = {5, 9, 3, 8, 1};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array)); // [1, 3, 5, 8, 9]


        ArrayList<Integer> arrayList = new ArrayList<>(List.of(5, 9, 3, 8, 1, 5, 1));
        arrayList.sort(Comparator.naturalOrder());
//        arrayList.sort(Comparator.reverseOrder());
        System.out.println(arrayList); // [1, 1, 3, 5, 5, 8, 9]

        arrayList = (ArrayList<Integer>) arrayList.stream().distinct().collect(Collectors.toList());
        System.out.println(arrayList); // [1, 3, 5, 8, 9]

        List<Integer> list = arrayList.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(list); // [9, 8, 5, 3, 1]

    }
}
