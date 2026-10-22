// class Solution {
//     public boolean isPalindrome(int i,int j,String s){
//         while (i<j){
//             if(s.charAt(i) != s.charAt(j)){
//                 return isPalindrome(i,j-1,s)||isPalindrome(i+1,j,s);
//             }
//             i++;
//             j--; 
//         }
//         return true;
//     }
//     public boolean validPalindrome(String s) {
        
//         int i =0;
//         int j=s.length()-1;
        
//        return isPalindrome(i,j,s);
       
//     }
   
// }


// class Solution {
//     public boolean isPalindrome(int i, int j, String s) {
//         while (i < j) {
//             if (s.charAt(i) != s.charAt(j)) {
//                 return isPalindrome(i, j - 1, s) ||
//                        isPalindrome(i + 1, j, s);
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }
//     public boolean check(int i, int j, String s) {
//         while (i < j) {
//             if (s.charAt(i) != s.charAt(j)) {
//                 return false;
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }


//     public boolean validPalindrome(String s) {
//         int i = 0;
//         int j = s.length() - 1;

//         return isPalindrome(i, j, s);
//     }
// }
class Solution {
    boolean check(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))  return false;
            i++;
            j--;      
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return check(s, i + 1, j)|| check(s, i, j - 1);
            i++;
            j--;
        }
        return true;
    }
}