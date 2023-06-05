import java.util.Scanner;

public class t4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Even numbers from 0 to " + number + ":");
        printEvenNumbers(0, number);

        System.out.println("\nOdd numbers from 0 to " + number + ":");
        printOddNumbers(0, number);
    }

    public static void printEvenNumbers(int current, int n) {
        if (current <= n) {
            if (current % 2 == 0) {
                System.out.print(current + " ");
            }
            printEvenNumbers(current + 1, n);
        }
    }

    public static void printOddNumbers(int current, int n) {
        if (current <= n) {
            if (current % 2 != 0) {
                System.out.print(current + " ");
            }
            printOddNumbers(current + 1, n);
        }
    }
}
