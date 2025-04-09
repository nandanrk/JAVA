public class LogicalOperators {
    public static void main(String[] args) {
        int age = 25;
        boolean hasLicense = true;

        // AND operator
        if (age >= 18 && hasLicense) {
            System.out.println("You can drive.");
        }

        // OR operator
        boolean hasPermit = false;
        if (age >= 18 || hasPermit) {
            System.out.println("You can learn to drive.");
        }

        // NOT operator
        boolean isRaining = false;
        if (!isRaining) {
            System.out.println("You can go outside.");
        }
    }
}
