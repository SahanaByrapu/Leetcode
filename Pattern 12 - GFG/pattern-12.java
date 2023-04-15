//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        
      for(int i=1;i<=n;i++)
      {
          for(int k=1;k<=i;k++)
            System.out.print(k+" ");
            
          for(int m=1;m<=2*(n-i);m++)
            System.out.print("  ");
           
           for(int k=i;k>=1;k--)
            System.out.print(k+" ");
             
           System.out.println("");
      }
    }
}