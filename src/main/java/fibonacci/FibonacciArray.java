package fibonacci;

import java.util.Arrays;

public class FibonacciArray {
    public static void main(String[] args) {
        int number = 10;
        int[] array = fibonacci(number);
        System.out.println(Arrays.toString(array));
        System.out.println(fibonacciNumber(array));
    }

    public static int[] fibonacci(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }

    public static int fibonacciNumber(int[] arr) {
        return arr[arr.length - 1];
    }
}
