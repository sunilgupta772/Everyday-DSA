class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int row = matrix.length,col= matrix[0].length;
       int st = 0,end = (row*col)-1;

       while(st<=end){
        int mid = st + (end-st)/2;
        int midEle = matrix[mid/col][mid%col];
        if(midEle== target) return true;

        if(midEle<target) st = mid+1;

        else{
            end = mid-1;
        }
       } 
       return false;
    }
}