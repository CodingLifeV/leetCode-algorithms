package datastructure.tree;

/**
 * 找出二叉树中第二小的节点
 */
public class a_671 {
    //思想：递归从左子树找出第二小结点，从右子树找出第二小结点
    //比较左右子树第二小结点大小，取较小的一方，
    //返回-1表示没找到
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) return -1;
        if (root.left == null && root.right == null) return -1;
        int leftVal = root.left.val;
        int rightVal = root.right.val;
        if (root.val == leftVal) leftVal = findSecondMinimumValue(root.left);
        if (root.val == rightVal) rightVal = findSecondMinimumValue(root.right);
        if (leftVal != -1 && rightVal != -1) return Math.min(leftVal, rightVal);
        if (leftVal != -1) return leftVal;
        return rightVal;
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
