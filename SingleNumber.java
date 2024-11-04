/*
136. Single Number
Difficulty: Easy
Link: https://leetcode.com/problems/single-number/description/
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        return findNum(nums, nums.length-1);
    }
    public static int findNum(int[] nums, int n){
        if(n==0)
            return nums[n];
        return nums[n]^findNum(nums, n-1);
    }
}