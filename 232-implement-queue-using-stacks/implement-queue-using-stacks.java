class MyQueue {
        Stack<Integer> input = new Stack<>();
        Stack<Integer> output = new Stack<>();
        int size = 0;

    public MyQueue() {
        
    }
    
    public void push(int x) {
        input.push(x);
        size++;
    }
    
    public int pop() {
        if(size<0) return -1;
        while(!input.isEmpty()){
            output.push(input.pop());
            
        }

        int ans = output.pop();
        while(!output.isEmpty()){
            input.push(output.pop());
        }
        return ans;


    }
    
    public int peek() {
        if(size<0) return -1;
        while(!input.isEmpty()){
            output.push(input.pop());
            
        }

        int ans1 = output.peek();
        while(!output.isEmpty()){
            input.push(output.pop());
        }
        return ans1;
        
    }
    
    public boolean empty() {
        if(input.isEmpty()) return true;
        else return false;
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