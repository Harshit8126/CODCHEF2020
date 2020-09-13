/*
By: @harshitver31
*/
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try
		{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0 ; i<=T ;i++)
		{
		    int sum = 0;
		    int n = sc.nextInt();
		    while(n>0)
		    {
		        int rem = n%10;
		        sum = sum + rem;
		        n = n/10;
		    }
		    System.out.println(sum);
	}
	}
	catch(Exception e){
}
}
}
