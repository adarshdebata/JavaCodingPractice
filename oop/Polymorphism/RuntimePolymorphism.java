// Base class
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class
class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Another derived class
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        // Creating an instance of the Animal class
        Animal myAnimal = new Animal();
        myAnimal.sound();

        // Creating an instance of the Dog class, but referenced as an Animal
        Animal myDog = new Dog();
        myDog.sound(); // Calls the overridden sound method in the Dog class

        Animal myCat = new Cat();
        myCat.sound();
    }
}
