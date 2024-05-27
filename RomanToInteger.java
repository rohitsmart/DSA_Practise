import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    // Method to convert Roman numeral to integer
    public static int romanToInt(String s) {
        // Map to store Roman numerals and their corresponding integer values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0; // Variable to store the result  5,4,104,94,1094,994,1994
        int prevValue = 0; // Variable to keep track of the previous Roman numeral value

        // Iterate through the string from the end to the beginning
        for (int i = s.length() - 1; i >= 0; i--) {// i 6 to 0
            char currentChar = s.charAt(i);// V,I,C,X,M,C,M
            int currentValue = romanMap.get(currentChar);// 5,1,100,10,1000,100,1000

            // If the current value is less than the previous value, subtract it from the total
            // Otherwise, add it to the total
            if (currentValue < prevValue) {
                total -= currentValue;//5-1>4,104-10>94,1094-100>994
            } else {
                total += currentValue;//0+5>5,4+100>104, 94+1000>1094,994+1000
            }

            // Update the previous value
            prevValue = currentValue;// 5,1,100,10,1000,100,1000
        }

        return total; // Return the final result
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(romanToInt("III")); // Output: 3
        System.out.println(romanToInt("IV")); // Output: 4
        System.out.println(romanToInt("IX")); // Output: 9
        System.out.println(romanToInt("LVIII")); // Output: 58
        System.out.println(romanToInt("MCMXCIV")); // Output: 1994
    }
}
