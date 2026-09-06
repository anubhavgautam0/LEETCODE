class Solution {
    public boolean isValid(String s) 
    {
        
       Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            // Push the corresponding expected closing bracket
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } 
            // If it's a closing bracket, check if it matches the top of the stack
            else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        
        // Valid only if we matched all brackets
        return stack.isEmpty();
    }
}