public class BalancedBinaryTree {
    int l = 0;
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return l <= 2;

    }
    void depth(TreeNode root) {
        if(root == null) return;
        if(root.left != null){
            l++;
            depth(root.left);
        }
        if(root.right != null){
            l++;
            depth(root.right);
        }
    }
}
