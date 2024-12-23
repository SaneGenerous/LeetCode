package Medium;

public class JumpGameII {
    public int jump(int[] nums) {
        int jumps = 1;
        if(nums.length == 1) return 0;
        if(nums[0] >= nums.length -1) return 1;
        outer: for(int i = 0; i < nums.length-1; i++){
            if(nums[i] != 0) {
                for(int j = 1; j <= nums[i]; j++){
                    if(nums[i+j] >= nums.length-1-i-j) {
                        jumps++;
                        break outer;
                    }
                }
                jumps++;
                if(nums[i] > 1) i += nums[i]; else i += nums[i] - 1;
            }
        }
        return jumps;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        JumpGameII jumpGameII = new JumpGameII();
        System.out.println(jumpGameII.jump(nums));
    }
}
