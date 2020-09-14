/*
By: @harshitver31
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
		Scanner sc = new Scanner(System.in);
		try {
        int T = sc.nextInt();
            for(int i = 0;i<T;i++)
            {
               int  A = sc.nextInt();
               int  B = sc.nextInt();
                if(A<B){
                System.out.println("<");
                }
                else if(A>B){
                    System.out.println(">");
                }
                else{
                    System.out.println("=");
                }
            }
	}
	 catch(Exception e) {
		}
	}
}
