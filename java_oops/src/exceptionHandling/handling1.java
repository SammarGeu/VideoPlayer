package exceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class handling1 {
    public static void main(String[] args) throws InputMismatchException {
        System.out.println();
        Scanner scn = new Scanner(System.in);

        System.out.println("enter the size of array :");

        int size = scn.nextInt();

        int []arr = new int[size];
        System.out.println("enter the elements of array");

        for (int i = 0; i < arr.length; i++) {
            try {
                arr[i] = scn.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println(e);
            }
        }
       exception(arr);
    }
    public static void exception(int []arr) throws ArithmeticException,IllegalArgumentException{

        for (int i = 0; i < arr.length; i++) {

            try{
                int c = arr[i]/0;
                throw new ArithmeticException("Divide by zero");
            }
            catch(ArithmeticException e){
                System.out.println("Exception :"+  e);
                System.out.println("inside catch block");
            }
            finally{
                System.out.println("all exceptions caught");

            }

        }

    }
}
