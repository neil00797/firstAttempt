import java.util.Scanner;

public class FirstMavenAttempt{
    static Scanner input = new Scanner(System.in);

    public static void FirstMavenAttempt(String[] args) {
        System.out.println("Enter Num 1: ");// First number for addition
        double num1 = input.nextLine();
        System.out.println("Enter Num 2: ");//Second number for addition
        double num2 = input.nextLine();
        double total = num1 + num2;

        System.out.println(num1 + " + " + num2 " = " total); // Adition calculation
    }
}