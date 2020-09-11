/*
By:- @harshitver31
*/

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
		Scanner sc = new Scanner( System.in);
		try {
		int n = sc.nextInt();
	
		int arr[] = new int[n+1];
		Arrays.fill(arr,0);
		for(int i = 1 ; i<=n;i++){
		    int k = sc.nextInt();
		    arr[k]+=1;
		    
		}
		for(int i= 1; i<=n;i++)
		    if(arr[i]==0)
		    System.out.println(i+" ");
		
    	}
    	catch(Exception e){
	}
	}
	
}
