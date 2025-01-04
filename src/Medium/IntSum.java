package Medium;

public class IntSum {
    public int[] intSum(int[] numbers, int target){
        int[] result = new int[2];
        outer:for(int i = 0; i < numbers.length-1; i++){
            if(target > 0 && numbers[i] > target) break;
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i] + numbers[j] > target) break;
                if( numbers[i] + numbers[j] == target) {
                    result[0] = i+1;
                    result[1] = j+1;
                    break outer;
                }
            }
        }
        return result;
    }
}
