package findVowels;

public class FindVowelsByConvertToArray {
    public static void main(String[] args) {
        String str = "Array of Chars";

        System.out.println(findVowels1(str)); // "aaoa"

        System.out.println(findVowels2(str)); // "aaoa"
        System.out.println(findVowels2("Array of Strings")); // "aaoi"
    }


    // convert string to array of chars
    private static String findVowels1(String str) {
        char[] charArray = str.toLowerCase().toCharArray();
        StringBuilder result = new StringBuilder();
        for (char el : charArray) {
            if (el == 'a' || el == 'e' || el == 'u' || el == 'i' || el == 'o')
                result.append(el);
        }
        return result.toString();
    }

    // convert string to array of strings
    private static String findVowels2(String str) {
        String vowels = "aeiou";
        String[] strings = str.toLowerCase().split("");
        StringBuilder result = new StringBuilder();
        for (String el : strings) {
            if (vowels.contains(el))
                result.append(el);
        }
        return result.toString();
    }
}
