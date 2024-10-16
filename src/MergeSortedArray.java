import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = Arrays.copyOf(nums1, m + n);
        int i = 0, j = 0, a = 0;

        while(i <= m && j <= n && a < nums1.length) {
            if(i == m){
                nums1[a++] = nums2[j++];
                continue;
            }
            if(j == n){
                nums1[a++] = temp[i++];
                continue;
            }
            if(temp[i] < nums2[j]) {
                nums1[a++] = temp[i++];
            } else if(temp[i] > nums2[j]){
                nums1[a++] = nums2[j++];
            } else {
                nums1[a++] = temp[i++];
                nums1[a++] = nums2[j++];
            }
        }
    }
    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        mergeSortedArray.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
