package java5;
import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number :");
        int n=scn.nextInt();

      int ans= fibo(n);
        System.out.println(ans);
    }
    static int fibo(int N){
        if(N<2){
            return N;
        }
        int sum=fibo(N-1)+fibo(N-2);
    return sum;
    }
}
