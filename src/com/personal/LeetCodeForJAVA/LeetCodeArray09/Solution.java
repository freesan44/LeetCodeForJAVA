package com.personal.LeetCodeForJAVA.LeetCodeArray09;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public boolean isPalindrome(String s) {
        //双指针
        char[] strList = s.toCharArray();
        if (strList.length <= 1){
            return true;
        }
        int left = 0;
        int right = strList.length-1;
        while (left < right) {
            Character leftChar = strList[left];
            Character rightChar = strList[right];
            System.out.println(leftChar + " " + rightChar);
            if (!Character.isLetter(leftChar)&& !Character.isDigit(leftChar)) {
                left++;
                continue;
            }
            if (!Character.isLetter(rightChar)&& !Character.isDigit(rightChar)) {
                right--;
                continue;
            }

            //转换成小写
            leftChar = Character.toLowerCase(leftChar);
            rightChar = Character.toLowerCase(rightChar);
            System.out.println(leftChar + " " + rightChar);
            if (leftChar.equals(rightChar)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = new String("A man, a plan, a canal: Panama");
//        String str = new String("0P");
//        String str = new String("ab2a");
        Solution sol = new Solution();
        boolean ret = sol.isPalindrome(str);
        System.out.println(ret);

    }
}
