public class AddDigits {
    public int addDigits(int num) {
        while(num >= 10){
            num = sumDigits(num);
        }
        return num;
    }
    int sumDigits(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num = num /10;
        }
        return sum;
    }
    public static void main(String[] args) {
        AddDigits addDigits = new AddDigits();
        System.out.println(addDigits.addDigits(101));
    }
}
