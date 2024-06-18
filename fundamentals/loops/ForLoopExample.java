package loops;
public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { //i=1 -> is intial value and i<=10 upper limit of for loop and i++ increment after each itteration
            System.out.println("Count: " + i);
        }
    }
}
/*
Detailed Explaination

 Initialization (int i = 1;):
    This part is executed once at the very beginning of the loop.
    It declares and initializes an integer variable i with the value 1.
    This means that the loop counter i starts at 1.
    
Condition (i <= 10;):
    Before each iteration of the loop, this condition is checked.
    If the condition is true, the loop body (the code inside the loop) is executed.
    If the condition is false, the loop stops.
    Here, i <= 10 means the loop will keep running as long as i is less than or equal to 10.

Increment (i++):
    After each iteration of the loop, the i++ statement is executed.
    This increases the value of i by 1.
    i++ is shorthand for i = i + 1.

Final Iteration:
    When i is 10, the condition i <= 10 is true, so the loop body is executed one last time.
    After the loop body is executed, i is incremented to 11.
    The condition i <= 10 is checked again. This time, 11 is not less than or equal to 10, so the loop stops.
 */