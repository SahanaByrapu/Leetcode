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
    int ans;
    public int rangeSumBST(TreeNode root, int low, int high) {
        ans=0;
        return dfs(root,low,high);

    }
   public int dfs(TreeNode root, int low,int high)
   {
        if(root!=null)
        {
           if(root.val>=low && root.val <=high)
            ans+=root.val;

            if(root.val > low)
              dfs(root.left,low,high);

            if(root.val < high)
              dfs(root.right,low,high);
         }
        
        return ans;
    }

   }
   