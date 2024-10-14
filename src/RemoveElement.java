import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int j = 0;
        if(nums.length == 0) {
            return 0;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                k++;
            } else {
                nums[j] = nums[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement.removeElement(nums, val));

    }
}
