package reverseString;

public class ReverseString {
    public static void main(String[] args) {
        String string = "Method";
        System.out.println(reverseString(string));
        System.out.println(reverseString2(string));

        String reversed = new StringBuilder(string).reverse().toString();
        System.out.println(reversed);
    }

    public static String reverseString(String string) {
        StringBuilder reversed = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            reversed.append(string.charAt(i));
        }
        return reversed.toString();
    }

    public static String reverseString2(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        return new StringBuilder(string).reverse().toString();
    }
}
