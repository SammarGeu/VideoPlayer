//Ques 23- Kadane's Algorithm
package algorithmAssignment;
import java.util.*;
public class kadanesAlgorithm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size of array");

        int size=scn.nextInt();

        int []arr = new int[size];
        System.out.println("enter array elements");

        for(int i=0;i<size;i++){
            arr[i]=scn.nextInt();
        }
        int maxSum=kadane(arr);

        System.out.println("maximum subarray sum is :" + maxSum);
    }
    static int kadane(int[] arr){
        int sum=0;
        int max= Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {

            sum+=arr[i];

            if(sum>max){
                max=sum;
            }

            if(sum<0){
                sum=0;
            }

            if(max<0){
                max=0;
            }
        }
        return max;
    }

}
