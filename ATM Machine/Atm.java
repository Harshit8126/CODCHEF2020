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
		try {
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int a[] = new int[n];
		    for(int i = 0 ;i < n ; i++){
		       a[i] = sc.nextInt();
		    }
		    for(int i = 0 ; i < n ;i++){
		        if(k >= a[i])
		        {
		            k = k-a[i];
		            System.out.print("1");
		        }
		        else if (k < a[i] || k == 0)
		        {
		            System.out.print("0");
		        }
		    }
		    System.out.println();
		}
		
	}
	catch (Exception e){
	    System.out.println();
	}
}
}
