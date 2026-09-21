public class Task2_NumberPractice {

    public static void main(String[] args) {

        // Print numbers from 1 to 100
        System.out.println("--- Numbers from 1 to 100 ---");

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }

        // Print even numbers
        System.out.println("\n\n--- Even Numbers ---");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        // Print odd numbers
        System.out.println("\n\n--- Odd Numbers ---");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        // Calculate sum
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }

        System.out.println("\n\n--- Sum of Numbers ---");
        System.out.println("Sum from 1 to 100: " + sum);
    }
}