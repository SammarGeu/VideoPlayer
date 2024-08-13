package exceptionHandling;
import java.util.*;
public class ownException {
    public static void main(String[] args) {
Scanner scn =  new Scanner(System.in);
        int x=scn.nextInt();
        try{
            int y=scn.nextInt();
            if(y==0){
                 throw new exception();
            }
            else {
                System.out.println("ans is :"  + x/y);
            }
        }
        catch(exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally{
            scn.close();
        }
    }
}

class exception extends Exception{
   // exception( String message){
    //    super( message);
    //}
    public String getMessage(){
        return "divide by zero";
    }

}

