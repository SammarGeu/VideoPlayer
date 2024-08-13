/*
Practical-3 (P3_ArrayInJava.java)

        - Make individual functions of each task given below and call them all from the main method
        - Need not create another class for functions mentioned below

        -Task_01
        Find the duplicate elements in an array of 10 sizes.
        -Task_02
        Perform left-rotation in an array by 2 of 10 size.
        -Task_03
        Write a Java program to remove a specific element from an array.
        -Task_04
        Write a Java program to find the second largest and second
        the smallest element in an array?
        -Task_05
        Write a Java program to insert a specific element in an array.
        */
package java5;
import java.util.*;
public class P3_Practical {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        int []arr=new int[10];
        System.out.println("enter the elements of Array");

        for(int i = 0; i < 10; i++) {
            arr[i]=scn.nextInt();
        }
        System.out.println("the duplicates in the array are");

        ArrayList<Integer> List=findDuplicates(arr);
      for(int duplicate: List){
          System.out.println(duplicate);
      }

        System.out.println("Array after performing 2 left rotations");
        System.out.println(Arrays.toString(rotation(arr)));


        System.out.println("enter the index that you wanted to delete");
        int index=scn.nextInt();
        System.out.println("Array after deleting the index is :");
        System.out.println(Arrays.toString(removeElement(index,arr)));


         Arrays.sort(arr);
        int secondSmallest=arr[1];
        int secondLargest=arr[arr.length-2];
        System.out.println("second smallest element is :" + secondSmallest );
        System.out.println("second largest element is :" + secondLargest);

        System.out.println("enter the index where you want to add the element");
        int insertIndex=scn.nextInt();
        System.out.println("enter the element that you won't to insert");
        int data=scn.nextInt();
        System.out.println("after inserting the element,the array is :");
        System.out.println(Arrays.toString(insertElement(insertIndex,data,arr)));

    }

    static ArrayList<Integer> findDuplicates(int [] arr){

        ArrayList<Integer> list=new ArrayList<>();
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]) {
                max = arr[i];
            }
        }
        

      int[] Arr=new int[max+1];
        Arrays.fill(Arr,0);

        for (int j : arr) {
            Arr[j]++;
        }

        for (int i = 0; i <=max; i++) {
            if(Arr[i]>1){
                list.add(i);
            }
        }
        return list;
    }
static int[] rotation(int[] arr){
    for(int j=0;j<2;j++) {
        int first = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
    }
    return arr;
  }
  static int[] removeElement(int item,int[] arr){

      for (int i = item; i < arr.length-1; i++) {
          arr[i]=arr[i+1];
      }
        arr[arr.length-1]=0;
      return arr;
  }
  static int [] insertElement(int index,int data,int[] arr){

       arr[index]=data;
       int x=arr[index+1];
       for (int i = index+1; i <arr.length-1; i++) {
        arr[i] = arr[i+1];
    }
      arr[arr.length-1]=x;
        return arr;  
        }
}
