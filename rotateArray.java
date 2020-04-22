/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int d=sc.nextInt();
		    int a[]=new int[n];
		    StringBuffer s=new StringBuffer();
		    for(int i=0;i<n;i++)
		    {
		     a[i]=sc.nextInt();   
		    }
		    
		    for(int i=d;i<n;i++)
		    {
		        s.append(a[i]+" ");
		    }
		    for(int i=0;i<d;i++)
		    {
		        s.append(a[i]+" ");
		    }
		    System.out.println(s);
		    
		    
		}
		
	}
}