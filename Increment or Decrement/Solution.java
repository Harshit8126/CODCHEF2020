/* Code By : @harshitver31
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	int N;
	try{
	    N = sc.nextInt();
	    if(N%4==0){
	        N++;
	    }
	    else{
	        N--;
	    }
	    System.out.println(N);
	}
	catch( Exception e){
	    System.out.println();
	}
	}
}
