import java.util.Arrays;

public class ArrayDuplicates {
    public int removeDuplicates(int[] nums) {

        int k = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] < nums[i]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        ArrayDuplicates arrayDuplicates = new ArrayDuplicates();
        System.out.println("k = " + arrayDuplicates.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
