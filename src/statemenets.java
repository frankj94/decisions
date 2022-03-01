import java.util.Scanner;

public class statemenets {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number1 = num1.nextInt();

        System.out.println("Enter second number: ");
        int number2 = num1.nextInt();

        System.out.println("Enter third number: ");
        int number3 = num1.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("The number " + number1 + " is greatest in value.");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("The number " + number2 + " is greatest in value.");
        } else if (number3 > number1 && number3 > number2) ;
        {
            System.out.println("The number " + number3 + " is greatest in value.");
        }
    }
}
