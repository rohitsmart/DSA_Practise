public class LongestPalindrome {

    public static String longestPalindrome(String text) {
        int longestLength = 0;
        String longestSubstring = "";
        for (int i = 0; i < text.length(); i++) {
            for (int j = i; j < text.length(); j++) {
                String substring = text.substring(i, j + 1);
                if (isPalindrome(substring) && substring.length() > longestLength) {
                    longestLength = substring.length();
                    longestSubstring = substring;
                }
            }
        }
        return longestSubstring;
    }

    private static boolean isPalindrome(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        return str.equals(reversed.toString());
    }

    public static void main(String[] args) {
        String text = "babad";
        String longestPalindrome = longestPalindrome(text);
        System.out.println("Longest palindrome in '" + text + "': " + longestPalindrome);
    }
}
