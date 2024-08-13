package java5;
// Define the first interface
interface Interface1 {
   abstract void method(String c);
}

// Define the second interface
interface Interface2 {
    abstract void method(int x);
}

// Define a class that implements both interfaces
 class MyClass implements Interface1, Interface2 {
    @Override
    public void method(String c) {
        System.out.println("Implementing method1 from Interface1");
    }

    @Override
    public void method(int x) {
        System.out.println("Implementing method2 from Interface2");
    }

    // Additional methods specific to MyClass
    void additionalMethod() {
        System.out.println("Additional method in MyClass");
    }
}

public class inter {
    public static void main(String[] args) {
        // Create an object of MyClass
        MyClass myObject = new MyClass();

        // Call methods from both interfaces
        myObject.method("sammar");
        myObject.method(5);

        // Call an additional method in MyClass
        myObject.additionalMethod();
    }
}
