import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList<>();
        if(nums.length == 0) return list;
        if(nums.length == 1) {
            list.add(Integer.toString(nums[0]));
            return list;
        }
        int s = nums[0];
        for(int i = 1; i < nums.length; i++){
            if((long)nums[i] - (long)nums[i-1] > 1) {
                if(s < nums[i-1]){
                    list.add(Integer.toString(s) + "->" + Integer.toString(nums[i-1]));
                } else {
                    list.add(Long.toString(s));
                }
                s = nums[i];
            }
            if(i == nums.length - 1){
                if(s < nums[i]){
                    list.add(Integer.toString(s) + "->" + Integer.toString(nums[i]));
                } else {
                    list.add(Integer.toString(s));
                }
            }
        }
        return list;
    }
    public static void main(String[] args){
        SummaryRanges s = new SummaryRanges();
        System.out.println(s.summaryRanges(new int[]{-2147483648,-2147483647,2147483647}));
    }
}
