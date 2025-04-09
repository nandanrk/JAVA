public class MethodOverloading {

    
    public int add(int a, int b) {
        return a + b;
    }

    
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    
    public double add(double a, double b) {
        return a + b;
    }

    
    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        
        MethodOverloading calculator = new MethodOverloading();

        
        System.out.println("Sum of 2 integers: " + calculator.add(5, 10));           // Calls add(int, int)
        System.out.println("Sum of 3 integers: " + calculator.add(5, 10, 15));        // Calls add(int, int, int)
        System.out.println("Sum of 2 doubles: " + calculator.add(5.5, 10.5));         // Calls add(double, double)
        System.out.println("Concatenation of 2 strings: " + calculator.add("Hello, ", "World!"));  // Calls add(String, String)
    }
}
