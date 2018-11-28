package datastructure.tree;

/**
 * 平衡二叉树
 */
public class a_110 {
    private boolean result = true;
    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return result;
    }
    private int maxDepth(TreeNode tree) {
        if (tree == null) return 0;
        int l = maxDepth(tree.left);
        int r = maxDepth(tree.right);
        if (Math.abs(l-r) > 1) result = false;
        return Math.max(l, r) + 1;
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
