class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        int n = nums.length;
        while(i<nums.length){
            if(nums[i] == i || nums[i] == n) i++;
            else{
                int idx = nums[i];
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
            }
        }
        i=0;
        while(i<nums.length){
            if(nums[i] != i){

                return i;
            }
            i++;
            
        }
        return n;
    }
}