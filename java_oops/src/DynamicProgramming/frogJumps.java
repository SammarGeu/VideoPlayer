package DynamicProgramming;
import  java.util.*;
public class frogJumps {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int []dp = new int[num+1];
        Arrays.fill(dp,-1);;
        int ans = fJumps(num-1, arr,dp);
        System.out.println(ans);
    }
    static int fJumps(int n, int[] arr,int[]dp) {
        if (n == 0) {
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        if (n == 1) {
            return dp[n]=Math.abs(arr[1]-arr[0]);
        }
        return  Math.min(fJumps(n - 1, arr,dp) + Math.abs(arr[n] - arr[n - 1]),
                fJumps(n - 2, arr,dp) + Math.abs(arr[n] - arr[n - 2]));
    }
}
