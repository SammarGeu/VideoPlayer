//Ques 14- Radix Sort
package algorithmAssignment;
import java.util.*;

public class radixSort {

    static int getMax(int []arr, int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
    static void countSort(int []arr, int n, int exp)
    {
        int []output= new int[n];
        int i;
        int []count = new int[10];

        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        for (i = 0; i < n; i++)
            arr[i] = output[i];

    }
    static void radixsort(int []arr, int n)
    {
        int m = getMax(arr, n);

        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }
    static void print(int []arr, int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=scn.nextInt();
        int []arr = new int[size] ;
        System.out.println("enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();
        }
        int n = arr.length;
        radixsort(arr, n);
        print(arr, n);
    }
}
