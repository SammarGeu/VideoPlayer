package java5;
import java.util.Scanner;
public class zero {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter the number");
        int n=scn.nextInt();

        int count=0;
        int ans=zeroes(n,count);
        System.out.println(ans);

    }

    static int zeroes(int n,int count){
        if(n==0){
            return count;
        }
        int rem=n%10;
        if(rem==0){
            count++;
        }
        n=n/10;
        return zeroes(n,count);

    }
}

