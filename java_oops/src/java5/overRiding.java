package java5;
class ABC{
    int add(int x,int y){
        return x+y;
    }
    //Overloading function of class ABC
     int add(int X,int Y,int Z){
        return X+Y+Z;
     }
}
class CBA extends ABC{

    //overiding function of class CBA
    @Override
    int add(int x,int y){
        return x+y+5;
    }
}
public class overRiding {
    public static void main(String[] args) {
        ABC obj = new CBA();

         ABC obj1 =new ABC();


         //calling non overLoading function from ABC class
        // through parent reference.
        System.out.println(obj1.add(1,2));

        //calling overLoading function of ABC class
        System.out.println(obj.add(1,2,3));


        //calling overRinding function from class CBA
        System.out.println(obj.add(1,2));
    }
}
