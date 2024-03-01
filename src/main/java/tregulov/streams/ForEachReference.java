package tregulov.streams;

import java.util.Arrays;

public class ForEachReference {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
//        Arrays.stream(array).forEach(el -> System.out.print(el));
        Arrays.stream(array).forEach(System.out::print);
        System.out.println();

        Arrays.stream(array).forEach(el -> {
            el *= 2;
            System.out.print(el + " "); // 10 18 6 16 2
        });
        System.out.println();

//        Arrays.stream(array).forEach(el -> Utils.MyMethod(el));
        Arrays.stream(array).forEach(Utils::MyMethod);
    }

    static class Utils {
        public static void MyMethod(int num) {
            num = num + 5;
            System.out.println("element = " + num);
        }
    }
}
