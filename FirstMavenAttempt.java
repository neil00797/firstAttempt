import java.util.Scanner;

public class FirstMavenAttempt{
    static Scanner input = new Scanner(System.in);

    public static void FirstMavenAttempt(String[] args) {
        System.out.println("Enter Num 1: ");
        double num1 = input.nextLine();
        System.out.println("Enter Num 2: ");
        double num2 = input.nextLine();
        double total = num1 + num2;

        System.out.println(num1 + " + " + num2 " = " total);
    }
}