package unit_1;
import unit_2.*;
public class Program1 {
      private final int A=10;
      public final int B=15;
      protected final int C=30;
      final int D=33;

     public static void main(String[] args) {
         /*Program2 obj1=new Program2; since Program2 in unit_2 is not
          in public and will give an error as it
         cannot be accessed from outside the package*/

         /*System.out.println(obj1.A);
         System.out.println(obj1.B);
         System.out.println(obj1.C);
         System.out.println(Obj2.D);
         All lines will give error as we haven't created the object of Program2 due to the
          reason i mentioned above.
          */
     }
}
