package java5;
class animals {
     void AnimalSound() {
        System.out.println("Generic animal sound");
    }
}

 public class mammals extends animals {
     void MammalSound() {
        // Calling the superclass method inside the child class method
         animals Animal=new animals();
         Animal.AnimalSound();
        System.out.println("Mammal sound");
    }

    public static void main(String[] args) {
       mammals mammal = new mammals();

        // Calling the superclass method from the main method
        mammal.AnimalSound();

        // Calling the child class method

        mammal.MammalSound();

        System.out.println("Sammar Saini");
        System.out.println("60");
    }
}
