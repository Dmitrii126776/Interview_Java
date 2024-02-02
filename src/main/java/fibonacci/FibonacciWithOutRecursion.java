package fibonacci;

import java.util.Scanner;

public class FibonacciWithOutRecursion {
    public static void main(String[] args) {
//        int number = 10;
//        System.out.println(fibonacci(number));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        System.out.println("Fibonacci number is : " + fibonacci(number));

    }

    public static int fibonacci(int n) {
        if (n < 2) return n;
        int prev1 = 1, prev2 = 0;
        for (int i = 2; i < n; i++) {
            int temp = prev1;
            prev1 = prev1 + prev2;
            prev2 = temp;
        }
        return prev1 + prev2;
    }
}
