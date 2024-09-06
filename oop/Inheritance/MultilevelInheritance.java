// Base class (Grandparent)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Intermediate class (Parent)
class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks.");
    }
}

// Derived class (Child)
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// - The `Dog` class inherits from `Mammal`, which in turn inherits from
// `Animal`.
// - `Dog` has access to methods from both `Mammal` and `Animal`.

public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Grandparent class method
        dog.walk(); // Parent class method
        dog.bark(); // Child class method
    }
}
