// Given the root of a binary tree, return the preorder traversal of its nodes' values.


class Solution {
    public static void traverse(TreeNode node, List<Integer> result) {
        if (node == null)
            return;
        result.add(node.val);
        traverse(node.left, result);
        traverse(node.right, result);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null)
            return result;
        traverse(root, result);
        return result;
    }
}