/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer; 

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    FastReader sc = new FastReader();
	    //InputStreamReader r = new InputStreamReader(System.in);    
        //BufferedReader inp = new BufferedReader(r); 
	    //Scanner sc = new Scanner(System.in);
	    int test = sc.nextInt();
	    while(test --> 0)
	    {
	        HashSet<Integer> hs = new HashSet<Integer>();
	        int n = sc.nextInt();
	        int dis = sc.nextInt();
	        int arr[] = new int[n];
	        for(int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	            hs.add(arr[i]);
	        }
	        
	        if(hs.size() < dis)
	            System.out.println("YES");
	        else
	            System.out.println("NO");
	        
	    }
		// your code goes here
	}
}
