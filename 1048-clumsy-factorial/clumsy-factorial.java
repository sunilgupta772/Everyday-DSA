
class Solution {
    public int clumsy(int n) {

        Stack<Integer> st = new Stack<>();

        st.push(n);

        int operation = 0;

        for (int i = n - 1; i >= 1; i--) {

            if (operation == 0) {
                st.push(st.pop() * i);
            }
            else if (operation == 1) {
                st.push(st.pop() / i);
            }
            else if (operation == 2) {
                st.push(i);
            }
            else {
                st.push(-i);
            }

            operation = (operation + 1) % 4;
        }

        int result = 0;

        while (!st.isEmpty()) {
            result += st.pop();
        }

        return result;
  

        // if (n == 1) return 1;
        // if (n == 2) return 2;
        // if (n == 3) return 6;
        // if (n == 4) return 7;

        // if (n % 4 == 0) return n + 1;
        // if (n % 4 == 1 || n % 4 == 2) return n + 2;

        // return n - 1;
    }
}

