// Ques 9 Selection Sort
package algorithmAssignment;
import java.util.*;
public class selectionSort {
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
        int [] Arr=Selection(arr);
        System.out.println(Arrays.toString(Arr));
        }

    static int[] Selection(int []arr){
        for (int i = 0; i < arr.length; i++) {
            int last=arr.length-i-1;
            int maxIndex=max(arr,0,last);
            swap(arr,maxIndex,last);
        }
        return arr;
    }

    static int max(int[]arr,int start,int last){
        int max=start;
        for (int i = start; i <=last ; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    }
