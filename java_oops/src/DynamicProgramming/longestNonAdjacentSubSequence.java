package DynamicProgramming;
import java.util.*;

public class longestNonAdjacentSubSequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        int[] dp = new int[num];
        Arrays.fill(dp, -1);
        int ans = subSequence(num - 1, arr, dp);
        System.out.println(ans);
    }
    static int subSequence(int n, int[] arr, int[] dp) {
        if (n == 0) {
            return arr[n];
        }
        if (n < 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int pick = arr[n] + subSequence(n - 2, arr, dp);
        int not_pick = subSequence(n - 1, arr, dp);
        dp[n] = Math.max(pick, not_pick);
        return dp[n];
    }
}






