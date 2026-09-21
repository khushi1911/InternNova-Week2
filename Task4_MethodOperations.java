import java.util.Scanner;

public class Task4_MethodOperations {

    // Method to find square
    static double square(double num) {
        return num * num;
    }

    // Method to find cube
    static double cube(double num) {
        return num * num * num;
    }

    // Method to find average of three numbers
    static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // Method to find maximum of two numbers
    static double maximum(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for square and cube: ");
        double num = sc.nextDouble();

        System.out.print("Enter first number for average: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number for average: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter third number for average: ");
        double num3 = sc.nextDouble();

        System.out.print("Enter first number for maximum: ");
        double max1 = sc.nextDouble();

        System.out.print("Enter second number for maximum: ");
        double max2 = sc.nextDouble();

        System.out.println("\n--- Method Results ---");
        System.out.println("Square: " + square(num));
        System.out.println("Cube: " + cube(num));
        System.out.println("Average: " + average(num1, num2, num3));
        System.out.println("Maximum: " + maximum(max1, max2));

        sc.close();
    }
}