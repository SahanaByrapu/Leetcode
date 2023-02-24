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
    int maxsum=0;
    public int maxPathSum(TreeNode root) {

      int[] maxsum = {Integer.MIN_VALUE};
      if(root==null) return 0; 
      
      maxSum(root,maxsum);

      return maxsum[0];

    }

    public int maxSum(TreeNode root, int[] maxsum)
    {
      if(root==null) return 0;
      int left= Math.max(0,maxSum(root.left,maxsum));
      int right= Math.max(0,maxSum(root.right,maxsum));

      maxsum[0]= Math.max(maxsum[0], root.val+left+right);

      return Math.max(left, right) + root.val;
    }
      
}




// TC: O(n), SC: O(h)