package tregulov.streams;

import java.util.*;
import java.util.stream.Collectors;

public class MapMethod {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
        System.out.println(Arrays.toString(array)); // [5, 9, 3, 8, 1]
        int[] numbers = Arrays.stream(array)
                .map(el -> {
                    if (el % 3 == 0) {
                        el = el / 3;
                    }
                    return el;
                }).toArray();

        System.out.println(Arrays.toString(numbers)); // [5, 3, 1, 8, 1]

        ArrayList<String> arrayList = new ArrayList<>(List.of("Jim", "Alice", "Bob", "Mike"));
        System.out.println(arrayList); // [Jim, Alice, Bob, Mike]

        //        for (int i = 0; i < arrayList.size(); i++) {
        //            arrayList.set(i, String.valueOf(arrayList.get(i).length()));
        //        }

        ArrayList<Integer> result = (ArrayList<Integer>) arrayList.stream().map(el -> el.length())
                .collect(Collectors.toList());
        System.out.println(result);  // [3, 5, 3, 4]
        arrayList.replaceAll(s -> String.valueOf(s.length()));
        System.out.println(arrayList);

        Set<String> set = new TreeSet<>(Set.of("Jim", "Alice", "Bob", "Mike", "Helen"));
        System.out.println(set); // [Alice, Bob, Helen, Jim, Mike]
        Set<Integer> length = set.stream()
                .map(el -> el.length())
                .collect(Collectors.toSet());
        System.out.println(length); // [3, 4, 5]

        List<Integer> list = set.stream()
                .map(el -> el.length())
                .collect(Collectors.toList());
        System.out.println(list); // [5, 3, 5, 3, 4]
    }
}
