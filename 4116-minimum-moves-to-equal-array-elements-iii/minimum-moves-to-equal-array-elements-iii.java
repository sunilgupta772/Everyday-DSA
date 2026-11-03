class Solution {
    public int minMoves(int[] nums) {
       int max = Integer.MIN_VALUE;
       int count =0;
       for(int ele:nums) max = Math.max(ele,max); 
        for(int i = 0;i<nums.length;i++){
            count += max-nums[i]; 
        }
        return count;
    }
}