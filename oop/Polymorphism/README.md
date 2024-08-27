# Polymorphism in Java

## Overview

Polymorphism is a fundamental concept in object-oriented programming (OOP) that allows objects to be treated as instances of their parent class rather than their actual class. The term "polymorphism" means "many shapes" or "many forms," and it allows one interface to be used for a general class of actions. The specific action is determined by the exact nature of the situation.

In Java, polymorphism allows you to perform a single action in different ways. It plays a critical role in allowing a single method to behave differently based on the object that invokes it, making the code more modular, extensible, and maintainable.

### Types of Polymorphism

Java supports two types of polymorphism:

1. **Compile-Time Polymorphism (Static Polymorphism)**: This type of polymorphism is achieved by method overloading. It occurs when multiple methods have the same name but different parameters. The compiler determines which method to invoke based on the method signature (i.e., the method name and parameter types).

   - **Method Overloading**: Refers to having multiple methods in the same class with the same name but different parameters. It can differ by the number of parameters or the type of parameters. The compiler decides which method to call at compile time based on the method signature.

     **example**: [CompileTimePolymorphism.java](/oop/Polymorphism/CompileTimePolymorphism.java).

2. **Run-Time Polymorphism (Dynamic Polymorphism)**: This type of polymorphism is achieved by method overriding. It occurs when a subclass provides a specific implementation of a method that is already defined in its superclass. The method to be called is determined at runtime based on the actual object type.

   - **Method Overriding**: This allows a subclass to provide a specific implementation of a method that is already defined in its parent class. The method call is resolved at runtime, and the overridden method is executed based on the object's actual type, not the reference type.

     **exapmle**: [RuntimePolymorphism.java](/oop/Polymorphism/RuntimePolymorphism.java).

### Advantages of Polymorphism

1. **Code Reusability**: You can reuse methods with the same name for different types of objects, reducing code redundancy.
2. **Flexibility**: Polymorphism provides a way to perform a single action in different forms, depending on the object that invokes it.
3. **Maintenance**: Polymorphism simplifies code maintenance because the behavior of objects can be changed by simply changing the class implementation, without altering the code that uses the objects.
4. **Extensibility**: Adding new functionality is easier since new classes can easily integrate with existing ones using polymorphism.

### Disadvantages of Polymorphism

1. **Performance Overhead**: Polymorphism can introduce some performance overhead due to the dynamic method dispatch at runtime.
2. **Complexity**: The use of polymorphism can make the code more complex to understand and debug, especially when overridden methods are involved.

### Real-World Examples of Polymorphism

- **Vehicle System**: In a vehicle system, you could have a base class called `Vehicle` with a method `move()`. Subclasses like `Car`, `Bicycle`, and `Plane` can override the `move()` method to provide specific implementations.

- **Payment System**: In a payment processing system, you might have a `Payment` class with a method `processPayment()`. Subclasses like `CreditCardPayment`, `DebitCardPayment`, and `PayPalPayment` can override this method to handle payments differently.

## Interview Questions on Polymorphism

1. **What is polymorphism? Explain its types.**
   - Polymorphism is the ability of an object to take on many forms. The types of polymorphism are compile-time (static) and runtime (dynamic).

2. **How is polymorphism achieved in Java?**
   - Compile-time polymorphism is achieved using method overloading, and runtime polymorphism is achieved using method overriding.

3. **What is the difference between method overloading and method overriding?**
   - Method overloading occurs within the same class and is used to define multiple methods with the same name but different parameters. Method overriding occurs in a subclass and is used to provide a specific implementation of a method defined in the superclass.

4. **Can we override static methods in Java? Why or why not?**
   - No, static methods cannot be overridden because method overriding is based on dynamic binding at runtime, and static methods are bound at compile time (static binding).

5. **What is the role of the `@Override` annotation in Java?**
   - The `@Override` annotation is used to indicate that a method is intended to override a method in a superclass. It helps catch errors at compile time if the method does not actually override any method from its superclass.

6. **Explain with an example how polymorphism increases flexibility in code.**
   - By using polymorphism, a single interface can be used to represent different types of objects. For instance, if you have a base class `Shape` with a method `draw()`, subclasses like `Circle` and `Rectangle` can override the `draw()` method. You can then use a `Shape` reference to call the `draw()` method, allowing for different shapes to be drawn using the same code.

7. **What is the significance of the `super` keyword in polymorphism?**
   - The `super` keyword is used to refer to the immediate parent class object. It can be used to access superclass methods and constructors. In the context of polymorphism, it helps call the overridden method from the superclass.

8. **Can constructors be overloaded and overridden in Java? Explain.**
   - Constructors can be overloaded but not overridden. Constructor overloading allows a class to have multiple constructors with different parameter lists. Constructors cannot be overridden because they are not inherited by subclasses.

9. **What is late binding in Java?**
   - Late binding refers to the process of resolving method calls at runtime. It is associated with runtime polymorphism, where the method to be executed is determined at runtime based on the actual object's type.

10. **How does polymorphism work with interfaces in Java?**
    - Polymorphism in interfaces allows a class to implement multiple interfaces, and an object can be referenced by any interface it implements. The method calls are resolved at runtime, allowing different implementations of the method based on the actual class.

### Conclusion

Polymorphism is a powerful feature of Java that enhances code flexibility, reusability, and maintainability. Understanding and implementing polymorphism correctly can greatly improve the design of your applications. By exploring the examples provided in `CompileTimePolymorphism.java` and `RuntimePolymorphism.java`, you can see firsthand how polymorphism works and why it is beneficial.
