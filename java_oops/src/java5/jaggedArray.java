package java5;
import java.util.*;
public class jaggedArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int size=scn.nextInt();

        int [][] arr=new int[size][];

        for (int i = 0; i < size; i++) {

            System.out.println("enter the number of elements for row"+(i+1));
             int rowsize=scn.nextInt();
              arr[i]=new int[rowsize];

            System.out.println("enter the elements of row"+(i+1));

            for (int j = 0; j < rowsize; j++) {
                arr[i][j]=scn.nextInt();
            }
        }
            System.out.println("the elements of array are");

            for (int i = 0; i < size; i++) {
                System.out.println(Arrays.toString(arr[i]));
                }
            }
        }


