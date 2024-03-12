package reverseString;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseStringUsingArray {
    public static void main(String[] args) {
        String string = "Reverse string using Array";
        System.out.println(string);
        // Reverse string using Array

        System.out.println(reverseStringUsingArray(string));
        // esreveR gnirts gnisu yarrA

        String reversed = reverseStringUsingArrayList(string);
        System.out.println(reversed);
        // esreveR gnirts gnisu yarrA
    }

    public static String reverseSingleString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    private static String reverseStringUsingArray(String str) {
        String[] array = str.split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = reverseSingleString(array[i]);
        }
        return String.join(" ", array);
    }

    public static String reverseStringUsingArrayList(String str) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
//        list.replaceAll(ReverseStringUsingArray::reverseSingleString);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, reverseSingleString(list.get(i)));
        }
        return String.join(" ", list);
    }
}
