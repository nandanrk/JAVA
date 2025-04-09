
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }

    void sleep() {
        System.out.println("This animal sleeps.");
    }
}


class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Inherited methods from Animal
        myDog.eat();
        myDog.sleep();

        // Own method in Dog
        myDog.bark();
    }
}
