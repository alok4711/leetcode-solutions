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
    HashMap<TreeNode, Integer> dp = new HashMap<>();

    public int rob(TreeNode root) {
        return helper(root, true);
    }

    int helper(TreeNode root, boolean canRob) {
        if (root == null) return 0;

        if (!canRob) {
            return helper(root.left, true)
                 + helper(root.right, true);
        }

        if (dp.containsKey(root))
            return dp.get(root);

        int rob = root.val
                + helper(root.left, false)
                + helper(root.right, false);

        int skip = helper(root.left, true)
                 + helper(root.right, true);

        int ans = Math.max(rob, skip);

        dp.put(root, ans);

        return ans;
    }
}