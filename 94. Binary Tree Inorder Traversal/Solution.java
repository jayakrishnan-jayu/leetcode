// Given the root of a binary tree, return the inorder traversal of its nodes' values.

class Solution {
    public static void inorder(TreeNode node, List<Integer> result) {
        if (node == null)
            return;
        inorder(node.left, result);
        result.add(node.val);
        inorder(node.right, result);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }
}