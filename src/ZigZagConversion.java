public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        int z = 1, a = 0;
        StringBuilder[] sbArray = new StringBuilder[numRows];
        for(int j = 0; j < numRows; j++){
            sbArray[j] = new StringBuilder();
        }
        for(int i = 0; i < s.length(); i++){
            sbArray[a].append(s.charAt(i));
            if(a == 0) z = 1;
            if(a == numRows -1) z = -1;
            a += z;
        }
        for(int j = 1; j < numRows; j++){
            sbArray[0].append(sbArray[j]);
        }
        return sbArray[0].toString();
    }
}
