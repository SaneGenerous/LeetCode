import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length, max = 0, index = -1, count = 0;
        Set<Integer> set = new HashSet<>();
        String[] rank = new String[n];
        while(count < n){
            for(int i = 0; i < n; i++){
                if(set.contains(i)) continue;
                if(score[i] > max){
                    max = score[i];
                    index = i;

                }
            }
            set.add(index);
            max = 0;
            count++;
            if(count == 1) rank[index] = "Gold Medal";
            else if(count == 2) rank[index] = "Silver Medal";
            else if(count == 3) rank[index] = "Bronze Medal";
            else rank[index] = String.valueOf(count);
        }
        return rank;
    }
    public static void main(String[] args) {
        RelativeRanks r = new RelativeRanks();
        String[] rank = r.findRelativeRanks(new int[]{10,3,8,9,4});
        System.out.println(Arrays.toString(rank));
    }
}
