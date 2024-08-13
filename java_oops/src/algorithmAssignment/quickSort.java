// Ques 11 Quick Sort
package algorithmAssignment;
import java.util.*;
public class quickSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = scn.nextInt();
        int[] arr = new int[size];

        System.out.println("enter the elements of array");
        for (int i = 0; i<arr.length;i++ ){
            arr[i]=scn.nextInt();
        }
        Quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void Quicksort(int[] Arr,int low,int high){
        if(low>=high){
            return;
        }
        int start=low;
        int  end=high;
        int middle=start+(end-start)/2;
        int pivot=Arr[middle];

        while(start<=end){
            while(Arr[start]<pivot){
                start++;
            }
            while(Arr[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp=Arr[start];
                Arr[start]=Arr[end];
                Arr[end]=temp;
                start++;
                end--;
            }
        }
        Quicksort(Arr,low,end);
        Quicksort(Arr,start,high);

    }
}


