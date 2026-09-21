import java.util.Scanner;

public class Task1_StudentResult {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks for Subject 1: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int mark3 = sc.nextInt();

        int total = mark1 + mark2 + mark3;
        double percentage = total / 3.0;

        String result;

        if (percentage >= 40) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        System.out.println("\n--- Student Result ---");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);

        sc.close();
    }
}