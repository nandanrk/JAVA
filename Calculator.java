import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        

        int preIncrementNum1 = ++num1; 
        int postIncrementNum2 = num2++;        
        int preDecrementNum1 = --num1; 
        int postDecrementNum2 = num2--; 
        
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = 0;
        

        if (num2 != 0) {
            quotient = (double) num1 / num2;
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        
        System.out.println("Pre-Incremented num1: " + preIncrementNum1);
        System.out.println("Post-Incremented num2: " + postIncrementNum2);
        System.out.println("Pre-Decremented num1: " + preDecrementNum1);
        System.out.println("Post-Decremented num2: " + postDecrementNum2);
        
        System.out.println("\nArithmetic Operations:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        if (num2 != 0) {
            System.out.println("Quotient: " + quotient);
        }
        

        scanner.close();
    }
}
