import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();
        one.add(1); two.add(1); two.add(1);
        List<List<Integer>> list = new ArrayList<>();
        if(numRows == 1) list.add(one);
        if(numRows == 2) {
            list.add(one);
            list.add(two);
        }
        if(numRows > 2){
            list.add(one);
            list.add(two);
            for(int i = 3; i <= numRows; i++){
                List<Integer> arr = new ArrayList<>();
                arr.add(1);
                List<Integer> e = list.get(i - 2);
                for(int j = 0; j < e.size() - 1 ; j++){
                    arr.add(e.get(j) + e.get(j+1));
                }
                arr.add(1);
                list.add(arr);
            }
        }
        return list;
    }
}
