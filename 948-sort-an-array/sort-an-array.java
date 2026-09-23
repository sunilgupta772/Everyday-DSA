// class Solution {

//     public int[] sortArray(int[] nums) {

//         int n = nums.length;

//         for (int i = 0; i < n - 1; i++) {

//             boolean flag = false;

//             for (int j = 0; j < n - i - 1; j++) {

//                 if (nums[j] > nums[j + 1]) {

//                     int temp = nums[j];
//                     nums[j] = nums[j + 1];
//                     nums[j + 1] = temp;

//                     flag = true;
//                 }
//             }

//             if (flag == false) {
//                 return nums;
//             }
//         }

//         return nums;
//     }
// }

class Solution{
    static void merge(int []nums,int[]a,int []b){
        int i=0;
        int j=0;
        int k=0;

        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                nums[k++] = a[i++];
            }else{
                nums[k++] = b[j++];
            }
        }
        while(i<a.length){
            nums[k++] = a[i++]; 
        }
        while(j<b.length){
            nums[k++] = b[j++];
        }
    }
    static void divide(int nums[]){
       int n = nums.length;
       if(n<=1) return;

        int idx =0;
       int a[] = new int[n/2];
       for(int i=0;i<a.length;i++){
        a[i] = nums[idx];
        idx++;
       }
       int b[] = new int[n-(n/2)];
       for(int i=0;i<b.length;i++){
        b[i] = nums[idx];
        idx++;
       }
       divide(a);
       divide(b);
       merge(nums,a,b);

    }
    public int[] sortArray(int nums[]){
      divide(nums);
       return nums; 
    }
}
