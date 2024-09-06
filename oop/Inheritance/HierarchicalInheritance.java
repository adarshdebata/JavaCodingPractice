// Base class (Parent)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class (Child 1)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Derived class (Child 2)
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

// - Both `Dog` and `Cat` classes inherit from the `Animal` class.
// - Each subclass (Dog and Cat) has access to the methods of the `Animal`
// class, but can also define its own unique behaviors.

public class HierarchicalInheritance {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat(); // Inherited method
        dog.bark(); // Dog specific method

        cat.eat(); // Inherited method
        cat.meow(); // Cat specific method
    }
}
