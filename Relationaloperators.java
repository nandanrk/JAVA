import java.util.Scanner;

public class Relationaloperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.println("\nRelational Operator Results:");
        
        System.out.println("num1 == num2: " + (num1 == num2)); // Equal to
        System.out.println("num1 != num2: " + (num1 != num2)); // Not equal to
        System.out.println("num1 > num2: " + (num1 > num2)); // Greater than
        System.out.println("num1 < num2: " + (num1 < num2)); // Less than
        System.out.println("num1 >= num2: " + (num1 >= num2)); // Greater than or equal to
        System.out.println("num1 <= num2: " + (num1 <= num2)); // Less than or equal to
        
        scanner.close();
    }
}
