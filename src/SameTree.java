public class SameTree {
    boolean same = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        check(p, q);
        return same;
    }
    public void check(TreeNode p, TreeNode q) {
        if (p == null && q == null) return;
        if(p == null ^ q == null) {
            same = false;
        }
        if (p != null && q != null) {
            if(p.left != null && q.left != null) {
                check(p.left, q.left);
                if(p.left.val != q.left.val) same = false;
            }
            check(p.right, q.right);
        }
    }
}
