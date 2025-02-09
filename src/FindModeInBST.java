import java.util.*;

public class FindModeInBST {
    Map<Integer, Integer> map = new HashMap<>();
    int index = 0;
    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return null;
        if(root.left == null && root.right == null) return new int[]{root.val};
        findDuplicates(root);
        Object[] valuesArray = map.values().toArray();
        Arrays.sort(valuesArray);
        int max = (int) valuesArray[valuesArray.length-1];
        map.forEach((key, value) -> {
            if(value == max) list.add(key);
        });
        int[] res = new int[list.size()];
        list.forEach(e -> {
            res[index++] = e;
        });
        return res;
    }
    void findDuplicates(TreeNode root){
        if(root == null) return;
        if(map.containsKey(root.val)) {
            int value = map.get(root.val);
            map.put(root.val, ++value);
        } else map.put(root.val, 1);
        findDuplicates(root.left);
        findDuplicates(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        FindModeInBST findModeInBST = new FindModeInBST();
        System.out.println(Arrays.toString(findModeInBST.findMode(root)));
    }
}
