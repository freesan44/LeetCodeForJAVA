package com.personal.LeetCodeForJAVA.LeetCodeArray12;

import java.util.Arrays;

public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        //双浮动指针
        int minRet = Integer.MAX_VALUE;
        if (minRet <= 0){
            return 0;
        }
        int left = 0;
        int right = left;
        int subSumRet = nums[left];
        while (right <= nums.length-1){
//            System.out.println(left + " " + right + " subSum:" + subSumRet);
            //子数组少于目标数
            if (subSumRet<s){
                right++;
                //防止数组越界
                if (right >=nums.length){
                    return 0;
                }
                subSumRet += nums[right];
            }else
            {
                int[] subArr = Arrays.copyOfRange(nums, left, right+1);
                minRet = Math.min(minRet, subArr.length);
//                System.out.println(Arrays.toString(subArr) + " " + minRet);

                int tempSumRet = subSumRet - nums[left];
//                System.out.println("tempSubRet:"+tempSumRet);
                //如果减左没法维持目标数就右增，否则就左减
                if (tempSumRet >=s && subArr.length>1)
                {
                    left++;
                    subSumRet = tempSumRet;
                }
                else
                {
                    right++;
                    //防止数组越界
                    if (right >=nums.length){
                        continue;
                    }
                    subSumRet += nums[right];
                }

            }
        }
        return minRet;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int s = 7;
//        int[] nums = {10,2,3};
//        int s = 6;
//        int[] nums = {1,2,3,4,5};
//        int s = 15;
//        int[] nums = {1,1};
//        int s = 3;
        Solution sol = new Solution();
        int ret = sol.minSubArrayLen(s, nums);
        System.out.println(ret);

    }
}
