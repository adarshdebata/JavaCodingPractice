public class BinaryRepresentation {
    public static void main(String[] args) {
        int number = 10;
        String binaryString = convertToBinary(number);
        System.out.println("Binary Representation of " + number + " is: " + binaryString);
    }

    // Method to convert a number to binary representation
    public static String convertToBinary(int number) {
        return Integer.toBinaryString(number);
    }
}
