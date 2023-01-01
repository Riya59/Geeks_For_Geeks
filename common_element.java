//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            
            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }    
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    ArrayList<Integer> commonElements(int a[], int b[], int c[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> l=new ArrayList<>();

        HashMap<Integer,Integer> h=new HashMap<>();

        for(int i=0; i<n1; i++){

            if(!h.containsKey(a[i]))

            h.put(a[i],1);

        }

        

        for(int i=0; i<n2; i++){

            if(h.containsKey(b[i]) && h.get(b[i])==1)

            h.put(b[i],2);

        }

        for(int i=0; i<n3; i++){

            if(h.containsKey(c[i]) && h.get(c[i])==2){

            h.put(c[i],3);

            l.add(c[i]);

            }

        }

        return l;
    }
}
