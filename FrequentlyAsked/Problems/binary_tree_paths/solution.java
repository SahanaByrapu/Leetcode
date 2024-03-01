/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result=new ArrayList();
        DFS(root,"",result);
        return result; 
    }

    public void DFS(TreeNode root, String ans, List<String> result)
    {
        if(root==null) return;
        
        if(root.left==null && root.right==null)
        {
            ans+=root.val;
            result.add(ans);
            ans="";
        }
         
         ans+=root.val+"->";
         
         DFS(root.left,ans,result);
         DFS(root.right,ans,result);


         return ;
    }
    

}