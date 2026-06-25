class Solution {
    public int evalRPN(String[] tokens) {
         int[] stack = new int[tokens.length];
        int top = -1;

        for (String token : tokens) {

            if (isOperator(token)) {

                int second = stack[top--];
                int first = stack[top--];

                stack[++top] = calculate(first, second, token);

            } else {
                stack[++top] = Integer.parseInt(token);
            }
        }

        return stack[top];
    }

    private boolean isOperator(String s) {
        return s.length() == 1 &&
                (s.charAt(0) == '+' ||
                 s.charAt(0) == '-' ||
                 s.charAt(0) == '*' ||
                 s.charAt(0) == '/');
    }

    private int calculate(int a, int b, String op) {

        switch (op.charAt(0)) {
            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            default:
                return a / b;
        }

        
    }
}
