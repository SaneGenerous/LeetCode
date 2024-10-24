public class MinDepthBinaryTree {
    int l = 1;
    int min = 100000;
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        depth(root);
        return min;
    }
    void depth(TreeNode root){
        if(root == null) return;
        if(root.left == null && root.right == null) {
            min = Math.min(min, l);
            l--;
            return;
        }
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
