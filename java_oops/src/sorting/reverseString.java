package sorting;
import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the string of words that you won't to reverse");
        String Str2 = scn.nextLine();
        char[] Array = Str2.toCharArray();

        int i;
        int j;

        for (i = 0, j = 0; j < Array.length; j++) {
            if (Array[j] == ' ') {
                reverse(Array, i, j - 1);
                i = j + 1;
            }
        }
        reverse(Array, i, j - 1);
    }
    static void  reverse(char [] array,int first,int second){
        int i;
        int j=second;

        for (i = first; i<j; i++, j--) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}

