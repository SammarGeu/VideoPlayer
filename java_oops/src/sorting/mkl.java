package sorting;

class Cylinder{
     int radius;
     int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2 * 3.14 * radius * radius + 2 * 3.14 * radius * height;
    }
    public double volume(){
        return 3.142 * radius * radius * height;
    }
}
class rectangle{
     int length;
     int breadth;

    public rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class mkl {
    public static void main(String[] args) {
        //PROBLEM 1

        Cylinder myCylinder = new Cylinder(9,12);
       myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
         myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());

       // PROBLEM 2
       System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());


        //PROBLEM 4
        rectangle r=new rectangle(12,56);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());


    }
}