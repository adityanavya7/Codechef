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
	    long run = sc.nextLong();
	    long ovr = sc.nextLong();
	    long sco = sc.nextLong();
	    
	    long rem = 20 - ovr;
	    long ball = rem*6;
	    long maxR = ball*6;
	    long tot = sco+maxR;
	    
	    if(tot > run)
	        System.out.println("YES");
	    else
	        System.out.println("NO");
	    		// your code goes here
	}
}
