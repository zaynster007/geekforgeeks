/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    int n=Integer.parseInt(br.readLine());
		    int a[]=new int[n];
		    int la[]=new int[n];
		    int ra[]=new int[n];
		    
		    String line=br.readLine();
		    String [] c=line.trim().split("\\s+");
		    for(int i=0;i<c.length;i++)
		    {
		        a[i]=Integer.parseInt(c[i]);
		    }
		    
		     la[0]=a[0];
		    for(int i=1;i<n;i++)
		    {
		        la[i]=Math.max(ra[i-1],a[i]);
		        
		    }
		    
		     ra[n-1]=a[n-1];
		    for(int j=n-2;j>=0;j--)
		    {
		        ra[j]=Math.max(ra[j+1],a[j]);
		    }
		    
		  int i=0;int j=0;
		  int maxdiff=-1;
		while(i<n && j<n)
		{
		    if(la[i]<=ra[j])
		    {
		       maxdiff=Math.max(maxdiff,j-i);
		        j=j+1;
		    }
		    else i=i+1;
		}
			
			 System.out.println(maxdiff);
		}
		
	}
}