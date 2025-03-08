import java.util.Scanner;
import java.lang.Math;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        double result = 0;

        switch (choice) {
            case 1:
                result = Math.addExact(num1, num2);
                break;
            case 2:
                result = Math.subtractExact(num1, num2);
                break;
            case 3:
                result = Math.multiplyExact(num1, num2);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                result = (double) num1 / num2;
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Result: " + result);
    }
}
