import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinimumAbsoluteDifferentInBST {
    Set<Integer> set = new HashSet<>();
    boolean noDuplicateValue = true;
    public int getMinimumDifference(TreeNode root) {
        if(root == null) return 0;
        set.add(root.val);
        getNodes(root);
        if(!noDuplicateValue) return 0;
        Integer[] arr = set.toArray(new Integer[0]);
        Arrays.sort(arr);
        int min = 100000, abs = 0;
        for(int i = 0; i < arr.length-2; i++){
            abs = Math.abs(arr[i] - arr[i+1]);
            min = Math.min(min, abs);
        }
        return min;
    }
    void getNodes(TreeNode root){
        if(root == null) return;
        if(root.left != null) {
            if(!set.add(root.left.val)) noDuplicateValue = false;
            getNodes(root.left);
        }
        if(root.right != null){
            if(!set.add(root.right.val)) noDuplicateValue = false;
            getNodes(root.right);
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(48);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(49);
        MinimumAbsoluteDifferentInBST obj = new MinimumAbsoluteDifferentInBST();
        System.out.println(obj.getMinimumDifference(root));
    }
}
