// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();
			Solution T = new Solution();
			ArrayList<Integer> arr= T.mergeKArrays(a, n);
			for(int i = 0; i < n*n ; i++)
			    System.out.print(arr.get(i)+" ");
		    System.out.println();
		    
		    t--;
		}
	}
}

// } Driver Code Ends
//User function Template for Java

/*Complete the function below*/
class Solution{
    public static ArrayList<Integer> mergeKArrays(int[][] arrays,int k) 
    {
        // Write your code here.
         ArrayList<Integer> res=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
     for(int i=0;i<k;i++)
       {
           for(int j=0;j<k;j++)
           {
               pq.add(arrays[i][j]);
               
           }
       }
     for(int i=0;i<k*k;i++)
     {
         int val=pq.poll();
         res.add(val);
     }
     return res;
        
        
    }
}