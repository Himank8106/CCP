/* Link - https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/ */

class Solution {
    public int vowelStrings(String[] words, int left, int right) 
    {
    int count =0;
    for(int i=left;i<=right;i++)
        {
            if(words[i].startsWith("a") || words[i].startsWith("e") || words[i].startsWith("i") || words[i].startsWith("o") || words[i].startsWith("u"))
            {
                if(words[i].endsWith("a") || words[i].endsWith("e") || words[i].endsWith("i") || words[i].endsWith("o") || words[i].endsWith("u"))
                {
                    count++;
                }
            }
        }
    System.gc();
    return count;
    }
}

/* 
int count = 0;
        for(int i=left; i<=right; i++){
            if((words[i].charAt(0)=='a' || words[i].charAt(0)=='e' || words[i].charAt(0)=='i' || words[i].charAt(0)=='o' || words[i].charAt(0)=='u') && (words[i].charAt(words[i].length()-1)=='a' || words[i].charAt(words[i].length()-1)=='e' || words[i].charAt(words[i].length()-1)=='i' || words[i].charAt(words[i].length()-1)=='o' || words[i].charAt(words[i].length()-1)=='u')){
                count++;
            }
        }
        System.gc();
        return count;
*/
