package com.personal.LeetCodeForJAVA.LeetCodeArray03;



class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1){
            return nums.length;
        }
        //双指针
        int left = 0;
        int right = 1;
        while (right < nums.length){
            if (nums[left] == nums[right]){
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
        int[] numes = {1,1,2,4,5};
        Solution sol = new Solution();
        int ret =  sol.removeDuplicates(numes);
        System.out.println(ret);
    }
}

