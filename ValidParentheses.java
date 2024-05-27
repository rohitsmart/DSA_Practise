
public class ValidParentheses {
    public static boolean isValid(String s) {
        // The maximum size of the stack is the length of the string
        char[] stack = new char[s.length()];
        int top = -1; // Initialize top of stack
        
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(': 
                    stack[++top] = ')'; // Push corresponding closing bracket// ({]})
                    break;
                case '{': 
                    stack[++top] = '}'; // Push corresponding closing bracket// )}
                    break;
                case '[': 
                    stack[++top] = ']'; // Push corresponding closing bracket
                    break;
                default:
                    if (top == -1 || stack[top--] != c) {
                        return false; // Check for match or empty stack
                    }
            }
        }
        
        return top == -1; // Check if stack is empty
    }
    public static void main(String[] args) {
        String[] testCases = {"()"};
        for (String testCase : testCases) {
            System.out.println(testCase + ": " + isValid(testCase));
        }
    }
}
