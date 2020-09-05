/* package codechef; // don't place package name! */
/* Code By : @harshitver31
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc =new Scanner(System.in);
	    
	int N1;
	int N2;
	int N3;
	try{
	    N1 = sc.nextInt();
	    N2 = sc.nextInt();
	    if(N1>N2){
	        N3=N1-N2;
	    }
	    else{
	        N3=N1+N2;
	    }
	    System.out.println(N3);
	    
	}
	catch(Exception e)
	{
	   System.out.println();
	}
	}
}
