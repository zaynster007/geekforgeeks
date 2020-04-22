/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    
	    int t=sc.nextInt();
	    
	    while(t-->0)
	  {   PriorityQueue<Integer> pq=new PriorityQueue<>();
	      int n=sc.nextInt();
	      int a[]=new int[n];
	      for(int i=0;i<n;i++)
	      {
	          a[i]=sc.nextInt();
	          pq.offer(a[i]);
	      }
	     int k=sc.nextInt();
	     
	     
	      int min=-1;
	      while(k>0)
	      {
	      min= pq.poll();
	       k--;
	      }
	      
	   System.out.println(min);
	  }  
	}
}