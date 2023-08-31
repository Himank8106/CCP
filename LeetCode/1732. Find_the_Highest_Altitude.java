/* Link - https://leetcode.com/problems/find-the-highest-altitude/ */

class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0, alt=0;
        for(int i=0; i<gain.length; i++){
            alt += gain[i];
            if(alt>max){
                max = Math.max(max,alt);
            } 
        }
        return max;
    }
}
