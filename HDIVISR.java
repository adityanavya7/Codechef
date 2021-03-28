/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int test = sc.nextInt();
	    int count = 1;
	    for(int i = 2; i < 11; i++)
	    {
	        if(test%i == 0)
	            count = i;
	    }
	    System.out.println(count);
	}
}
