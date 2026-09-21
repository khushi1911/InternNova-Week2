import java.util.Scanner;

public class Task3_MethodCalculator {

    // Method for addition
    static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    static double divide(double a, double b) {
        return a / b;
    }

    // Method for modulus
    static double modulus(double a, double b) {
        return a % b;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("\n--- Calculator Results ---");
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
        System.out.println("Modulus: " + modulus(num1, num2));

        sc.close();
    }
}