package com.personal.LeetCodeForJAVA.LeetCodeArray04;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2){
            return nums.length;
        }
        //双指针
        int left = 1;
        int right = 2;
        while (right < nums.length){
            if (nums[left] == nums[right] && nums[left-1] == nums[right]){
                right++;
            }
            else {
                int temp = nums[left+1];
                nums[left+1] = nums[right];
                nums[right] = temp;
                left++;
                right++;
            }
        }
        return left+1;
    }

    public static void main(String[] args) {
//        int[] numes = {1,1,2,4,5};
//        int[] numes = {1,1,1,2,2,3};
        int[] numes = {0,0,1,1,1,1,2,3,3};
        Solution sol = new Solution();
        int ret =  sol.removeDuplicates(numes);
        System.out.println(ret);
    }
}
