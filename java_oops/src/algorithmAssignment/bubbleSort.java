// Ques 13-Bubble Sort
package algorithmAssignment;
import java.util.*;
public class bubbleSort {
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner scn = new Scanner(System.in);
        int size =scn.nextInt();

        int [] arr =new int[size];

        System.out.println("enter the elements of array");

        for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();
        }
        System.out.println("Array after sorting is :");
        int [] Arr=bubble(arr);
        System.out.println(Arrays.toString(Arr));

    }
    static int[] bubble(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        return arr;
    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}


