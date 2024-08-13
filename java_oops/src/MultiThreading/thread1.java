package MultiThreading;
import java.util.*;

public class thread1 {
    public static void main(String[] args)  throws InterruptedException{

        Thread T1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <=1000 ; i++) {
                    System.out.println(i);
                }
            }
        });
        Thread T2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Scanner scn = new Scanner(System.in);
                System.out.println("Enter the number :");

                int number = scn.nextInt();

                if(number < 2){
                    System.out.println(number + " is not prime");
                    return;
                }
                for (int i = 2; i < (int) Math.sqrt(number) + 1; i++) {
                    if(number%i==0){
                        System.out.println(number + " is not prime");
                        return;
                    }
                }
                System.out.println(number + " is prime");
            }
        });
        Thread T3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1001; i <=2000 ; i++) {
                    System.out.println(i);
                }
            }
        });
        T1.start();
        T2.start();
        T3.start();
        T1.join();
        T2.join();
        T3.join();

    }
}
