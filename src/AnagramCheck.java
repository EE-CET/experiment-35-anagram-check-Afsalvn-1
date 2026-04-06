import java.util.Scanner;
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read both strings and immediately convert to lowercase for case-insensitivity
        if (sc.hasNextLine()) {
            String s1 = sc.nextLine().toLowerCase();
            String s2 = sc.nextLine().toLowerCase();
            
            // Quick optimization: If they aren't the same length, they can't be anagrams!
            if (s1.length() != s2.length()) {
                System.out.println("false");
            } else {
                // Convert to char arrays and sort them
                char[] arr1 = s1.toCharArray();
                char[] arr2 = s2.toCharArray();
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                
                // If the sorted arrays are identical, they are perfect anagrams
                System.out.println(Arrays.equals(arr1, arr2));
            }
        }
        sc.close();
    }
}
