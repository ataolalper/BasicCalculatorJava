import java.util.Scanner;

public class Calculations {
    Scanner input = new Scanner(System.in);
    double number1, number2, addition, subtraction, multiplication, division;


    public void Addition() {
        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();

        addition = number1 + number2;
        System.out.println(addition);
    }

    public void Subtraction() {
        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();

        subtraction = number1 - number2;
        System.out.println(subtraction);
    }

    public void Multiplication() {
        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();

        multiplication = number1 * number2;
        System.out.println(multiplication);
    }

    public void Division() {
        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();
        if (number2 == 0) {
            System.out.println("Second number cannot be zero!");
        } else {
            division = number1 / number2;
            System.out.println(division);
        }
    }
}
