/*
By : @harshitver31
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc = new Scanner(System.in);
	   int T;
	   int M;
	   int N;
	   try{
	       T = sc.nextInt();
	       for(int i=0;i<T;i++){
	           M = sc.nextInt();
	           N = sc.nextInt();
	          int  row = N-1;
	          int col = M-1;
	          int ans = row*col;
	       System.out.println(ans);
	       }
	   }
	   catch(Exception e){
	       System.out.println(e);
	   }
	}
}
