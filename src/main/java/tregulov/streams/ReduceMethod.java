package tregulov.streams;

import java.util.*;

public class ReduceMethod {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};

        System.out.println(Arrays.stream(array).sum()); // 26
        System.out.println(Arrays.stream(array).average().orElse(Double.NaN)); // 5.2

        int product = Arrays.stream(array).reduce(1, (acc, el) -> acc * el);
        System.out.println(product); // 1080

        List<Integer> list = new ArrayList<>(List.of(5, 9, 3, 8, 1));

        System.out.println(list.stream().mapToInt(Integer::intValue).sum()); // 26
        System.out.println(list.stream().mapToDouble(Integer::doubleValue).average().orElse(Double.NaN)); // 5.2

        int prod = list.stream().reduce((acc, el) -> acc * el).get();
        System.out.println(prod); // 1080
        System.out.println();

        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        Optional<Integer> optional = list1.stream().reduce((acc, el) -> acc * el);
        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("Not present"); // Not present
        }
    }
}
