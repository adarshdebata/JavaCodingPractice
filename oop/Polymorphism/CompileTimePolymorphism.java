class CompileTimePolymorphism {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        CompileTimePolymorphism obj = new CompileTimePolymorphism();
        System.out.println("Sum of 10 and 20: " + obj.add(10, 20));
        System.out.println("Sum of 10, 20 and 30: " + obj.add(10, 20, 30));
        System.out.println("Sum of 10.5 and 20.5: " + obj.add(10.5, 20.5));
    }
}
