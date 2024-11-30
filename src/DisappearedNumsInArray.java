import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNumsInArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= n-2; i++){
            if(nums[i+1] - nums[i] > 1) {
                int a = 1;
                while(nums[i] + a < nums[i+1]){
                    list.add(nums[i] + a);
                    a++;
                }
            }
        }
        int i = 0;
        while(n - i > nums[n-1]){
            list.add(n - i);
            i++;
        }
        i = 1;
        while(i < nums[0]){
            list.add(i);
            i++;
        }
        return list;
    }
    public static void main(String[] args) {
        DisappearedNumsInArray obj = new DisappearedNumsInArray();
        System.out.println(obj.findDisappearedNumbers(new int[]{1, 1, 2, 4}));
    }
}
