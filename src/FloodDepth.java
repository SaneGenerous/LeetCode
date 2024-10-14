public class FloodDepth {
    public int solution(int[] A){
        int maxAsc = 0;
        int maxDesc = 0;
        int minAsc = 0;
        int minDesc = 0;
        int depthDesc = 0;
        int depthAsc = 0;
        int depthMax = 0;
        boolean ascending = false;
        boolean descending = false;
        for(int i = 0; i < A.length - 1; i++){
            if(A[i] > A[i+1]){
                if(maxDesc < A[i]) maxDesc = A[i];
                if(minDesc > A[i]) minDesc = A[i];
                descending = true;
                ascending = false;
                depthDesc = maxDesc - minDesc;
            }
            if(A[i] < A[i+1]){
                if(minAsc > A[i]) minAsc = A[i];
                if(maxAsc < A[i]) maxAsc = A[i];
                ascending = true;
                descending = false;
                depthAsc = maxAsc - minAsc;
            }
            if(depthDesc > depthAsc) {
                depthMax = depthAsc;
            } else {
                depthMax = depthDesc;
            }
        }

        return depthMax;
    }

    public static void main(String[] args) {
        FloodDepth obj = new FloodDepth();
        System.out.println(obj.solution(new int[]{1,3,2,1,2,1,5,3,3,4,2}));
    }
}
