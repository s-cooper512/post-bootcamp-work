//problem: https://leetcode.com/problems/binary-search/

class Solution {
    public int search(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;

        while (min <= max) {
            int searchAvg = (min + max)/2;

            if (nums[searchAvg] == target) {
                return searchAvg;
            } else if (nums[searchAvg] > target) {
                max = searchAvg - 1;
            } else if (nums[searchAvg] < target) {
                min = searchAvg + 1;
            }
        }

        return -1;
    }
}