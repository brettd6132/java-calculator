import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        
        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Perform operations
        int sum = calculator.add(num1, num2);
        int difference = calculator.subtract(num1, num2);
        int product = calculator.multiply(num1, num2);
        double quotient = calculator.divide(num1, num2);
        
        // Output results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        
        // Close the scanner
        scanner.close();
    }
}
