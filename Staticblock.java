public class Staticblock {
    static int number;
    static String message;

    // Static block
    static {
        System.out.println("Static block is executed.");
        number = 10;
        message = "Welcome to Java!";
    }

    
    public Staticblock() {
        System.out.println("Constructor is called.");
    }

    public void display() {
        System.out.println("Number: " + number);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        System.out.println("Main method starts.");
        Staticblock obj = new Staticblock();
        obj.display();
    }
}
