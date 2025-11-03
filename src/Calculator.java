import java.util.Scanner;

public class Calculator {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number : ");
        double num2 = input.nextDouble();
        System.out.print("Enter the operation : ");
        char op = input.next().charAt(0);

        switch(op){
            case '+':
                double total = num1 + num2;
                System.out.println("Summation : "+ total);
                break;
            case '-':
                double sub = num1 - num2;
                System.out.println("Subtraction : "+ sub);
                break;
            case '*':
                double mul = num1 * num2;
                System.out.println("Multipliaction : "+ mul);
                break;

            default:
                System.out.println("Invalid operation.");
        }
    }
}