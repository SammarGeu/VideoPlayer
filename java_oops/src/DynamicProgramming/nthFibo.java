package DynamicProgramming;
import java.util.*;
public class nthFibo {
    public static void main(String[] args) {
   Scanner scn  = new Scanner(System.in);
        int num  =  scn.nextInt();
        int []dp = new int[num+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        int ans = fibo(num,dp);
        System.out.println(Arrays.toString(dp));
        System.out.println(ans);
    }
    static int fibo( int n,int []dp){
    if(n<=1){
        return dp[n];
    }
   if(dp[n]!=-1){
     return dp[n];
   }
   return dp[n]=fibo(n-1,dp) + fibo(n-2,dp);
    }
}


