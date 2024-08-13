package algorithmAssignment;
import java.util.*;
public class frequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter the  array");
        String str = scn.nextLine();

        char []arr= str.toCharArray();

        char []count= new char[26];
        Arrays.fill(count, (char) 0);

        for(int i=0;i<arr.length;i++){
            count[(arr[i])-'a']++;
        }
        int index=0;
         for(int i=0;i < count.length;i++){
             while(count[i]>0){
                 arr[index]= (char)('a'+i);
                 index++;
                 count[i]--;
             }
         }
//
//         int i;
//         int j;
//
//       for(i=0,j=arr.length-1;i<j;i++,j--){
//           char temp=arr[i];
//           arr[i]= arr[j];
//           arr[j]= temp;
//       }

       str= new String(arr);
        System.out.println(str);

    }
}
