package reverseArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ConvertToArrayList {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(convertByStream(array));
        System.out.println(convertByForLoop(array));
        // [9, 8, 7, 6, 5, 4, 3, 2, 1]
    }

    private static ArrayList<Integer> convertByStream(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(
                Arrays.stream(arr).boxed().toArray(Integer[]::new)
        ));
        Collections.reverse(arrayList);
        return arrayList;
    }

    private static ArrayList<Integer> convertByForLoop(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : arr) {
            arrayList.add(i);
        }
        Collections.reverse(arrayList);
        return arrayList;
    }
}
