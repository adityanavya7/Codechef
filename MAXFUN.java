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
	    int test = sc.nextInt();
	    while(test --> 0)
	    {
	       int n = sc.nextInt();
	       int arr[] =  new int[n];
	       int max = Integer.MIN_VALUE;
	       int min = Integer.MAX_VALUE;
	       for(int i = 0; i < n; i++)
	       {
	           arr[i] = sc.nextInt();
	           
	           if(arr[i] > max)
	           {
	               max = arr[i];
	           }
	           
	           if(arr[i] < min)
	           {
	               min = arr[i];
	           }
	       }
	       
	       long res = (max - min);
	       res*=2;
	       System.out.println(res);
	        
	    }
		// your code goes here
	}
}
