package reverseArray;

import java.util.Arrays;

public class RecursiveReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverseArrayRecursive(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void reverseArrayRecursive(int[] arr, int start, int end) {
        if (start >= end) return;
        // Swap elements at start and end indices
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        // Recursive call for the remaining elements
        reverseArrayRecursive(arr, start + 1, end - 1);
    }
}
