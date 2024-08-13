package unit_2;
import unit_1.Program1;
class Program2 {
     private final int A=45;
     public final int B=55;
     protected final int C=90;
     final int D=39;
     public static void main(String[] args) {
         Program1 obj=new Program1();

        /*System.out.println(obj.A);will give error as A
         // has private access in unit_1.Program1.
         */

         System.out.println(obj.B); //run without error
         System.out.println("Sammar saini");
         System.out.println("60");
       /* System.out.println(obj.C);will give error as A has protected
         // access in unit_1.Program1.
         */

        /*System.out.println(obj.D);will give error as it has
         // doesn't have public assess in unit_1.Program1.
         */
     }
}
