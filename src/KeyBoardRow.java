import java.util.*;

public class KeyBoardRow {
    public String[] findWords(String[] words) {
        Set<Character> row1 = new HashSet<>();
        Set<Character> row2 = new HashSet<>();
        Set<Character> row3 = new HashSet<>();
        Set<Character> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        boolean isOneRow = true;
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";
        for(char c : r1.toCharArray()){
            row1.add(c);
        }
        for(char c : r2.toCharArray()){
            row2.add(c);
        }
        for(char c : r3.toCharArray()){
            row3.add(c);
        }
        for(String word : words){
            String w = word.toLowerCase();
            if(row1.contains(w.charAt(0))) set = row1;
            if(row2.contains(w.charAt(0))) set = row2;
            if(row3.contains(w.charAt(0))) set = row3;
            for(char c : w.toCharArray()){
                if(!set.contains(c)) {
                    isOneRow = false;
                    break;
                }
            }
            if(isOneRow) list.add(word);
            isOneRow = true;
        }
        String[] arr = list.toArray(new String[0]);
        return arr;
    }
    public static void main(String[] args) {
        KeyBoardRow kb = new KeyBoardRow();
        String[] arr = kb.findWords(new String[]{"Hello","Alaska","Dad","Peace"});
        System.out.println(Arrays.toString(arr));
    }
}
