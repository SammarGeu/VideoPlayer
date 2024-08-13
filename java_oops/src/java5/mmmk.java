package java5;

public class mmmk {
    public static void main(String[] args) {
        Parent obj = new Parent();
        Parent.display("sammar");
        Parent obj1 = new Parent();

        Parent.display("Saijal");
    }
}
      class Parent {

        static void display(String name) {
            System.out.println("hey i am " + name);

        }
    }
