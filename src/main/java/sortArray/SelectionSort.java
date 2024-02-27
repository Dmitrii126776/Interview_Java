package sortArray;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {4, 3, 2, 6, 7, 8, 1};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int middle = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[middle] < arr[j]) {
                    middle = j;
                }
            }
            swap(i, middle, arr);
        }
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
