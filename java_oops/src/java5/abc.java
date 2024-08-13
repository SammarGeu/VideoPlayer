package java5;

 class clone implements Cloneable {
    public int x;
    public String abc;

    public clone(int x,String str){
        this.x=x;
        this.abc=str;
    }


  //  @Override
   protected  Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
public class abc{
    public static void main(String[] args)throws CloneNotSupportedException {
        clone obj=new clone(1,"sammar");
        clone obj2=(clone)obj.clone();
        System.out.println(obj.x);
        System.out.println(obj2.x);
    }
}
