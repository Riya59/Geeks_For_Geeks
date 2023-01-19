//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int A =sc.nextInt();
            int B =sc.nextInt();
            int C =sc.nextInt();
            int D =sc.nextInt();
             
           System.out.println(new Solution().carpetBox(A,B,C,D)); 
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    int fun(int a, int b, int c, int d){
        int ans = 0;
        while(a>c){
            a = a/2;
            ans++;
        }
        while(b>d){
            b = b/2;
            ans++;
        }
        return ans;
        
    }
    int carpetBox(int A, int B, int C, int D) { 
        //code here
        return Math.min(fun(A,B,C,D), fun(B,A,C,D));
        
    }
   
}
