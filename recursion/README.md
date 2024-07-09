## Introduction
Recursion is a powerful technique in programming where a function calls itself to solve a problem. This section covers the fundamental concepts of recursion, various examples, and common interview questions related to recursion in Java.

## Theory
### What is Recursion?
Recursion is a method of solving problems where the solution involves solving smaller instances of the same problem. A recursive function calls itself with modified parameters to work towards a base case, which stops the recursion.

### Base Case and Recursive Case
- **Base Case**: The condition under which the recursion stops.
- **Recursive Case**: The part of the function where the function calls itself with modified arguments.

### When to Use Recursion?
- When a problem can be broken down into smaller, similar sub-problems.
- When iterative solutions are less intuitive or more complex.

### Pros and Cons of Recursion
- **Pros**: Simplifies the code for problems involving trees, graphs, or combinatorial problems.
- **Cons**: Higher memory usage due to function call stack, and risk of stack overflow if not managed properly.

## Common Recursion Problems
Here are some classic recursion problems with explanations and solutions in Java. Refer to the respective code files for detailed implementations.

### Factorial
**What is it?** 
The factorial of a non-negative integer \(n\) is the product of all positive integers less than or equal to \(n\).

**Why is recursion preferred?**
Recursion simplifies the factorial calculation by breaking it down into smaller sub-problems: \(n! = n \times (n-1)!\). This is more intuitive than iterative solutions and avoids explicit loop management.

**Java Code Example:**
```java
public static int factorial(int n) {
    if (n == 0) return 1; // Base case
    return n * factorial(n - 1); // Recursive case
}
```
**Reference:** See the implementation in [Factorial.java](/recursion/Factorial.java).

### Fibonacci Sequence
**What is it?**
The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1.

**Why is recursion preferred?**
The recursive approach is natural for defining the Fibonacci sequence: \(F(n) = F(n-1) + F(n-2)\). It closely follows the mathematical definition.

**Java Code Example:**
```java
public static int fibonacci(int n) {
    if (n <= 1) return n; // Base case
    return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
}
```
**Reference:** See the implementation in [Fibonacci.java](/recursion/Fibonacci.java).

### Palindrome Check
**What is it?**
A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward (ignoring spaces, punctuation, and capitalization).

**Why is recursion preferred?**
Recursion simplifies checking palindromes by comparing the first and last characters and then checking the substring between them.

**Java Code Example:**
```java
public static boolean isPalindrome(String str) {
    if (str.length() <= 1) return true; // Base case
    if (str.charAt(0) != str.charAt(str.length() - 1)) return false; // Base case
    return isPalindrome(str.substring(1, str.length() - 1)); // Recursive case
}
```
**Reference:** See the implementation in [Palindrome.java](/recursion/Palindrome.java).

### Sum of Digits
**What is it?**
The sum of digits problem involves summing all the digits of a given integer.

**Why is recursion preferred?**
Recursion simplifies the sum of digits by breaking it down into the last digit plus the sum of the remaining digits.

**Java Code Example:**
```java
public static int sumOfDigits(int n) {
    if (n == 0) return 0; // Base case
    return n % 10 + sumOfDigits(n / 10); // Recursive case
}
```
**Reference:** See the implementation in [SumOfDigits.java](/recursion/SumOfDigits.java).

### Tower of Hanoi
**What is it?**
The Tower of Hanoi is a mathematical puzzle where you have three rods and a number of disks of different sizes. The objective is to move the entire stack to another rod, obeying the rules.

**Why is recursion preferred?**
The recursive solution to the Tower of Hanoi is elegant and closely follows the problem's recursive nature: moving \(n-1\) disks, moving the nth disk, and then moving \(n-1\) disks again.

**Java Code Example:**
```java
public static void towerOfHanoi(int n, char from, char to, char aux) {
    if (n == 0) return; // Base case
    towerOfHanoi(n - 1, from, aux, to); // Move n-1 disks from source to auxiliary
    System.out.println("Move disk " + n + " from " + from + " to " + to);
    towerOfHanoi(n - 1, aux, to, from); // Move n-1 disks from auxiliary to destination
}
```
**Reference:** See the implementation in [TowerOfHanoi.java](/recursion/TowerOfHanoi.java).

### Reverse a String
**What is it?**
Reversing a string involves creating a new string where the characters are in the opposite order.

**Why is recursion preferred?**
Recursion simplifies string reversal by moving the first character to the end and then reversing the remaining substring.

**Java Code Example:**
```java
public static String reverseString(String str) {
    if (str.isEmpty()) return str; // Base case
    return reverseString(str.substring(1)) + str.charAt(0); // Recursive case
}
```
**Reference:** See the implementation in [ReverseString.java](/recursion/ReverseString.java).

### Recursion in Java
Java provides robust support for recursion with the ability to define methods that call themselves. Recursive solutions are often more straightforward and easier to implement than their iterative counterparts, especially for problems that naturally fit into a divide-and-conquer strategy or when dealing with hierarchical data structures like trees.

## Interview Questions
1. **Explain the difference between direct and indirect recursion.**
   - Direct recursion occurs when a function calls itself directly. Indirect recursion involves a function calling another function that eventually calls the first function again.

2. **How does the stack frame work in recursion?**
   - Each recursive call creates a new stack frame containing the function's parameters and local variables. The stack frame is removed when the function completes, allowing previous frames to resume execution.

3. **Write a recursive function to generate all permutations of a string.**
   - This is a common interview problem where recursion is used to swap characters and generate permutations by fixing one character at a time and permuting the rest.
   **Implementation in** [StringPermutations.java](/recursion/StringPermutations.java).


4. **Discuss the space complexity of recursion.**
   - The space complexity of recursion is determined by the maximum depth of the recursion stack. For problems like the Fibonacci sequence, it can be high, leading to inefficiency and stack overflow risks.

5. **Compare recursive and iterative approaches for computing Fibonacci numbers.**
   - Recursive solutions are more intuitive but inefficient due to repeated calculations. Iterative solutions use loops and have better space and time complexity.

## Conclusion
Understanding recursion is crucial for tackling complex problems efficiently. Practice these examples and questions to master the concept of recursion. For detailed code implementations, refer to the respective files in the repository.