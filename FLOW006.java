/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i =0; i<t;i++)
		{
		    int j = Integer.parseInt(br.readLine());
		    int r, sum =0;
		    while(j!=0)
		    {
		        r = j%10;
		        sum =  sum + r;
		        j=j/10;
		    }
		    System.out.println(sum);
		}
	}
}
