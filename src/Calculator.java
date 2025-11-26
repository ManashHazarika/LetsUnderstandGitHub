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

//        Commenting
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
                System.out.println("Multiplication : "+ mul);
                break;
            case '/' :
                if(num2 != 0){
                    double div = num1/num2;
                    System.out.println("Division : " + div);
                    break;
                }
                else {
                    System.out.println("Division by zero is not allowed");
                    break;
                }
            case '%' :
                double mod = num1 % num2;
                System.out.println("Modulus : " + mod);
                break;

            default:
                System.out.println("Invalid operation.");
        }
    }

    // I am commenting on the Commented-branch

//     Creating a new branch
}