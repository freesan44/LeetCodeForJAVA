package com.personal.LeetCodeForJAVA.LeetCodeArray06;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int ret = 0;
        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        return nums[nums.length-k];
    }


    public static void main(String[] args) {
        int[] numes = {3,2,1,5,6,4};
        int k = 2;
        Solution sol = new Solution();
        int ret = sol.findKthLargest(numes, k);
        System.out.println(ret);
    }
}
