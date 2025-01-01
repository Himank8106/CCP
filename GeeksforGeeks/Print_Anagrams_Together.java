/* Link - https://www.geeksforgeeks.org/problems/print-anagrams-together/1 */

class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        ArrayList<ArrayList<String>>al=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            ArrayList<String>s=new ArrayList<>();
            char ch[]=arr[i].toCharArray();
            Arrays.sort(ch);
            for(int j=i;j<arr.length;j++)
            {
                char jch[]=arr[j].toCharArray();
                Arrays.sort(jch);
                String str1=new String(ch);
                String str2=new String(jch);
                if(str1.equals(str2))
                {
                    s.add(arr[j]);
                    arr[j]="0";
                }
            }
            if(!s.contains("0"))
            {
                al.add(s);
            }
        }
        return al;
    }
}
