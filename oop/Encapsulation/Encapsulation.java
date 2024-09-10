// Class demonstrating encapsulation using various access modifiers
class Person {
    // Private field (accessible only within this class)
    private String name;

    // Default (package-private) field (accessible within the same package)
    int age;

    // Protected field (accessible within the same package and subclasses)
    protected String address;

    // Public field (accessible from anywhere)
    public String nationality;

    // Constructor to initialize fields
    public Person(String name, int age, String address, String nationality) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.nationality = nationality;
    }

    // Getter method for 'name' (private field)
    public String getName() {
        return name;
    }

    // Setter method for 'name' (private field)
    public void setName(String name) {
        this.name = name;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);       // Accessing private field via method
        System.out.println("Age: " + age);         // Accessing default field directly
        System.out.println("Address: " + address); // Accessing protected field
        System.out.println("Nationality: " + nationality); // Accessing public field
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Creating a Person object with your details
        Person person = new Person("Adarsh Kumar", 24, "Random St. 121, India", "Indian");

        // Accessing public field directly
        System.out.println("Public Nationality: " + person.nationality);

        // Accessing default (package-private) field
        System.out.println("Default Age: " + person.age);

        // Accessing protected field
        System.out.println("Protected Address: " + person.address);

        // Cannot access private field directly: person.name (uncommenting this will cause an error)

        // Using setter and getter to modify private field
        person.setName("Adarsh Kumar");
        System.out.println("Private Name (via getter): " + person.getName());

        // Display full information
        person.displayInfo();
    }
}
