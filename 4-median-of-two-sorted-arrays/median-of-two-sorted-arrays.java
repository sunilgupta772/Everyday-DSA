class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] arr = new int[n1 + n2];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                arr[k] = nums1[i];
                i++;
            } else {
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = nums2[j];
            j++;
            k++;
        }
        int length = arr.length;
        if (length % 2 == 1) {
            return arr[length / 2];
        } else {
            return (arr[length / 2 - 1] + arr[length / 2]) / 2.0;
        }
    }
}