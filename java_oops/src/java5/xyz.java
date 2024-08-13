package java5;



 class Animals {
    void AnimalSound() {
        System.out.println("Animal makes a Sound.");
    }
}
 class Mammal extends Animals {
     void MammalSound() {
        System.out.println("Mammal makes a Sound.");
    }
}
public class xyz {
    public static void main(String[] args) {
        Animals animal = new Animals();
        Mammal mammal = new Mammal();
        animal.AnimalSound();
        mammal.MammalSound();
    }

}