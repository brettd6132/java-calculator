# Java Calculator
A basic  calculator to help newbies understand the basics of 

###  Code Explained

```
public class Calculator {
``` 
- Explanation: 
- `public class Calculator {` declares a class named Calculator. In , a class is a blueprint for objects, defining attributes (data fields) and methods (functions). 

```
    public int add(int a, int b) {
        return a + b;
    }
``` 
- Explanation:
- `public int add(int a, int b) {` declares a method add that takes two int parameters (a and b) and returns an int. 
- `return a + b;` adds a and b together and returns the result.

```
    public int subtract(int a, int b) {
        return a - b;
    }
``` 
- Explanation:
- `public int subtract(int a, int b) {` declares a method subtract that takes two int parameters (a and b) and returns an int. 
- `return a - b;` subtracts b from a and returns the result.

```
    public int multiply(int a, int b) {
        return a * b;
    }
```
- Explanation:
- `public int multiply(int a, int b) {` declares a method multiply that takes two int parameters (a and b) and returns an int. 
- `return a * b;` multiplies a and b together and returns the result.

```
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return (double) a / b;
    }
```
- Explanation:
- `public double divide(int a, int b) {` declares a method divide that takes two int parameters (a and b) and returns a double.
- `if (b == 0) { throw new IllegalArgumentException("Cannot divide by zero!"); }` checks if b is zero. If true, it throws an IllegalArgumentException with an error message.
- `return (double) a / b;` divides a by b, casting a to double to ensure the result is a double (for accurate decimal division).

```
import .util.Scanner;
```
- Explanation:
- `import .util.Scanner;` imports the Scanner class from the .util package. Scanner is used for reading user input.

```
public class Main {
```
- Explanation:
- `public class Main {` declares a class named Main. This is where the main execution of the program starts.

```
public static void main(String[] args) {
```
- Explanation:
- `public static void main(String[] args) {` declares the main method, the entry point of any  application.
- `String[] args` is an array of command-line arguments passed to the program.

```
Calculator calculator = new Calculator();
```
- Explanation:
- `Calculator calculator = new Calculator();` creates an instance of the Calculator class named calculator. This allows us to use the methods defined in the Calculator class.

```
Scanner scanner = new Scanner(System.in);
```
- Explanation:
- `Scanner scanner = new Scanner(System.in);` creates a new Scanner object named scanner, which reads input from the standard input stream (typically the keyboard).


```
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
```
- Explanation:
- `System.out.print("Enter first number: ");` displays a prompt asking the user to enter the first number.
- `int num1 = scanner.nextInt();` reads an integer input from the user using the scanner object and stores it in the variable num1.
- `System.out.print("Enter second number: ");` displays a prompt asking the user to enter the second number.
- `int num2 = scanner.nextInt();` reads an integer input from the user using the scanner object and stores it in the variable num2.

```
        int sum = calculator.add(num1, num2);
        int difference = calculator.subtract(num1, num2);
        int product = calculator.multiply(num1, num2);
        double quotient = calculator.divide(num1, num2);
```
- Explanation:
- `int sum = calculator.add(num1, num2);` calls the add method of the calculator object, passing num1 and num2 as arguments, and stores the result in sum.
- `int difference = calculator.subtract(num1, num2);` calls the subtract method of the calculator object, passing num1 and num2 as arguments, and stores the result in difference.
- `int product = calculator.multiply(num1, num2);` calls the multiply method of the calculator object, passing num1 and num2 as arguments, and stores the result in product.
- `double quotient = calculator.divide(num1, num2);` calls the divide method of the calculator object, passing num1 and num2 as arguments, and stores the result in quotient.

```
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
```
- Explanation:
- `System.out.println("Sum: " + sum);` prints the sum of num1 and num2 to the console.
- `System.out.println("Difference: " + difference);` prints the difference of num1 and num2 to the console.
- `System.out.println("Product: " + product);` prints the product of num1 and num2 to the console.
- `System.out.println("Quotient: " + quotient);` prints the quotient of num1 divided by num2 to the console.

```
        scanner.close();
```
- Explanation:
- `scanner.close();` closes the scanner object, releasing any associated resources.
