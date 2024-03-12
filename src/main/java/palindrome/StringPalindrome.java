package palindrome;

public class StringPalindrome {
    public static void main(String[] args) {
        String string = "Madam I'm Adam";
        string = string.toLowerCase().replaceAll("[^a-z]", "");
//        string = string.toLowerCase().replaceAll("\\W", "");
        System.out.println(string); // madamimadam

        String reversed = new StringBuilder(string).reverse().toString();
        System.out.println(reversed.equals(string)); // true

        System.out.println(isPalindrome(string)); // true
    }

    private static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
        }
        return true;
    }
}
