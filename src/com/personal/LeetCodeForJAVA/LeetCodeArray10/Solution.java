package com.personal.LeetCodeForJAVA.LeetCodeArray10;

import java.util.Arrays;

public class Solution {
    public String reverseVowels(String s) {
        //双指针
        char[] charList = s.toCharArray();
        int left = 0;
        int right = charList.length-1;
        char[] metaList = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        while (left < right){
//            System.out.println(left + " " + right);
            int retSearchLeft = Arrays.binarySearch(metaList, charList[left]);
            int retSearchRight = Arrays.binarySearch(metaList, charList[right]);
//            System.out.println(retSearchLeft + "+" + retSearchRight);
            if (retSearchLeft >= 0 && retSearchRight >= 0){
                char temp = charList[left];
                charList[left] = charList[right];
                charList[right] = temp;
                left++;
                right--;
            }
            else if (retSearchLeft < 0){
                left++;
            }
            else {
                right--;
            }
        }
        s = String.valueOf(charList);
        return s;
    }
    public static void main(String[] args) {
//        String str = new String("hello");
        String str = new String("Aa");
        Solution sol = new Solution();
        String ret = sol.reverseVowels(str);
        System.out.println(ret);

    }
}
