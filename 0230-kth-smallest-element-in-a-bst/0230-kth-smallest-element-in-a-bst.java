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
    int n=0;
    public int kthSmallest(TreeNode root, int k) {
        return findSmallest(root, k);
    }
    int findSmallest(TreeNode root, int k){
        if(root==null) return 0;
        int small=0;
        small=Math.max(small, findSmallest(root.left, k));
        n++;
        if(n==k) return root.val;
        small=Math.max(small, findSmallest(root.right, k));
        return small;
    }
}