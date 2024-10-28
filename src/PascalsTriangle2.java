import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> zero = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        zero.add(1); one.add(1); one.add(1);
        if(rowIndex == 0) return zero;
        if(rowIndex == 1) return one;
        List<List<Integer>> listOfArrays = new ArrayList<>();
        listOfArrays.add(zero); listOfArrays.add(one);
        for(int i = 2; i <= rowIndex; i++){
            List<Integer> l = new ArrayList<>();
            l.add(1);
            for(int j =  1; j < i ;j++){
                l.add(listOfArrays.get(i -1).get(j - 1) + listOfArrays.get(i -1).get(j));
            }
            l.add(1);
            listOfArrays.add(l);
        }
        return listOfArrays.get(rowIndex);
    }
    public static void main(String[] args) {
        PascalsTriangle2 pt = new PascalsTriangle2();
        System.out.println(pt.getRow(5));
    }
}
