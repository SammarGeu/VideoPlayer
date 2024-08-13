package sorting;

public class Telecall2 {
    private String phno;
    private String sname;
    private int n;
    private double amt;

    public Telecall2(String phno, String sname, int n) {
        this.phno = phno;
        this.sname = sname;
        this.n = n;
        this.amt = 0;
    }

    public void compute() {
        double rentalCharge = 500;

        if (1 <= n && n <= 100) {
            amt = rentalCharge;
        } else if (101 <= n && n <= 200) {
            amt = 1.00 * n + rentalCharge;
        } else if (201 <= n && n <= 300) {
            amt = 1.20 * n + rentalCharge;
        } else {
            amt = 1.50 * n + rentalCharge;
        }
    }

    public void display() {
        System.out.println("Phone Number: " + phno);
        System.out.println("Subscriber Name: " + sname);
        System.out.println("Bill Amount: Rs. " + amt);
    }

    // Example usage
    public static void main(String[] args) {
        Telecall2 telcall1 = new Telecall2("1234567890", "John Doe", 150);

        telcall1.compute();

        telcall1.display();
    }
}
