//  Interface 1
interface Walkable {
    void walk();
}

// Interface 2
interface Runnable {
    void run();
}

// Class inheritaing multiple interfaces
class Dog implements Walkable, Runnable {
    @Override
    public void walk() {
        System.out.println("The dog can walk.");
    }

    @Override
    public void run() {
        System.out.println("The dog can run.");
    }
}

/*
 * - The `Dog` class implements two interfaces: `Walkable` and `Runnable`.
 * - This demonstrates how Java achieves multiple inheritance by using
 * interfaces.
 */
public class MultipleInheritance {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.walk(); // Interface method implementation
        dog.run(); // Interface method implementation
    }

}
