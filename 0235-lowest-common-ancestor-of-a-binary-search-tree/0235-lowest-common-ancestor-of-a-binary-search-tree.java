/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> temp=new ArrayList<>();
        TreeNode ans;
        ans=helper(root, p, q, temp);
        if(ans!=null) return ans;
        if(temp.contains(p) && temp.contains(q)) return root;
        return ans;

    }
    TreeNode helper(TreeNode root, TreeNode p, TreeNode q, List<TreeNode> list){
        if(root==null) return null;
        List<TreeNode> temp=new ArrayList<>();
        temp.add(root);
        TreeNode ans;
        ans=helper(root.left, p, q, temp);
        if(ans!=null) return ans;
        ans=helper(root.right, p, q, temp);
        if(ans!=null) return ans;
        if(temp.contains(p) && temp.contains(q)) return root;
        list.addAll(temp);
        return ans;
    }
}