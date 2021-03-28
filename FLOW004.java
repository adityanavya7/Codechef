/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

  
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int firstDigit(int n) 
    { 
        while (n >= 10)  
            n /= 10; 
     
        return n; 
    } 
  
    public static int lastDigit(int n) 
    { 
        return (n % 10); 
    } 
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++)
		{
		    int n = sc.nextInt();
		    System.out.println(firstDigit(n) + lastDigit(n));
		}
	}
}