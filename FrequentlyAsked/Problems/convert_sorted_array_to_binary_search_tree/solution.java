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
    int [] nums;
    public TreeNode createBST(int left, int right)
    {
        if(left>right) return null;
        int index=(left+right)/2;

        TreeNode node =new TreeNode(nums[index]);
        node.left=createBST(left,index-1);
        node.right=createBST(index+1,right);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        
        this.nums=nums;
        return createBST(0,nums.length-1);

    }
}