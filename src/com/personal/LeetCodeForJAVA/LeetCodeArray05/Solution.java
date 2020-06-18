package com.personal.LeetCodeForJAVA.LeetCodeArray05;

import java.util.Arrays;

public class Solution {
    public void sortColors(int[] nums) {
        if (nums.length <= 1){
            return;
        };
//        //双指针
//        for (int left =0;left<nums.length;left++){
//            for (int right = left+1;right< nums.length;right++){
//                if (nums[left]>nums[right])
//                {
//                    int temp = nums[left];
//                    nums[left] = nums[right];
//                    nums[right] = temp;
//                }
//            }
//        }
        //三指针
        if (nums.length == 2 && nums[0] > nums[1])
        {
            this.swap(0,1,nums);
            return;
        }
        int left = 0;
        int right = nums.length;
        int cur = 0;
        while (cur < right){
            System.out.println(Arrays.toString(nums));
            if (nums[cur] == 0){
                swap(left, cur , nums);
                left++;
                cur++;
            }
            else if (nums[cur] == 1){
                cur++;
            }
            else{
                right--;
                swap(cur, right, nums);
            }
        }
        return;
    }
    public void swap (int nums1, int nums2, int[] nums) {
        int temp = nums[nums1];
        nums[nums1] = nums[nums2];
        nums[nums2] = temp;
    }


    public static void main(String[] args) {
//        int[] numes = {2,0,2,1,1,0};
        int[] numes = {2,0,1};
//        int[] numes = {2,1};
//        int[] numes = {1,2,0};
        Solution sol = new Solution();
        sol.sortColors(numes);
        System.out.println(Arrays.toString(numes));
    }
}
