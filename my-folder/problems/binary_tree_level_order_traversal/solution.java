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
    public List<List<Integer>> levelOrder(TreeNode root) {

     List<List<Integer>> res=new ArrayList<List<Integer>>();
     if(root==null) return res;

     traversal(root,res,0);

     return res;
    }

    public List<List<Integer>> traversal(TreeNode root,
     List<List<Integer>> res ,int level)
    {
        if(res.size()==level) res.add(new ArrayList());
        
        res.get(level).add(root.val);

        if(root.left!=null)
        traversal(root.left,res,level+1);
        if(root.right!=null)
        traversal(root.right,res,level+1);

        return res;
    }
}