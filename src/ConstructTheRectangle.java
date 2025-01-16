import java.util.Arrays;

public class ConstructTheRectangle {
    public int[] constructRectangle(int area) {
        int square = (int) Math.sqrt(area);
        int[] arr = new int[2];
        for(int i = square; i > 0; i--) {
            if(area % i == 0) {
                arr[0] = area / i;
                arr[1] = i;
                break;
            }
        }
        return arr;
    }
}
