public class ConvertSortedArray2BST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums, 0, nums.length - 1);
    }
    TreeNode convert(int[] nums, int l, int r) {
        if(l > r) return null;
        int mid = l + (r - l) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = convert(nums, l, mid - 1);
        root.right = convert(nums, mid + 1, r);
        return root;
    }
}
