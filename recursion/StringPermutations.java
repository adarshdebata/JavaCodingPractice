package recursion;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {

    public static void main(String[] args) {
        String str = "ABC";
        List<String> permutations = generatePermutations(str);
        System.out.println("All permutations of the string are: ");
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }

    // Function to generate all permutations of a given string
    public static List<String> generatePermutations(String str) {
        List<String> result = new ArrayList<>();
        permute(str, "", result);
        return result;
    }

    // Helper recursive function to generate permutations
    private static void permute(String str, String prefix, List<String> result) {
        // Base case: if the string is empty, add the prefix to result
        if (str.isEmpty()) {
            result.add(prefix);
        } else {
            // Recursive case: iterate over the string
            for (int i = 0; i < str.length(); i++) {
                // Choose the character at index i
                char ch = str.charAt(i);
                // Create the remaining string without the chosen character
                String remaining = str.substring(0, i) + str.substring(i + 1);
                // Recursively call permute with the remaining string and updated prefix
                permute(remaining, prefix + ch, result);
            }
        }
    }
}
