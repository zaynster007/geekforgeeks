/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        int [][]a=new int[n][n];
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<n;j++)
	          {  a[i][j]=sc.nextInt();}
	            
	        }
	       
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<n;j++)
	              {
	                  if(i<j)
	                  {
	                      int temp=a[i][j];
	                      a[i][j]=a[j][i];
	                      a[j][i]=temp;
	                      
	                  }
	                  
	              }  
	            
	        }
	        
	        
	        for(int i=0;i<n;i++)
	        {
	            for(int j=n-1;j>=0;j--)
	            {
	                System.out.print(a[i][j]+" ");
	            }
          }
          System.out.println();
	        
	        
	        
	        
	    }
	
	}
}