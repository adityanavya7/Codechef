/* package codechef; // don't place package name! */

import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int s[] = new int[t];
		{
		    int arr[]= new int[t];
		    for(int i = 0; i<t;i++)
		    {
		        s[i] = Integer.parseInt(br.readLine());
		        {
		            int r;
		            int count =0;
		            while(s[i]!=0)
		            {
		                r = s[i]%10;
		                if(r==4)
		                    count++;
		                s[i] = s[i]/10;
		            }
		            arr[i]= count;
		        }
		    }
		    for(int i=0;i<t;i++)
		        System.out.println(arr[i]);
		}
	}
}