/* Link - https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/ */

class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int a: nums){
            if(a>0){
                set.add(a);
            }
        }
        return set.size();
    }
}
