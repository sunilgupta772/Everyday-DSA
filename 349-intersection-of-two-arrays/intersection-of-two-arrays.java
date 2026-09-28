class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      ArrayList<Integer> ans = new ArrayList<>();
       for(int i=0;i<nums1.length;i++){
        for(int j =0;j<nums2.length;j++){
            if(nums1[i] == nums2[j]){
                if(!ans.contains(nums1[i])){
                   ans.add(nums2[j]); 
                }
            }
        }
       }
       int i=0;
       int [] result = new int[ans.size()];
       for(int val : ans){
        result[i] = val;
        i++;
       } 
       return result;  
    }
}