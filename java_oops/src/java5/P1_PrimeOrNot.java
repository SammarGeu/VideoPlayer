/*Practical-1 {P1_PrimeOrNot.java}

        Write a Java program to perform given tasks:
        1- Read a number from the user {hint: Scanner Class object and nextLine() method}
        2- Write logic to check whether the entered number is prime {hint: sqrt() from java.lang.Math}
        3- Display Output {"Yes, the entered number is prime" or "No, the entered number isn't prime"}

 */
//package java5;
import java.util.*;
public class P1_PrimeOrNot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number :");
        int num=scn.nextInt();

        int end=(int)Math.sqrt(num);
        int count=0;
        for (int i = 2; i <=end ; i++) {
          if(num%i==0){
              count++;
            }
        }
        if(count==0){
            System.out.println("the number is prime");
        }
        else{
            System.out.println("The number is not prime");
        }
    }
}
