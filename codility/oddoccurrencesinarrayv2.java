import java.util.*;

public class oddoccurrencesinarrayv2 {
    public int solution(int[] A){
        int unmatchedValue = 0;
        Map<Integer,Integer> occ_matches = new HashMap<Integer,Integer>();

        if(A != null && A.length > 0){
            int[] test_array = A;
            int compare_int_value = 0;
            int compare_to_int_value = 0;

            for(int j = 0; j < A.length; j++){
                compare_int_value = A[j];
                System.out.println("Comparison Value - " + compare_int_value);

                for(int q = j + 1; q < test_array.length; q++){
                    compare_to_int_value = test_array[q];

                    if(compare_to_int_value == compare_int_value){
                        System.out.println("Comparison Value - " + compare_int_value + " - Compared To Value - " + compare_to_int_value);
                        occ_matches.put(j, q);

                        q = test_array.length;
                    }
                }
            }

            Set<Integer> occ_matches_keyset = occ_matches.keySet();
            for(Integer occmtch: occ_matches_keyset){
                System.out.println("OCC Match Index - " + occmtch);

                Integer occmtch_value = occ_matches.get(occmtch);
                System.out.println("OCC Match Index Value  - " + occ_matches.get(occmtch_value));
                
                test_array[occmtch.intValue()] = -1;
                test_array[occmtch_value.intValue()] = -1;
            }

            for(int checkindex = 0; checkindex < test_array.length; checkindex++){
                if(test_array[checkindex] != -1 ){
                    unmatchedValue = test_array[checkindex];
                }
            }

        }

        return unmatchedValue;
    }    

  public static void main(String[] args) {

    // given input
    //int[] input = { 2, 2, 3, 3, 4};
    int[] input = {9, 3, 9, 3, 9, 7, 9};
    oddoccurrencesinarrayv2 oOIA = new oddoccurrencesinarrayv2();
    
    System.out.println("The Odd Occurency Value In the Array Is: " + oOIA.solution(input));
  }
}
