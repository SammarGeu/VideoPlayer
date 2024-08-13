package algorithmAssignment;
import java.util.*;
public class linearSearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size eof array");
        int size= scn.nextInt();

        int [] arr=new int[size];
        System.out.println("enter the elements of array");


        for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();
        }

        System.out.println("enter the target element");
        int target=scn.nextInt();

         int ans=linear(arr,target);
        System.out.println(ans);
    }
     static int linear(int[] arr,int item){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==item){
                return i;
            }
        }
        return -1;
    }
}
