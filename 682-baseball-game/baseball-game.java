class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                st.pop();
            }else if(operations[i].equals("D")){
                st.push(2*st.peek());
            }else if(operations[i].equals("+")){
                int top = st.pop();
                int sum = st.peek() + top;
                st.push(top);
                st.push(sum);
            }else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        while(!st.isEmpty()){
            
            ans+=st.peek();
            st.pop();


        }
        return ans;
    }
}