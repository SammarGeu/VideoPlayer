//Ques 29- Mo's Algorithm
package algorithmAssignment;
import java.util.*;

class MosAlgorithm {
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner scn = new Scanner(System.in);
        int size =scn.nextInt();

        int [] arr =new int[size];
        System.out.println("enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();
        }
        int sqrt = (int) Math.sqrt(size);

        int block_id = -1;

        int[] blocks = new int[sqrt + 1];

        for(int i = 0; i < size; i++) {

            if(i % sqrt == 0) {
                block_id++;
            }
            blocks[block_id] += arr[i];
        }
        System.out.println("enter the range of indexes that  you wont to find the sum between them");
        int left=scn.nextInt();
        int right=scn.nextInt();

        System.out.println(query(blocks, arr, left, right, 3));
    }

    public static int query(int[] blocks, int[] arr, int l, int r, int sqrt) {
        int ans = 0;

        // left part
        while(l%sqrt != 0 && l<r && l!=0) {
            ans += arr[l];
            l++;
        }

        while(l + sqrt <= r) {
            ans += blocks[l/sqrt];
            l += sqrt;
        }

        while(l <= r) {
            ans += arr[l];
            l++;
        }

        return ans;
    }

    public void update(int[] blocks, int[] arr, int i, int val, int sqrt) {
        int block_id = i / sqrt;
        blocks[block_id] += (val - arr[i]);
        arr[i] = val;
    }

}