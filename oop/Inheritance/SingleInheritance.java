
// Base class (Parent)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class (Child)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

/**
 * - The `Dog` class inherits from the `Animal` class.
 * - The `Dog` can now use the `eat()` method defined in the `Animal` class,
 * showcasing single inheritance.
 */
public class SingleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Call the eat method inherited from the Animal class
        dog.bark();

    }
}