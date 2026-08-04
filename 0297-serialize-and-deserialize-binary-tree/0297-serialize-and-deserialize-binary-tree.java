/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    List<String> list=new ArrayList<>();
    int i=0;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> list = new ArrayList<>();
        helper(root, list);
        return String.join(",", list);
    }

    void helper(TreeNode root, List<String> list) {
        if (root == null) {
            list.add("null");
            return;
        }
        list.add(String.valueOf(root.val));
        helper(root.left, list);
        helper(root.right, list);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        i=0;
        String[] arr=data.split(",");
        return insert(arr);
    }
    TreeNode insert(String[] arr){
        if(arr[i].equals("null")){
            i++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(arr[i]));
        i++;
        root.left=insert(arr);
        root.right=insert(arr);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));