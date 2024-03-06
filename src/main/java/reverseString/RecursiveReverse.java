package reverseString;

public class RecursiveReverse {
    public static void main(String[] args) {
        String string = "Recursive";
        System.out.println(recursiveReverse(string));

        String reversed = new StringBuilder(string).reverse().toString();
        System.out.println(reversed);
    }

    private static String recursiveReverse(String str) {
        if (str.isEmpty()) return str;
        return recursiveReverse(str.substring(1)) + str.charAt(0);
//        return recursiveReverse(str.substring(1)) + str.substring(0,1).toUpperCase();
    }
}
