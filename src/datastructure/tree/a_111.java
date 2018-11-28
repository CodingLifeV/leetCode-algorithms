package datastructure.tree;

/**
 * 最小路径
 */
public class a_111 {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int l = minDepth(root.left);
        int r = minDepth(root.right);
        //左右子树有一个不为空，则不是叶子结点
        if (l == 0 || r == 0) return l + r + 1;
        return Math.min(l ,r) + 1;
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
