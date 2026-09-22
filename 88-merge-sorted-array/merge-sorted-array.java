class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
        Arrays.sort(nums2);

        int newArr[] = new int [m+n];

        int i=0;
        int j=0;
        int k=0;

        while(i < m && j < n){
            if(nums1[i]<nums2[j]){
                newArr[k] = nums1[i];
                i++;
                k++;
            }else{
                newArr[k] = nums2[j];
                k++;
                j++;
            }
        }
        while(i<m){
            newArr[k] = nums1[i];
            i++;
            k++;  
        }
        while(j<n){
            newArr[k] = nums2[j];
            k++;
            j++;
        }

        for(int in=0;in<newArr.length;in++){
            nums1[in] = newArr[in];
        }

        
    }
}