package arrayMaxMinSumAverage;

import java.util.*;
import java.util.stream.Collectors;

public class TwoMaxTwoMin {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 4, 5, 1, 3, 1};
        twoMaxOfArray(array);
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(5, 2, 3, 4, 5, 1, 3, 5));
        twoMinOfArrayList(arrayList);

        System.out.println(Arrays.toString(Arrays.stream(array).distinct().toArray()));
    }

    private static void twoMaxOfArray(int[] array) {
        int max = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max2 = max;
                max = array[i];
            } else if (array[i] > max2 && array[i] != max) {
                max2 = array[i];
            }
        }
        System.out.println("max is: " + max + ", max2 is: " + max2);
    }

    private static void twoMinOfArrayList(ArrayList<Integer> arrayList) {
        List<Integer> naturalOrder = arrayList.stream()
                .distinct()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println("min is: " + naturalOrder.get(0) + ", min2 is: " + naturalOrder.get(1));
    }
}
