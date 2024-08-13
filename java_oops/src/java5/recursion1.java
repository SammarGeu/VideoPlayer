package java5;
import java.util.*;
public class recursion1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter the number :");
        int n= scn.nextInt();
       int ans= reverse(n,0);
        System.out.println(ans);
    }

    static int reverse(int N,int ans) {
        if (N == 0) {
            return ans;
        }

        int rem = N % 10;
        ans = ans * 10 + rem;
        N = N / 10;
       return  reverse(N, ans);
    }
}
