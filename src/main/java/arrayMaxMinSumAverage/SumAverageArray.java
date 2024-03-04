package arrayMaxMinSumAverage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumAverageArray {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
        int sum = Arrays.stream(array).sum();
        double average = Arrays.stream(array).average().orElse(Double.NaN);
//        double average = Arrays.stream(array).average().getAsDouble();
        System.out.println(sum + " " + average); // 26 5.2

        // convert array to arrayList
        List<Integer> list = new ArrayList<>(
                Arrays.asList(Arrays.stream(array).boxed().toArray(Integer[]::new))
        );

        int sumList = list.stream().mapToInt(Integer::intValue).sum();
        double averageList = list.stream().mapToDouble(Integer::doubleValue)
                .average().orElse(Double.NaN);
        System.out.println(sumList + " " + averageList); // 26 5.2

        int sumReduce = list.stream().reduce(Integer::sum).get();
        double result = (double) sumReduce / list.size();
        System.out.println(sumReduce + " " + result); // 26 5.2

        int prod = list.stream().reduce((acc, el) -> acc * el).get();
        System.out.println(prod); // 1080
    }
}
