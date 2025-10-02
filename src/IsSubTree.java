public class IsSubTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String rootSerialize = serialize(root);
        String subRootSerialize = serialize(subRoot);
        return rootSerialize.contains(subRootSerialize);
    }

    String serialize(TreeNode root){
        if(root == null) return "N";
        return "(" + root.val + "," + serialize(root.right) + "," +serialize(root.left) + ")";
    }
}
