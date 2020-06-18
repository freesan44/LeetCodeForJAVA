package com.personal.LeetCodeForJAVA.LeetCodeArray07;

import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i<n; i++){
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] numes1 = {1,2,3,0,0,0};
        int[] numes2 = {2,5,6};
        int m = 3;
        int n = 3;
        Solution sol = new Solution();
        sol.merge(numes1, m, numes2, n);
        System.out.println(Arrays.toString(numes1));
    }
}
