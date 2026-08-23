class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;

        int left = leftHeight(root);
        int right = rightHeight(root);

        if(left == right) {
            return (1 << left) - 1;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    int leftHeight(TreeNode root) {
        if(root == null) return 0;

        return 1 + leftHeight(root.left);
    }

    int rightHeight(TreeNode root) {
        if(root == null) return 0;

        return 1 + rightHeight(root.right);
    }
}