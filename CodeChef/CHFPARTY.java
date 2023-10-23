/* Link - https://www.codechef.com/problems/CHFPARTY */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    int count = 0;
		    for(int i=0; i<n; i++){
		        if(arr[i]<=count){
		            count++;
		        }
		        else{
		            break;
		        }
		    }
		    System.out.println(count);
		}
	}
}
