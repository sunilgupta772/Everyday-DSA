class Solution {
    public static int sum(int num){
        int total =0;
        while(num>0){
            int digit = num%10;
            total +=digit;
            num /=10;
        }
        while(total >= 10){
           return  sum(total);
        }
        return total;
    }
    public int addDigits(int num) {
       return sum(num);  
    }
}