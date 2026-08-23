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
    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root, 'r');
    }
    int helper(TreeNode root, char d){
        if(root == null) return 0;
        if(root.left==null && root.right==null){
            if(d=='l') return root.val;
            else return 0;
        }
        int a=helper(root.left, 'l');
        int b=helper(root.right, 'r');
        return a+b;
    }
}