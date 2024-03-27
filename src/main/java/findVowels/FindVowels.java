package findVowels;

public class FindVowels {
    public static void main(String[] args) {
        String str = "Array of Integer";
        String result = str.toLowerCase().replaceAll("[^aeuio]", "");
        System.out.println(result); // "aaoiee"

        System.out.println(findVowels("Array of Strings")); // "aaoi"
        System.out.println(findVowels(str)); // "aaoiee"
    }

    private static String findVowels(String str) {
        str = str.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' | str.charAt(i) == 'e'
                    | str.charAt(i) == 'u' | str.charAt(i) == 'i'
                    | str.charAt(i) == 'o'
            )
                result.append(str.charAt(i));
        }
        return result.toString();
    }
}
