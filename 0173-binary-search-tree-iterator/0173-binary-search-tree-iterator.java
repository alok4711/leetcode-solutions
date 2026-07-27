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
class BSTIterator {
    Stack<Integer> s;

    public BSTIterator(TreeNode root) {
        s = new Stack<>();
        trav(root);
    }
    
    public int next() {
        return s.pop();
    }
    
    public boolean hasNext() {
        return !s.isEmpty();
    }
    public void trav(TreeNode root){
        if(root==null) return;
        trav(root.right);
        s.push(root.val);
        trav(root.left);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */