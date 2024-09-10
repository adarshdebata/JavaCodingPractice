// Define the Person class (blueprint)
class Person {

    // Properties
    String name;
    int age;

    // Constructor: Used to create objects and assign initial values to the fields
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method 
    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}

// The main class to demonstrate how to create and use objects
public class ClassObject {

    public static void main(String[] args) {
        // Create an object (instance) of the Person class
        Person person1 = new Person("Adarsh Kumar", 24);

        // Call the method to introduce the person
        person1.introduce();
    }
}
