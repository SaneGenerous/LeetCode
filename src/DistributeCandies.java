import java.util.Arrays;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int maxTypes = 1;
        Arrays.sort(candyType);
        for(int i = 0; i < n-1; i++){
            if (candyType[i] != candyType[i+1]) maxTypes++;
        }
        return Math.min(maxTypes, n / 2);
    }
}
