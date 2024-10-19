import java.util.ArrayList;
import java.util.List;

public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
         this.left = left;
         this.right = right;
     }
 }

class BinaryTreeInOrderTraversal {
    List<Integer> inTra = new ArrayList<>();
    public List<Integer> inOrderTraversal(TreeNode root) {
        inOrder(root);
        return inTra;
    }
    public void inOrder(TreeNode node){
        if(node == null) return;
        inOrder(node.left);
        inTra.add(node.val);
        inOrder(node.right);
    }
}