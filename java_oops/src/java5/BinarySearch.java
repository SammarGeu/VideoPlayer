package java5;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter size");
        int size=scn.nextInt();

        int []arr = new int[size];
        System.out.println("enter array elements");

        for(int i=0;i<size;i++){
            arr[i]=scn.nextInt();
        }

        System.out.println("enter the target element");
        int target=scn.nextInt();

        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;

        int ans=Binary(arr,target,start,end,mid);
        System.out.println(ans);

    }
    static int Binary(int []arr,int target,int start,int end,int mid){

        if(start>end){
            return -1;
        }

         mid=start+(end-start)/2;

        if(target>arr[mid]){
            start=mid+1;
            return Binary(arr,target,start,end,mid);
        }

        else if(target<arr[mid]){
            end=mid-1;
            return Binary(arr,target,start,end ,mid);
        }

       else  {
           return mid;
        }
    }
}
