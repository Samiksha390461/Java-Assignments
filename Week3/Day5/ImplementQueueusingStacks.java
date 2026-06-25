class MyQueue {
    private ArrayDeque<Integer> incoming;
    private ArrayDeque<Integer> outgoing;

    public MyQueue() {
        incoming = new ArrayDeque<>();
        outgoing = new ArrayDeque<>();
        
    }
    
    public void push(int x) {
        incoming.push(x);
        
    }
    
    public int pop() {
        shiftElements();
        return outgoing.pop();
        
    }
    
    public int peek() {
        shiftElements();
        return outgoing.peek();

        
    }
    
    public boolean empty() {
        return incoming.isEmpty() && outgoing.isEmpty();
        
    }
    private void shiftElements() {

        if (!outgoing.isEmpty()) {
            return;
        }

        while (!incoming.isEmpty()) {
            outgoing.push(incoming.pop());
        }
    }
}
