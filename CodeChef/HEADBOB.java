/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class HEADBOB
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0){
		    int n = sc.nextInt(), count=0;
		    String s = sc.next();
		    for(int i=0; i<s.length(); i++){
		        if(s.charAt(i)=='I'){
		            System.out.println("INDIAN");
		            count++;
		            break;
		        }
		        else if(s.charAt(i)=='Y'){
		            System.out.println("NOT INDIAN");
		            count++;
		            break;
		        }
		    }
		    if(count==0){
		        System.out.println("NOT SURE");
		    }
		} 
	}
}
