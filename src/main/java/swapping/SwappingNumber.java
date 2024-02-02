package swapping;

public class SwappingNumber {
    public static void main(String[] args) {
        int first = 7777;
        int second = 8888;
        swappingNumbers(first, second);
        swapping(first, second);
    }

    public static void swappingNumbers(int a, int b) {
        a = a - b;
        b = a + b;
        a = b - a;
        System.out.println("first is " + a);
        System.out.println("second is " + b);
    }

    public static void swapping(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("first is " + a);
        System.out.println("second is " + b);
    }

}
