package java5;
import java.util.*;
public class sort_array {
    public static void main(String[] args) {
Scanner scn= new Scanner(System.in);
        System.out.println("enter size");
        int size=scn.nextInt();
        int[]arr=new int[size];

        System.out.println("enter the elements of array");

        for (int i = 0; i < size; i++) {
            arr[i]=scn.nextInt();
        }

        boolean ans=sort(size,arr,0);
        System.out.println(ans);
    }
    static boolean sort(int size,int []arr,int i){
        if(i==size-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sort(size,arr,i+1);
    }
}
