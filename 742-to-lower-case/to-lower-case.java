// class Solution {
//     public String toLowerCase(String s) {
//        String ans = s.toLowerCase(); 
//        return ans;
//     }
// }



class Solution {
    public String toLowerCase(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr >= 'A' && curr <= 'Z') {
                curr = (char)(curr + 32);
            }
            ans = ans + curr;
        }
        return ans;
    }
}