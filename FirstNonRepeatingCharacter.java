public class FirstNonRepeatingCharacter {
    public static int firstUniqChar(String s) {
        int[] charCount = new int[26];
                for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            
        }
                for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        String[] testCases = {"leetcode", "loveleetcode", "aabb"};
        for (String testCase : testCases) {
            System.out.println("Input: " + testCase + " -> Output: " + firstUniqChar(testCase));
        }
    }
}
