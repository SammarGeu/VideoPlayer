package java5;
class A {
    A() {
        System.out.println("Class A - Default Constructor");
    }
  A(String message) {
     System.out.println("Class A - Parameterized Constructor: " + message);
   }
}
class B extends A {
    // Parameterized constructor
    B(String message) {
      super(message); // Invoking parameterized constructor of class A
        System.out.println("Class B - Parameterized Constructor");
    }
}
class C extends B {
    C() {
       super("Message from Class C");
        System.out.println("Class C - Default Constructor");
    }
    C(String message) {
      super(message);
        System.out.println("Class C - Parameterized Constructor: " + message);
    }
}

public class constructor {
    public static void main(String[] args) {
        C cObject = new C("Hello from Main");
    }
}
