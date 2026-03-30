import java.util.Arrays;

public class CyclicRotation {
    public int[] solution(int[] A, int K){
        int [] rotatedA = new int[A.length];
   
        for(int i=0; i<A.length; i++) {
          //rotated index needs to "wrap" around end of array
          int rotatedIndex = (i + K) % A.length;
    
          rotatedA[rotatedIndex] = A[i];
        }
        return rotatedA;
    }

    public static void main(String[] args) {
        // given input
        //int[] input = { 3, 8, 9, 7, 6};
        //int[] input = { 0, 0, 0};
        //int[] input = { 1,2,3,4};
        //int[] input = { 5,1000};
        int[] input = { 1000};

        //int shift = 3;
        //int shift = 1;
        //int shift = 4;
        //int shift = 1;
        int shift = 5;

        CyclicRotation cr = new CyclicRotation();
        int[] returnedShiftedArray = cr.solution(input, shift);
        String returnedShiftedArray_STR = "";

        for(int b =0; b<returnedShiftedArray.length; b++){
            returnedShiftedArray_STR = returnedShiftedArray_STR + returnedShiftedArray[b] + ", ";
        }
        //9, 7, 6, 3, 8
        System.out.println("Cyclic Rotation of : " + returnedShiftedArray_STR); 
    }   
}
