import java.util.*;

class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {

            if (st.isEmpty()) {
                st.push(s.charAt(i));
            }
            else {
                if (s.charAt(i) == st.peek()) {
                    st.pop();
                }
                else {
                    st.push(s.charAt(i));
                }
            }
        } // for loop ends here

        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.toString();

    } // method ends here
} // class ends here