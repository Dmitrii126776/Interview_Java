package tregulov.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class CountPeekMethod {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3};
        long count = Arrays.stream(array).count();
        System.out.println(count); // 8

        // unique elements
        String[] strings = {"a", "b", "c", "d", "e", "a", "b", "c"};
        long counter = Arrays.stream(strings).distinct().count();
        System.out.println(counter); // 5

        long peekCount = Arrays.stream(strings).distinct().peek(e -> System.out.print(e + " ")).count();
        System.out.println(peekCount); // a b c d e 5

        Stream<String> stream = Stream.of("a", "b", "c", "d", "e", "a", "b", "c");
        System.out.println(stream.distinct().peek(System.out::println).count());


    }
}
