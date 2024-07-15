/* Link - https://www.geeksforgeeks.org/problems/smallest-number5829/1 */

class Solution {
    public String smallestNumber(int s, int d) {
        // code here
        if(s>9*d) return "-1";
        StringBuilder ans = new StringBuilder();
        while(d-->0){
            int i = (ans.length()==0)?1:0;
            if(d==0){
                ans.append(s);
                break;
            }
            while(d*9 < (s-i)) i++;
            ans.append(i);
            s -= i;
        }
        return ans.toString();
    }
}
