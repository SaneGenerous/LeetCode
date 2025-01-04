package Medium;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int right = height.length-1, left = 0;
        int max = (height.length-1)*Math.min(height[left], height[right]);
        while(right > left){
            if(height[right] > height[left]) left++; else right--;
            max = Math.max(max, (right - left)*Math.min(height[left], height[right]));
        }
        return max;
    }
}
