class Solution {
    public int solution(int[] A) {
        if(A.length == 0){
            return 1;
        }
        int max = 0;
        for(int a = 0; a < A.length; a++){
            if(A[a] > max){
                max =A[a];
            }
        }
        if(max <= 0) {
            return 1;
        }
        boolean found = false;
        int j = 0;
        while(found == false){
            boolean jFound = false;
            j++;
            for (int i = 0; i < A.length; i++) {
                if (A[i] == j) {
                    jFound = true;
                    break;
                }
            }
            if(jFound == false) {
                found = true;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = new int[]{-1, -3};
        System.out.println(solution.solution(A));
    }
}

