import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsNearByDuplicate(int[] nums, int k) {
        if(nums == null || k == 0 || nums.length < 2) return false;
        HashSet<Integer> set = new HashSet<>();
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(!set.add(nums[i])) return true;
            if(set.size() >= k + 1) set.remove(nums[j++]);
        }
        return false;
    }
}
