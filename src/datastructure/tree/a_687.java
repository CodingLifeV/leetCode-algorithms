package datastructure.tree;

/**
 * 相同节点值的最大路径长度, 最长同值路径
 */
public class a_687 {
    private int path;
    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return path;
    }
    private int dfs(TreeNode root) {
        if (root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        int leftPath = ( root.left != null && root.left.val == root.val ) ? left + 1 : 0;
        int rightPath = ( root.right != null && root.right.val == root.val) ? right + 1 : 0;
        path = Math.max(leftPath + rightPath, path);
        return Math.max(leftPath, rightPath);
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
