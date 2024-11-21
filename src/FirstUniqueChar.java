import java.util.ArrayList;
import java.util.List;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        List<Character> list = new ArrayList<>();
        int r = -1;
        for(char c : chars){
            list.add(c);
        }
        for(int i = 0; i < s.length(); i++){
            list.remove((Character) s.charAt(i));
            if(!list.contains((Character) s.charAt(i))){
                r = i;
                break;
            }
            list.add((Character) s.charAt(i));
        }
        return r;
    }
    public static void main(String[] args) {
        FirstUniqueChar f = new FirstUniqueChar();
        System.out.println(f.firstUniqChar("aabb"));
    }
}
