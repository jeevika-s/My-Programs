import java.util.Stack;

public class PostfixToInfix {
    // Function to check if a character is an operator
    public static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/');
    }

    // Function to convert postfix to infix
    public static String postfixToInfix(String postfix) {
        Stack<String> stack = new Stack<>();
        
        // Iterate through each character in the postfix expression
        for (int i = 0; i < postfix.length(); i++) {
            char current = postfix.charAt(i);
            
            // If current character is an operand, push it to the stack
            if (!isOperator(current)) {
                stack.push(String.valueOf(current));
            } else {
                // If current character is an operator, pop two operands from stack
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                
                // Form a string "(operand1 operator operand2)" and push it back to the stack
                String infix = "(" + operand1 + current + operand2 + ")";
                stack.push(infix);
            }
        }
        
        // The final element in the stack will be the infix expression
        return stack.pop();
    }

    public static void main(String[] args) {
        String infix = "a-b*d/e(b+c)";
        System.out.println("Postfix Expression: " + postfix);
        System.out.println("Infix Expression: " + postfixToInfix(postfix));
    }
}
