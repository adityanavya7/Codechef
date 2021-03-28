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
	        int N = sc.nextInt();
	        int K = sc.nextInt();
	        int D = sc.nextInt();
	        int arr[] = new int[N];
	        int sum = 0;
	        
	        for(int i = 0; i < N; i++)
	        {
	            arr[i] = sc.nextInt();
	            sum += arr[i];
	        }
	        
	        int res = sum/K;
	        
	        if(res < D)
	            System.out.println(res);
	        else
	            System.out.println(D);
	    }
		// your code goes here
	}
}
