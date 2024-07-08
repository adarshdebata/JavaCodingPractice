# Number Handling in Java

## Introduction
This section covers various fundamental concepts related to number handling in Java. Each concept is explained with code examples, making it easier for you to understand and apply them in real-world scenarios and during interviews.

## Topics Covered
1. **Armstrong Number**
2. **Even/Odd Checker**
3. **Prime Number Checker**
4. **Palindrome Number Checker**
5. **Reverse Number**
6. **Perfect Number**
7. **Sum of Digits**
8. **LCM (Least Common Multiple)**
9. **GCD (Greatest Common Divisor)**
10. **Binary Representation**
11. **Random Number Generation**

## 1. Armstrong Number
### Explanation
An Armstrong number (also known as a narcissistic number) is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
### Example
- **File:** [ArmstrongNumber.java](ArmstrongNumber.java)
- **Usage:** `153` is an Armstrong number because \(1^3 + 5^3 + 3^3 = 153\).

### Interview Insight
Interviewers might ask you to write a program to check if a given number is an Armstrong number. They may also extend the problem to find all Armstrong numbers within a certain range.

## 2. Even/Odd Checker
### Explanation
This concept checks if a number is even or odd.
### Example
- **File:** [EvenOddChecker.java](EvenOddChecker.java)
- **Usage:** `4` is even, `7` is odd.

### Interview Insight
This is a basic yet common interview question to test your understanding of modulo operations.

## 3. Prime Number Checker
### Explanation
A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.
### Example
- **File:** [PrimeNumber.java](PrimeNumber.java)
- **Usage:** `5` is a prime number, `4` is not.

### Interview Insight
Interviewers often ask candidates to check if a number is prime and may further ask for optimization techniques like checking divisors only up to the square root of the number.

## 4. Palindrome Number Checker
### Explanation
A palindrome number is a number that remains the same when its digits are reversed.
### Example
- **File:** [PalindromeNumber.java](PalindromeNumber.java)
- **Usage:** `121` is a palindrome, `123` is not.

### Interview Insight
This concept tests your understanding of loops and conditional statements. It can be extended to check palindromic sequences in arrays.

## 5. Reverse Number
### Explanation
Reversing a number means reversing its digits.
### Example
- **File:** [ReverseNumber.java](ReverseNumber.java)
- **Usage:** Reverse of `12345` is `54321`.

### Interview Insight
This is often asked to test your understanding of loops and arithmetic operations.

## 6. Perfect Number
### Explanation
A perfect number is a number that is equal to the sum of its proper divisors, excluding itself.
### Example
- **File:** [PerfectNumber.java](PerfectNumber.java)
- **Usage:** `28` is a perfect number because its divisors (excluding itself) sum up to `28`.

### Interview Insight
Interviewers may ask you to find if a number is perfect and then to find all perfect numbers in a given range.

## 7. Sum of Digits
### Explanation
Calculating the sum of all digits of a given number.
### Example
- **File:** [SumOfDigits.java](SumOfDigits.java)
- **Usage:** Sum of digits of `12345` is `15`.

### Interview Insight
This question is common for understanding loops and arithmetic operations. It can be extended to digit root calculations.

## 8. LCM (Least Common Multiple)
### Explanation
LCM of two integers is the smallest positive integer that is divisible by both.
### Example
- **File:** [LCM.java](LCM.java)
- **Usage:** LCM of `15` and `20` is `60`.

### Interview Insight
This question often comes along with GCD, and interviewers may ask you to use the relationship between LCM and GCD to optimize the solution.

## 9. GCD (Greatest Common Divisor)
### Explanation
GCD of two integers is the largest positive integer that divides both without a remainder.
### Example
- **File:** [GCD.java](GCD.java)
- **Usage:** GCD of `54` and `24` is `6`.

### Interview Insight
This is a common interview question, and candidates are expected to implement the Euclidean algorithm for efficiency.

## 10. Binary Representation
### Explanation
Converting a number to its binary form.
### Example
- **File:** [BinaryRepresentation.java](BinaryRepresentation.java)
- **Usage:** Binary representation of `10` is `1010`.

### Interview Insight
This tests your understanding of number systems and can be extended to other base conversions.

## 11. Random Number Generation
### Explanation
Generating random numbers within a specified range.
### Example
- **File:** [RandomNumber.java](RandomNumber.java)
- **Usage:** Generating a random number between `1` and `100`.

### Interview Insight
Random number generation questions test your familiarity with standard libraries and can be extended to simulate random events or distributions.

## Conclusion
Mastering these concepts will greatly help you in both academic and interview settings. Each code example provided is aimed to give you a clear understanding and prepare you for related questions that might be asked in technical interviews.
