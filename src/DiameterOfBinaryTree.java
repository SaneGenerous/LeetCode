public class DiameterOfBinaryTree {
    int d = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root.left == null && root.right == null) return 0;
        diameter(root);
        return d;
    }
    int diameter(TreeNode root) {
        if (root == null) return 0;
        int l = diameter(root.left);
        int r = diameter(root.right);
        d = Math.max(d, l + r);
        return 1 + Math.max(l, r);
    }
}
