package sortArray;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {7, 2, 9, 5, 4, 8, 1, 6, 3};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
}
