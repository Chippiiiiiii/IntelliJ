import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tharun\n2024503579");
        System.out.print("Enter first number: ");
        double n1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = input.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = input.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = n1 + n2;
                System.out.println("The sum: " + result);
                break;
            case '-':
                result = n1 - n2;
                System.out.println("The difference: " + result);
                break;
            case '*':
                result = n1 * n2;
                System.out.println("The multiplication: " + result);
                break;
            case '/':
                if (n2 != 0) {
                    result = n1 / n2;
                    System.out.println("The division: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator! Please enter one of +, -, *, /.");

        }
    }
}
