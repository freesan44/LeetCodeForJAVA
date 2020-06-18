package com.personal.LeetCodeForJAVA.LeetCodeArray08;

import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ret = null;
        for (int i = 0; i<numbers.length; i++){
            int target2 = target - numbers[i];
            int[] rangeList = Arrays.copyOfRange(numbers, i+1, numbers.length);
//            System.out.println(target2);
//            System.out.println(Arrays.toString(rangeList));
            int target2Ret = Arrays.binarySearch(rangeList, target2);
            if (target2Ret >= 0){
                ret = new int[]{i+1, target2Ret+i+1+1};
                break;
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
//        int[] numbers = {5,25,75};
//        int target = 100;
//        int[] numbers = {1,2,3,4,4,9,56,90};
//        int target = 8;
        Solution sol = new Solution();
        int[] ret = sol.twoSum(numbers, target);
        System.out.println(Arrays.toString(ret));

    }
}
