// Ques 5 Rabin karp Algorithm
package algorithmAssignment;
import java.util.*;
public class rabinKarp {
    static final int PRIME=7;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a sentence");
        String sentence=scn.nextLine();
        System.out.println("enter the string that you wont to found in the sentence");
        String pattern=scn.nextLine();

        search(sentence,pattern);
        scn.close();
    }
    static long calculateHash(String str){
        long hash=0;
        for (int i = 0; i < str.length(); i++) {
            hash=hash+str.charAt(i)*(long)Math.pow(PRIME,i);
        }
        return hash;
    }
    static long updateHash(long prevHash,char oldChar,char newChar,int patternLength){
        long newHash=(prevHash-oldChar)/PRIME;
        newHash=newHash+newChar*(long)Math.pow(PRIME,patternLength-1);
        return newHash;
    }
    static void search(String text,String pattern){
        int patternLength=pattern.length();
        long patternHash=calculateHash(pattern);
        long textHash=calculateHash(text.substring(0,patternLength));


        for (int i = 0; i <= text.length()-patternLength; i++) {
            if(patternHash==textHash){
                if(text.substring(i,i+patternLength).equals(pattern)){
                    System.out.println("string found at index " + i);
                }
            }
         if(i<text.length()-patternLength){
             textHash=updateHash(textHash,text.charAt(i),text.charAt(i+patternLength),patternLength);
          }
        }
    }
}


