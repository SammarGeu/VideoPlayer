package java5;
import java.util.*;
public class Pallindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number");
        int n = scn.nextInt();
        int m = n;
        int b=no_digit(m);
        int ans = pallindrome(n, 0,b);
        if (ans == m) {
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }

    static int pallindrome(int n, int sum,int b) {

        if(n==0){
            return sum;

        }

        int rem = n % 10;
        sum = (int)(sum+Math.pow(rem,b));
        n=n/10;
      return pallindrome(n,sum,b);

    }
    static int no_digit(int m){
        int count=0;
        while(m!=0){
            count++;
            m=m/10;
        }
        return count;
    }
}