//Ques 27-Euclid's Algorithm
package algorithmAssignment;

import java.util.*;

public class euclidsAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int gcd = GCD(num1, num2);

        System.out.println("The GCD  is: " + gcd);

        scanner.close();
    }
    public static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
