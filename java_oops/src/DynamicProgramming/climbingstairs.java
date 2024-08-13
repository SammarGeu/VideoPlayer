package DynamicProgramming;
import java.util.*;
public class climbingstairs {

    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int num = scn.nextInt();
        int []dp = new int[num+1];
        Arrays.fill(dp,-1);
     int ans = stairs(num,dp);
        System.out.println(ans);
    }
    static int stairs(int n,int []dp){
        if(n<0){
            return 0;
        }
        if(n==0){
            return dp[n]=1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
       return dp[n]=stairs(n-1,dp) + stairs(n-2,dp);
    }
    
}