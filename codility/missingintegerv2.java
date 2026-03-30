import java.util.Arrays;

public class missingintegerv2 {
    public int solution(int[] A){
        int missinginteger = 0;

        if(A != null && A.length > 0){
            Arrays.sort(A,0,A.length-1);

            int arrayLength = A.length;
            int indexvaluecheck = 0;
            int indexvaluechecknext = 0;
            boolean foundcheckedvalue = false;

            for(int i = 0; i < arrayLength-1; i++){
                foundcheckedvalue = false;
                indexvaluecheck = A[i];
                indexvaluechecknext = indexvaluecheck + 1;

                for(int j = 1; j < arrayLength-1; j++){
                    if(indexvaluechecknext == A[j]){
                        foundcheckedvalue = true;
                    }
                }

                if(!foundcheckedvalue) missinginteger = indexvaluechecknext;
            }
        } 

        return missinginteger;
    }

  public static void main(String[] args) {

    // given input
    //int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9};
    int[] input = { 2, 3, 1, 5};
    missingintegerv2 mi = new missingintegerv2();
    
    System.out.println("Missing Integer Found: " + mi.solution(input));
  }
}
