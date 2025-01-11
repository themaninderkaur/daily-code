/*
Create Maximum Number

You are given two integer arrays nums1 and nums2 of lengths m and n respectively. nums1 and nums2 represent the digits of two numbers. You are also given an integer k.
Create the maximum number of length k <= m + n from digits of the two numbers. The relative order of the digits from the same array must be preserved.
Return an array of the k digits representing the answer.
*/

class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[] total = new int[nums1.length + nums2.length];
        Arrays.sort(total);
        for (int i = 0, j = total.length - 1; i < j; i++, j--) {
            int temp = total[i];
            total[i] = total[j];
            total[j] = temp;
        }
        int[] maxNum = new int[k];
        for(int i = 0; i < maxNum.length; i++){
            maxNum[i] = total[i];
        }
        return maxNum;
    }
}
