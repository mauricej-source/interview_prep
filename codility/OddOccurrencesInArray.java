import java.util.Arrays;

public class OddOccurrencesInArray {
  public int solution(int[] A){
    int retValue = 0;

    Arrays.sort(A);
    //{ 3,3,7,9,9,9,9}
    
    if(A.length == 1){
        retValue = A[0];
    } else {
        if(A.length > 1){
            for(int i = 0; i < A.length; i++){
                if(i == A.length -1){
                    retValue = A[i];
                } else {
                    if(A[i] != A[i+1]){
                        retValue = A[i];
                    } else {
                        i = i + 1;
                    }
                }
            }
        }
    }

    return retValue;
  }    

  public static void main(String[] args) {

    // given input
    int[] input = { 2, 2, 3, 3, 4};
    OddOccurrencesInArray oOIA = new OddOccurrencesInArray();
    
    System.out.println("The Odd Occurency Value In the Array Is: " + oOIA.solution(input));
  }
}
