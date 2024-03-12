package palindrome;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1234321)); // 1234321 true
        System.out.println(isPalindrome(1234567)); // 7654321 false
    }

    public static boolean isPalindrome(int num) {
        int last = 0, temp = num;
        while (num > 0) {
            last = last * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(last);
        return last == temp;
    }
}
