package java5;
import java.util.*;
public class swap {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        arraySwap(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void arraySwap(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        arraySwap(arr, ++left, ++right);
    }
}
