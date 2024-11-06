import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s == null) return false;
        HashMap<Character,Character> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
            else map.put(s.charAt(i), t.charAt(i));
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "bar";
        String t = "egg";
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        System.out.println(isomorphicStrings.isIsomorphic(s, t));
    }
}

