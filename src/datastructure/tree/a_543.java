package datastructure.tree;

/**
 * 二叉树的直径
 */
public class a_543 {
    private int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }
    private int depth(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = depth(root.left);
        int rigthDepth = depth(root.right);
        max = Math.max(max, leftDepth + rigthDepth);
        return Math.max(leftDepth, rigthDepth) + 1;
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
