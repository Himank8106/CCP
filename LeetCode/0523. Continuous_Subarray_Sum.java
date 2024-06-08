/* Link - https://leetcode.com/problems/continuous-subarray-sum/ */

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum=0;
        map.put(0,-1);
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            int remainder = sum%k;
            if(map.containsKey(remainder)){
                if(i-map.get(remainder)>=2) return true;
            }
            else map.put(remainder,i);
        }
        return false;
    }
}
