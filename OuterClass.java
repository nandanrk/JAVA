public class OuterClass {
    int outerNumber = 10;


    class InnerClass {
        void display() {
            System.out.println("Accessing outer class value: " + outerNumber);
        }
    }

    public static void main(String[] args) {
        // Create object of OuterClass
        OuterClass outer = new OuterClass();

        // Create object of InnerClass using outer class object
        OuterClass.InnerClass inner = outer.new InnerClass();

        // Call method of inner class
        inner.display();
    }
}
