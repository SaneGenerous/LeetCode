package Medium;

import java.util.Arrays;

public class Max_h_index {
    public int hIndex(int[] citations) {
        int n = citations.length, h = 0;
        Arrays.sort(citations);
        System.out.println(Arrays.toString(citations));
        for(int i = 0; i < n; i++){
            if(citations[i] >= n - i) {
                h = n - i;
                break;
            }
        }
        return h;
    }
    public static void main(String[] args) {
        Max_h_index obj = new Max_h_index();
        int[] citations = new int[]{3,0,6,1,5};
        System.out.println(obj.hIndex(citations));

    }
}
