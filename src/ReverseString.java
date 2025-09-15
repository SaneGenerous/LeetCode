public class ReverseString {
    public String reverseStr(String s, int k) {
        int l = s.length(); int i = 0, m = 0, end = 0;
        StringBuilder sb = new StringBuilder(s);
        if (l <= k) return sb.reverse().toString();
        if ( k == 1) return s;
        sb.delete(0, sb.capacity()-1);
        StringBuilder seq = new StringBuilder();
        while(i < l) {
            end = Math.min(i+k, l);
            if(m==0) {
                seq.append(s, i, end);
                sb.append(seq.reverse());
                seq.delete(0, seq.capacity());
                m = 1;
            } else {
                sb.append(s, i, end);
                m = 0;
            }
            i += k;

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ReverseString().reverseStr("abcdefg", 2));
    }
}
