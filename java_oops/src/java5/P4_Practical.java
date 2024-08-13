package java5;
import java.util.*;
public class P4_Practical {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = scn.next();
        System.out.println(Check_Palindrome (str));
        System.out.println("Enter two Strings:");
        String str1 = scn.next();
        String str2 = scn.next();
        scn.nextLine();
        System.out.println("Comparing strings with .equals method:");
        if(str1.equals(str2))
        {
            System.out.println("String are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }
    }
    static String Check_Palindrome(String Str)
    {
        String str = Str;
        char[] arr = str.toCharArray();
        int i;
        int j;
        for(i=0,j = arr.length-1; i<j/2; i++,j--)
        {
            arr[i]=arr[j];
        }
        str = new String(arr);
        if(str.equals(str))
        {
            return "String is Palindrome:";
        }
        else
        {
            return "String is not Palindrome:";
        }
    }
    static void reverse(char[] array, int first, int second)
    {
    int i;
    int j=second;
    for(i=first; i<j; i++,j--){
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
}

