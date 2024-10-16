public class IndexOfFirstOccurrence {
    public int strStr(String haystack, String needle) {
        if(haystack == null || haystack.isEmpty() || needle == null || needle.isEmpty() || needle.length() > haystack.length()) return -1;
        int indexOfOccurence = -1;
        for(int i = 0; i < haystack.length(); i++){
            if((needle.charAt(0) == haystack.charAt(i)) && (haystack.length() - i >= needle.length())){
                boolean found = true;
                for(int j = 1; j < needle.length(); j++){
                    if(needle.charAt(j) != haystack.charAt(i + j)){
                        found = false;
                        break;
                    }
                }
                if(found){
                    indexOfOccurence = i;
                    break;
                }
            }
        }
        return indexOfOccurence;
    }

    public static void main(String[] args) {
        IndexOfFirstOccurrence indexOfFirstOccurrence = new IndexOfFirstOccurrence();
        String haystack = "mississippi";
        String needle = "issip";
        System.out.println(indexOfFirstOccurrence.strStr(haystack, needle));
    }
}
