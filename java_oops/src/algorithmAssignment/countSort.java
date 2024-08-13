// Ques 12- Count Sort
package algorithmAssignment;
import java.util.*;
public class countSort {
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
        arr = CountSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] CountSort(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int[] Arr = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            Arr[arr[i]]++;
        }
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (Arr[i] > 0) {
                arr[index] = i;
                index++;
                Arr[i]--;
            }
        }
        return arr;
    }
}
