package tregulov.streams;

import java.util.Arrays;

public class ChainingMethod {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
//        int[] arr = Arrays.stream(array).filter(el -> el % 2 == 1  && el % 3 == 0).toArray();
        int[] arr = Arrays.stream(array)
                .filter(el -> el % 2 == 1)
                .map(el -> {
                    if (el % 3 == 0) {
                        el = el / 3;
                    }
                    return el;
                }).toArray();
        System.out.println(Arrays.toString(arr)); // [1, 1, 5, 3, 7, 27, 7]

        int result = Arrays.stream(array)
                .filter(el -> el % 2 == 1)
                .map(el -> {
                    if (el % 3 == 0) {
                        el = el / 3;
                    }
                    return el;
                })
                .sum();//reduce((acc, el) -> acc + el).getAsInt();


        System.out.println(result); // 51
    }
}
