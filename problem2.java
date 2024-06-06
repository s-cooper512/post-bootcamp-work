//problem: https://leetcode.com/problems/sort-the-people/

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i <= names.length-1; i++) {
            for (int j = 0; j <= names.length-1; j++) {
                if (heights[i] > heights[j]) {
                    int tempHeight = heights[i];
                    String tempName = names[i];

                    heights[i] = heights[j];
                    heights[j] = tempHeight;

                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }

        return names;
    }
}