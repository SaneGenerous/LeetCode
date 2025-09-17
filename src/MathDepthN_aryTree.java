public class MathDepthN_aryTree {
    int max = 0, c = 0;
    public int maxDepth(Node root) {
        if (root == null) return 0;
        int h = 1;
        for (Node node : root.children){
            h = Math.max(h, 1+maxDepth(node));
        }
        return h;
    }
}
