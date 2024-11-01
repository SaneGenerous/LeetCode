public class ExcelSheetColumnTitle {
    public  String convertToTitle(int columnNumber){
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0){
            if((columnNumber % 26) > 0) {
                sb.append((char) (columnNumber % 26 + 64));
            } else {
                if(columnNumber <= 26) {
                    sb.append((char) (columnNumber + 64));
                    break;
                } else {
                    sb.append("Z");
                    columnNumber -=26;
                }
            }
            columnNumber -= (columnNumber % 26);
           if(columnNumber != 0) columnNumber = columnNumber / 26;
        }
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();
        System.out.println(excelSheetColumnTitle.convertToTitle(104));
    }
}
