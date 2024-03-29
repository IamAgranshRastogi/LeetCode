/*
//                                   1.Sorting Approach
// Time Complexity: O(nlogn)
// Space Complexity: O(1)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
*/

/*
//                                   2. HashMap Approach
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i],1);
        }
        return false;
    }
}
*/


//                                   3.HashSet Approach
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
                if (set.contains(nums[i])) {
                    return true;
                }
                set.add(nums[i]);
        }
        return false;
    }
}

