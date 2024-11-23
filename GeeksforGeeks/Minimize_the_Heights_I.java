/* Link - https://www.geeksforgeeks.org/problems/minimize-the-heights-i/1 */

class Solution {
    public int getMinDiff(int k, int[] arr) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int max = arr[n-1]-arr[0];
        for(int i=1; i<n; i++){
            int mx = Math.max(arr[n-1]-k, arr[i-1]+k);
            int mn = Math.min(arr[0]+k, arr[i]-k);
            max = Math.min(max, mx-mn);
        }
        return max;
    }
}
