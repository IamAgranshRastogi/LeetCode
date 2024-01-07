// Better Approach : Using Sorting
// TC : O(nlogn)
// SC : O(1)

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
