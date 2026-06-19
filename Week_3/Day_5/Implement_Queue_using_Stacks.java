package Week_3.Day_5;

class MyQueue {

    Deque<Integer> inStack;         
    Deque<Integer> outStack;       
    public MyQueue() {
        this.inStack=new ArrayDeque<>();
        this.outStack=new ArrayDeque<>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        if(outStack.isEmpty()){
        while (!inStack.isEmpty()){
            int x=inStack.pop();
            outStack.push(x);
        }
        }
        int y=outStack.pop();
        return y;
    }
    public int peek(){
        if(outStack.isEmpty()){
        while(!inStack.isEmpty()){
            int x=inStack.pop();
            outStack.push(x);
        }
    }
        int top=outStack.peek();
        return top;
    }
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
