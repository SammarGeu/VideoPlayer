package java5;

import java.util.Scanner;

public class handling {

    // Method that throws a checked exception
    public static void validateNumber(int num) throws IllegalArgumentException {
        if (num <= 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a positive number: ");
            int num = scanner.nextInt();

            // Validate the number
            validateNumber(num);

            // Perform division by zero to throw an arithmetic exception
            int result = num / 0;

            System.out.println("Result: " + result); // This line won't be reached
        }
        catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught: Division by zero");
        } catch (Exception e) {
            System.err.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block: This block always executes, regardless of exceptions.");
            scanner.close(); // Close the scanner to release resources
        }

        System.out.println("Program continues after the try-catch-finally blocks.");
    }
}
