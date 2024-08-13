package DynamicProgramming;
import java.util.*;
public class NinjasTraining {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[][]arr = new int [size][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j]  = scn.nextInt();
            }
        }
        int [][]dp = new int[size][4];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i],-1);
        }
        int ans = sum(size-1,3,arr,dp);
        System.out.println(ans);
    }
    static int sum(int day,int last,int[][]arr,int[][]dp) {
        if(day==0){
            int maxi=0;
            for(int i=0;i<3;i++){
                if(i!=last){
                    maxi=Math.max(maxi,arr[0][i]);
                }
            }
            return dp[day][last]=maxi;
        }
        if(dp[day][last]!=-1){
            return dp[day][last];
        }
        int maxi=0;
        for(int i=0;i<3;i++){
            if(i!=last){
            int activity = arr[day][i]+sum(day-1,i,arr,dp);
            maxi = Math.max(maxi,activity);
          }
        }
        return dp[day][last]=maxi;
    }
}
