package tregulov.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Intermediate methods(lazy) ->  filter map sorted distinct peek limit skip flatMap mapToInt
// Terminal methods -> forEach reduce sum collect partitioningBy groupingBy count findFirst min max
// concat
public class ConcatDistinctTerminalIntermediateMethods {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);

//        stream.filter(el -> {
//            System.out.println("!!!");
//            return el % 2 == 0;
//        }).collect(Collectors.toList());

        Stream<Integer> stream2 = Stream.of(6, 7, 8, 9);
        Stream<Integer> stream3 = Stream.concat(stream1, stream2);

//        System.out.println(Arrays.toString(stream3.toArray()));
        stream3.forEach(System.out::print); // 123456789
        System.out.println();

        Stream<Integer> stream4 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        stream4.distinct().forEach(System.out::print); // 12345

        System.out.println();
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 1, 2, 3));
        List<Integer> result = list.stream().distinct().collect(Collectors.toList());
        System.out.println(result); // [1, 2, 3, 4, 5]
    }

}
