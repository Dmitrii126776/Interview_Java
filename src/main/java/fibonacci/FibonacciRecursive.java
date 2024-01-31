package fibonacci;

import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
//        int number = 11;
//        System.out.println(fibonacci(number));
        System.out.println("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Fibonacci Number is: " + fibonacci(number));
    }

    public static int fibonacci(int n) {
        if (n < 2) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
