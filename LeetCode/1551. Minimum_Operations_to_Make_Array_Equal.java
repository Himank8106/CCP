/* Link - https://leetcode.com/problems/minimum-operations-to-make-array-equal/ */

class Solution {
    public int minOperations(int n) {
        return n*n/4;
    }
}

/* 
if (n % 2 == 0) {
    return (n/2)*(n/2);
} else {
    return ((n-1)/2)*((n+1)/2);
}
*/
