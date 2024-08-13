package java5;
import java.util.*;
public class errorHandling {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        try {
            System.out.println("Enter two number");
            System.out.println("Enter number 1 :");
            int num1 = scn.nextInt();
            System.out.println("Enter number 2 :");
            int num2 = scn.nextInt();
            division(num1, num2);
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught  : " + e.getMessage());
        } finally {
            System.out.println("Closing the Scanner object");

        }
    }
    public static void division(int x,int y)   throws ArithmeticException {
        if(y==0){
            throw new ArithmeticException("Division by zero ");
        }
        else{
            System.out.println("Result is :" + x/y);
        }

    }
}
