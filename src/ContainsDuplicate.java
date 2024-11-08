import java.util.HashMap;

public class ContainsDuplicate {
    public boolean containsNearByDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsValue(nums[i])){
                int j = i -1;
                while(j >= 0){
                    if(map.get(j) == nums[i] && Math.abs(j - i) <= k) return true;
                    j--;
                    }
                }
            map.put(i, nums[i]);
            }
        return false;
    }
}
