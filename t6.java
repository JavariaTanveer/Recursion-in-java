import java.util.Scanner;
public class t6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int sum = calculateSum(number);
        System.out.println("Sum of numbers from 0 to " + number + " is: " + sum);
    }

    public static int calculateSum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + calculateSum(n - 1);
        }
    }
}
