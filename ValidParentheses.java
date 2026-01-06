import java.util.Stack;

class ValidParentheses {
    public static void main(String[] args) {

        String s = "{()[]}";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // Closing brackets
            else {
                if (stack.isEmpty()) {
                    System.out.println(false);
                    return;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    System.out.println(false);
                    return;
                }
            }
        }

        // Stack must be empty at the end
        System.out.println(stack.isEmpty());
    }
}
