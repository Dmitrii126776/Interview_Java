package fibonacci;

import java.util.ArrayList;
import java.util.Arrays;

public class FibonacciArrayList {
    public static void main(String[] args) {
        int number = 10;
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(0, 1));
        System.out.println(fibonacciList(array, number));
        System.out.println(fibonacciNumber(array, number));
    }

    public static ArrayList<Integer> fibonacciList(ArrayList<Integer> arr, int n) {
        for (int i = 2; i <= n; i++) {
            arr.add(arr.get(i - 1) + arr.get(i - 2));
        }
        return arr;
    }

//    public static Integer fibonacciNumber(ArrayList<Integer> arr, int n) {
//        return arr.get(n);
//    }

    public static Integer fibonacciNumber(ArrayList<Integer> arr, int n) {
        for (int i = 2; i <= n; i++) {
            arr.add(arr.get(i - 1) + arr.get(i - 2));
        }
        return arr.get(n);
    }
}
