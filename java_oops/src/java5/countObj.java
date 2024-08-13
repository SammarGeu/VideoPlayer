package java5;
class Parents{
    static int count;

    Parents(){
        count++;
    }
}
public class countObj {
    public static void main(String[] args) {

        Parents obj1 = new Parents();
        System.out.println(Parents.count);
        Parents obj2= new Parents();
        System.out.println(Parents.count);
        Parents obj3 = new Parents();
        System.out.println(Parents.count);
        Parents obj4 = new Parents();
        System.out.println(Parents.count);
        Parents obj5 = new Parents();
        System.out.println(Parents.count);
    }
}
