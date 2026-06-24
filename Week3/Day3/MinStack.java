class MinStack {
    private static class Node {
        int value;
        int minSoFar;

        Node(int value, int minSoFar) {
            this.value = value;
            this.minSoFar = minSoFar;
        }
    }

    private java.util.ArrayDeque<Node> stack;

    public MinStack() {
         stack = new java.util.ArrayDeque<>();    
    }
    
    public void push(int val) {
        int currentMin = stack.isEmpty()
                ? val
                : Math.min(val, stack.peek().minSoFar);

        stack.push(new Node(val, currentMin));
        
    }
    
    public void pop() {
        stack.pop();
        
    }
    
    public int top() {
        return stack.peek().value;
        
    }
    
    public int getMin() {
        return stack.peek().minSoFar;
        
    }
}
