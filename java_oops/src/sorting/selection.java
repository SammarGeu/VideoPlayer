package sorting;
import java.util.*;
public class selection {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size=scn.nextInt();

        int []arr=new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();
        }
        Selection(arr);
       // Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection(int []arr){
        for (int i = 0; i < arr.length; i++) {
            int last=arr.length-i-1;
            int maxIndex=max(arr,0,last);
            swap(arr,maxIndex,last);
        }
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
    static void insertion(int[]arr){

        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
}
