class Person {
    String name;
    int age;

    public Person() {
        name = "Unknown";
        age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person otherPerson) {
        this.name = otherPerson.name;
        this.age = otherPerson.age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("Person 1 (Default Constructor):");
        person1.display();
        System.out.println();

        Person person2 = new Person("Alice", 25);
        System.out.println("Person 2 (Parameterized Constructor):");
        person2.display();
        System.out.println();

        Person person3 = new Person(person2);
        System.out.println("Person 3 (Copy Constructor):");
        person3.display();
    }
}
