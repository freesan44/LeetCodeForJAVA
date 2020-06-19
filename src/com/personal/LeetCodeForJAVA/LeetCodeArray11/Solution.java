package com.personal.LeetCodeForJAVA.LeetCodeArray11;

public class Solution {
    public int maxArea(int[] height) {
        //双指针，检测到面积比存量的大，就保存最大的，然后低的索引向内部移动
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while (left < right){
            int width = right - left;
            int curArea =  Math.min(height[left], height[right]) * width;
            maxArea = Math.max(maxArea, curArea);
            if (height[left] <= height[right]){
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        Solution sol = new Solution();
        int ret = sol.maxArea(height);
        System.out.println(ret);

    }
}
