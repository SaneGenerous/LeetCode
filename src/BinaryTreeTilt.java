public class BinaryTreeTilt {
    int tilt = 0;
    public int findTilt(TreeNode root) {
        treeValues(root);
        return tilt;
    }
    int treeValues(TreeNode root){
        if(root == null) return 0;
        int r =treeValues(root.right);
        int l = treeValues(root.left);
        tilt += Math.abs(r - l);
        return root.val + r + l;
    }
}
