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
		int n=sc.nextInt(), x=sc.nextInt(), y=sc.nextInt();
		String s = sc.next();
		String a = s.replace("0","");
		String b = s.replace("1","");
		if(a.length()!=0 && b.length()!=0){
		    System.out.println(Math.min(x,y));
		}
		else{
		    System.out.println(0);
		}
		
	}}
}

/*
	Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while( t-- > 0 ){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    String s = sc.next();
		    
		    int one = 0;
		    int zero = 0;
		    
		    for( char c : s.toCharArray()  ){
		        if( c == '1' ) one++;
		        else zero++;
		    }
		    
		    if( one == 0 || zero == 0 ){
		        System.out.println(0);
		    }
		    else{
		        System.out.println( x > y ? y : x  );
		    }
		    
		    
		}
*/
