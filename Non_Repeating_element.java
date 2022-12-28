//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
		    
		    int n = Integer.parseInt(br.readLine());
		    int arr[] = new int[n];
		    
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split(" ");
		    
		    for(int index = 0;index < n; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Check obj = new Check();
		    
		    System.out.println(obj.firstNonRepeating(arr,n));
		        
		}
		
	}
}


// } Driver Code Ends


//User function Template for Java

class Check{
    
    public int firstNonRepeating(int arr[], int n) 
    { 
        // Complete the function
        int freq[]=new int[10000008];
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                freq[10000008+arr[i]]++;
            }else{
                freq[arr[i]]++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                if(freq[10000008+arr[i]]==1){
                    return arr[i];
                }
            }else{
                if(freq[arr[i]]==1){
                    return arr[i];
                }
            }
        }
        return 0;
    }  
    
}

