import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculations calculations = new Calculations();

        int selection;

        while (true) {
            System.out.println("\n1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division\n0 - Exit");
            System.out.print("Select the calculation you want to do: ");
            selection = input.nextInt();

            if (selection == 1) {
                calculations.Addition();
            } else if (selection == 2) {
                calculations.Subtraction();
            } else if (selection == 3) {
                calculations.Multiplication();
            } else if (selection == 4) {
                calculations.Division();
            } else if (selection == 0) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Undefined action.");
            }


        }
    }
}