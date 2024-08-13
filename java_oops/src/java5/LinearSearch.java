package java5;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter size");

        int size = scn.nextInt();
        int[] arr = new int[size];

        System.out.println("enter the elements of array");

        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("enter the target element");
        int target = scn.nextInt();

        int ans = linear_search(arr, target,0);
        System.out.println(ans);
    }
    static int linear_search(int[] arr,int target,int index){
        if(index>=arr.length){
            return -1;
        }
        if(target==arr[index]){
            return index;
        }
       return  linear_search(arr,target,index+1);
    }
}
