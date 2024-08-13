/*
Make separate functions for each task given below
        - need not to create a separate class (static functions)

        -Task_01
        Check whether the entered string is Palindrome or not.
        String str = "75457"
        Output: "Yes it is a palindrome" or "No it is not a Palindrome".

        -Task_02
        StringCompare: Check if the strings are equal or not. (Apply both Techniques: "==", "equals")

        -Task_03
        Write a java program to reverse all the words in a given string
        "This is fun" -> "sihT si nuf"

        -Task_04
        Make a reverse of a string (While keeping this in mind, the strings are immutable)
*/
package java5;
import java.util.*;
public class  p4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter the string");
        String str = scn.next();

        System.out.println(checkPalindrome(str));

        System.out.println("enter two strings");
        String str1 = scn.next();
        String str2 = scn.next();
        scn.nextLine();

        System.out.println("comparing strings with .equals method");
        if (str1.equals(str2)) {
            System.out.println("strings are equal");
        } else {
            System.out.println("strings are not equal");
        }
        System.out.println("comparing strings with == operator");

        if (str1 == str2) {

            System.out.println("strings are equal");
        } else {
            System.out.println("strings are not equal");
        }/*
        the else statement will execute as == operator will compare the strings
        through reference objects as both are different in this case
        */
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

        Str2 = new String(Array);
        System.out.println("reversed words of string are");
        System.out.println(Str2);


        System.out.println("reversing string using Stringbuffer");
        System.out.println("enter the string to reverse");
        String string = scn.next();

        StringBuffer Buffer = new StringBuffer(string);
        System.out.println("reverse string is ");
        System.out.println( Buffer.reverse());

    }
    static String checkPalindrome(String str) {
        String Str = str;

        char[] arr = str.toCharArray();

        int i;
        int j;

        for (i = 0, j = arr.length - 1; i < j / 2; i++, j--) {
            arr[i] = arr[j];
        }
        str = new String(arr);
        if (Str.equals(str)) {
            return "string is palindrome";
        } else {
            return "strings is not palindrome";
        }

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
