//Ques 15-Shell Sort
package algorithmAssignment;
import java.util.*;
public class shellSort {
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner scn = new Scanner(System.in);
        int size =scn.nextInt();

        int [] arr =new int[size];

        System.out.println("enter the elements of array");

        for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();
        }
        System.out.println("array after sorting is");
        int[] Arr=shell(arr);
        System.out.println(Arrays.toString(Arr));
    }
    static int[] shell(int []arr)
    {
        for (int timeperiod = arr.length / 2; timeperiod > 0; timeperiod /= 2) {
            for (int i = timeperiod; i < arr.length; i += 1) {
                int temp = arr[i];
                int j;
                for (j = i; j >= timeperiod && arr[j - timeperiod] > temp; j -= timeperiod) {
                    swap(arr, j, j - timeperiod);
                }
                arr[j] = temp;
            }
        }
        return arr;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
