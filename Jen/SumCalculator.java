import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1;
        if (scanner.hasNextDouble()) {
            num1 = scanner.nextDouble();
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
            return;
        }

        System.out.print("Enter the second number: ");
        double num2;
        if (scanner.hasNextDouble()) {
            num2 = scanner.nextDouble();
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
            return;
        }

        double sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        scanner.close();
    }
}

