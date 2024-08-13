package DynamicProgramming;
import java.util.*;
public class totalUniquePaths {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         int row = scn.nextInt();
         int col = scn.nextInt();
         int [][]dp = new int[row][col];

        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i],-1);
        }
         int ans = paths(row-1,col-1,dp);
        System.out.println(ans);
    }
    static int paths(int x,int y,int[][]dp){
        if(y==0 && x==0){
            return dp[x][y]=1;
        }
        if(x<0 || y<0){
            return 0;
        }
        if(dp[x][y]!=-1){
            return dp[x][y];
        }
        int left =  paths(x,y-1,dp);
        int right = paths(x-1,y,dp);
        return dp[x][y]=left+right;
    }
}
