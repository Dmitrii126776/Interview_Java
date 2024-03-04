package arrayMaxMinSumAverage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
        // best way for array
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        System.out.println(max + " " + min); // 9 1

        int maxToInt = (int) Arrays.stream(array).mapToDouble(e -> e).max().orElse(Double.NaN);
        System.out.println(maxToInt); // 9
        long minToInt = (int) Arrays.stream(array).mapToLong(el -> el).min().getAsLong();
        System.out.println(minToInt); // 1

        // convert array to arrayList
        ArrayList<Integer> arrayList = new ArrayList<>
                (Arrays.asList(Arrays.stream(array).boxed().toArray(Integer[]::new)));

        Integer maxInt = arrayList.stream().max(Comparator.naturalOrder()).orElse(null);
//        Integer maxInt = arrayList.stream().max(Comparator.naturalOrder()).orElse(Integer.MIN_VALUE);
        System.out.println(maxInt); // 9

        int minInt = arrayList.stream().mapToInt(el -> el).min().getAsInt();
        System.out.println(minInt); // 1
    }
}
