# Inheritance in Java

Inheritance is a fundamental concept in Object-Oriented Programming (OOPs) that allows one class (known as a **subclass** or **child class**) to inherit properties and behaviors (fields and methods) from another class (known as a **superclass** or **parent class**). This promotes code reusability and establishes a natural **hierarchy** between classes.

In Java, inheritance is achieved using the `extends` keyword, allowing a subclass to inherit the non-private members of the superclass.

## Types of Inheritance in Java

1. **Single Inheritance** 🐾
2. **Multilevel Inheritance** 📚
3. **Hierarchical Inheritance** 🌳
4. **Multiple Inheritance _(Supported via Interfaces)_** ⚙️

> **_Note:_** Java does not support multiple inheritance with classes directly to avoid complexity and ambiguity. However, it can be achieved using interfaces.


### 1. Single Inheritance 🐾

Single inheritance occurs when a class inherits from only one superclass. This is the simplest form of inheritance.

**Example:** Consider an `Animal` class with a method `eat()`. A `Dog` class can inherit from `Animal`, gaining access to the `eat()` method, while also defining its own method `bark()`.

**Java Example:** [SingleInheritance.java](./SingleInheritance.java)


### 2. Multilevel Inheritance 📚

Multilevel inheritance occurs when a class is derived from a class that is already derived from another class, creating a multi-level hierarchy.

**Example:** Imagine a `Vehicle` class. A `Car` class extends `Vehicle`, and an `ElectricCar` class extends `Car`. The `ElectricCar` inherits properties from both `Vehicle` and `Car`.


**Java Example:** [MultilevelInheritance.java](./MultilevelInheritance.java)


### 3. Hierarchical Inheritance 🌳

Hierarchical inheritance occurs when multiple classes inherit from a single superclass, forming a tree-like structure.

**Example:** Consider a `Shape` class with a `draw()` method. Different shapes like `Circle`, `Square`, and `Triangle` inherit from the `Shape` class and implement their own version of `draw()`.


**Java Example:** [HierarchicalInheritance.java](./HierarchicalInheritance.java)


### 4. Multiple Inheritance (Supported via Interfaces) ⚙️

Multiple inheritance occurs when a class can inherit properties from more than one parent class. Java doesn’t support multiple inheritance with classes to avoid complexity, but it is achievable through interfaces.

**Example:** Let's say we have two interfaces, `Flyable` and `Swimmable`. A `Duck` class can implement both, inheriting behaviors from both interfaces.

**Java Example:** [MultipleInheritance.java](./MultipleInheritance.java)


#### Why Does Java Not Support Multiple Inheritance with Classes?

Java avoids multiple inheritance with classes to eliminate the complexity and ambiguity known as the **Diamond Problem**. This occurs when a class inherits from two classes that both inherit from the same superclass, causing confusion over which properties should be inherited.

By using **interfaces**, Java allows a class to inherit behavior from multiple sources without the associated ambiguity, since interfaces only provide method declarations without implementations.

## Common Interview Questions on Inheritance

### 1. **What is inheritance, and why is it used in Java?**  
Inheritance is a mechanism where one class inherits the fields and methods of another class. It is used to promote **code reusability**, establish a relationship between classes, and enable **polymorphism**.

### 2. **Can you explain the difference between single inheritance and multiple inheritance?**  
Single inheritance allows a class to inherit from one superclass, whereas multiple inheritance would allow a class to inherit from more than one superclass. Java supports single inheritance with classes and multiple inheritance through **interfaces**.

### 3. **What is the Diamond Problem, and how does Java address it?**  
The Diamond Problem arises in multiple inheritance when a class inherits from two classes that both inherit from a common superclass, leading to ambiguity. Java addresses this by supporting multiple inheritance only through interfaces.

### 4. **Can you override a method in the superclass? What are the rules?**  
Yes, you can override a method in the superclass. The overriding method must have the **same name**, **return type**, and **parameters**. Additionally, the access level cannot be more restrictive.

### 5. **Explain the `super` keyword in Java.**  
The `super` keyword refers to the immediate parent class object. It is used to access methods or constructors of the parent class that are hidden by the subclass.


### Additional Notes

**Constructor Chaining:** Constructors in a class hierarchy are called in a **top-down** manner. When an object of the most derived class is created, the constructor of the parent class is called first.
  
**Method Overriding vs. Method Overloading:** Inheritance is key in method overriding, where a subclass provides a specific implementation of a method defined in its superclass. **Method overloading is different, as it is a compile-time polymorphism where methods have the same name but different parameters.

<p align="center">
  <strong><em>-----end-----</em></strong>
</p>

