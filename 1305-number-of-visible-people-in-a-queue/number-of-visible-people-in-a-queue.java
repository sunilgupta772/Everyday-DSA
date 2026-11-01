class Solution {
    public int[] canSeePersonsCount(int[] height) {
        int n = height.length;
        int [] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(height[n-1]);
        ans[n-1] = 0;
        for(int i=n-2;i>=0;i--){
            int count = 0;
            while(st.size()>0 && st.peek()<=height[i]){
                count++;
                st.pop();
            }
            if(st.size()>0) count++ ; // very important line
            ans[i] = count;
            st.push(height[i]);
        }
        return ans;
    }
}