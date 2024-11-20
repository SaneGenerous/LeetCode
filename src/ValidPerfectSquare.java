public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int l = 0, r = 32;
        while(l%2==0 && r%2==0){
            if(num <= Math.pow(2, (r+l)/2)) r = (r+l)/2; else l = (r+l)/2;
        }
        int b = (int) Math.pow(2, l/2);
        int e = (int) Math.pow(2, r/2+1);
        while(b<e){
            if(num == b*b) return true; else b++;
        }
        return false;
    }
    public static void main(String[] args) {
        ValidPerfectSquare obj = new ValidPerfectSquare();
        System.out.println(obj.isPerfectSquare(100));
    }
}
