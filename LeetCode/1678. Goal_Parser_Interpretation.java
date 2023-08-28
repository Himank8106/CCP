/* Link - https://leetcode.com/problems/goal-parser-interpretation/ */

class Solution {
    public String interpret(String c) {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<c.length();i++){
           if(c.charAt(i)=='G'){
               s.append('G');
           }else if(c.charAt(i)=='(' && c.charAt(i+1)==')'){
               s.append('o');
               i++;
           }else{
               s.append("al");
               i+=3;
           }
        }
        //return s.toString();
        return String.valueOf(s);
    }
}

/*
command = command.replace("(al)","al");
command = command.replace("()","o");
return command;
*/
