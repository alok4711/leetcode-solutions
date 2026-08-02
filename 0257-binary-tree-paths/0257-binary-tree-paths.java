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
        List<String> ans=new ArrayList<>();
        String s="";
        path(root, ans, s);
        return ans;
    }
    void path(TreeNode root, List<String> ans, String s){
        if(root==null) return;
        if(s=="") s+=root.val;
        else s+="->"+root.val;
        if(root.left==null && root.right==null){
            ans.add(s);
            return;
        }
        path(root.left, ans, s);
        path(root.right, ans, s);
    }
}