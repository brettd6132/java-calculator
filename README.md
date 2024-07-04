# java-calculator
A basic Java calculator to help newbies understand the basics of Java

### Java Code Explained

```
public class Calculator {
``` 
- Explanation: 
- `public class Calculator {` declares a class named Calculator. In Java, a class is a blueprint for objects, defining attributes (data fields) and methods (functions). 

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
