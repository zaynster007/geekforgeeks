/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		//code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int t=Integer.parseInt(br.readLine());
	//	Scanner sc=new Scanner(System.in);
	//	int t=sc.nextInt();
		while(t-->0)
		{
		    int n =Integer.parseInt(br.readLine());
		  //  int n=sc.nextInt();
		    int a[]=new int[n];
		    
            	String line = br.readLine();
                String[] strs = line.trim().split("\\s+");
                for (int i = 0; i < n; i++) {
                    a[i] = Integer.parseInt(strs[i]);
                    }
	
		  /*  for(int i=0;i<n;i++)
		     { a[i]=Integer.parseInt(br.readline());
		         //a[i]=sc.nextInt();
		         }*/
		   
		    int global_max=a[0];
		    int local_max=a[0];
		    
		   for(int i=1;i<n;i++)
		   {
		       local_max=Math.max(a[i],local_max+a[i]) ;
		       global_max=Math.max(local_max,global_max);
		   
		   }
		  System.out.println(global_max);
		    
		    
		    
		}
	}
}