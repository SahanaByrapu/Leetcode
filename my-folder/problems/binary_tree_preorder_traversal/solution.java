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

//Morris pre-order traversal without stack and recursion
//threaded binary trees
class Solution {
  
    public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> nodes=new ArrayList<Integer>(); 
        
        TreeNode cur=root;
        while(cur!=null)
        {
            if(cur.left==null) 
            {
                nodes.add(cur.val);
                cur=cur.right;
            }
            else
            {
              TreeNode prev=cur.left;
               while(prev.right!=null && prev.right!=cur)
                   prev=prev.right;
                
               if(prev.right==null)
               {
                   prev.right=cur;
                   nodes.add(cur.val);
                   cur=cur.left;
               }
               else
               {
                   prev.right=null;
                   cur=cur.right;
               }
            }
          
        }
        
        return nodes;
    }
}