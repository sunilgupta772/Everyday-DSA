class Solution {
    public int[] shuffle(int[] nums, int n) {
        int idx = nums.length;
        int[] arr = new int[idx];
        int j =n; int i=0;
        while(i<idx && j<idx){
            if(i%2==0){
                arr[i]=nums[i/2];
            }else{
                arr[i]=nums[j];
                j++;
            }
            i++;
            

        }
        return arr;
    }
}