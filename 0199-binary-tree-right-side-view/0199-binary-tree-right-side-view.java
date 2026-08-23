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
    int len=0;
    int currlen=0;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        helper(root, list);
        return list;
    }
    void helper(TreeNode root, List<Integer> list){
        if(root==null) return;
        currlen++;
        if(currlen>len){
            list.add(root.val);
            len=currlen;
        }
        helper(root.right, list);
        helper(root.left, list);
        currlen--;
    }
}