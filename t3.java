import java.util.Scanner;
public class t3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Number series from " + number + " to 1 and then back to " + number + ":");
        printNumberSeries(number);
    }

    public static void printNumberSeries(int n) {
        if (n >= 1) {
            System.out.print(n + " ");
            printNumberSeries(n - 1);
            System.out.print(n + " ");
        }
    }
}
