//Ques 7 - Insertion Sort
package algorithmAssignment;
import java.util.*;
public class insertionSort {
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
        int [] Arr=insertion(arr);
        System.out.println(Arrays.toString(Arr));
    }
    static int[] insertion(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
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

