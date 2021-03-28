/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc =  new Scanner(System.in);
	    int test = sc.nextInt();
	    while(test --> 0)
	    {
	        int N = sc.nextInt();
	        int D = sc.nextInt();
	        int arr[] = new int[N];
	        int count = 0, rem = 0;
	        for(int i = 0; i < N; i++)
	        {
	            arr[i] = sc.nextInt();
	            
	            if(arr[i] >= 80 || arr[i] <= 9)
	                count++;
	            else
	                rem++;
	        }
	        double sum = Math.ceil((double)count/(double)D) + Math.ceil((double)rem/(double)D);
			System.out.println((int)Math.ceil(sum));
	    }
		// your code goes here
	}
}
