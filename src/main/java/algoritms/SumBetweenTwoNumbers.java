package algoritms;

public class SumBetweenTwoNumbers {
    public static void main(String[] args) {
        System.out.println(sumBetween(5, 10)); // 45
        System.out.println(sumBetween(1, 5)); // 15

        System.out.println(sumWithLoop(5, 10)); // 45
        System.out.println(sumWithLoop(1, 5)); // 15
    }

    private static int sumBetween(int start, int end) {
        if (end <= start) return end;
        return end + sumBetween(start, end - 1);
    }

    private static int sumWithLoop(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

}
