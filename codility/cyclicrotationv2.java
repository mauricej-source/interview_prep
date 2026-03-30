import java.util.Arrays;

public class cyclicrotationv2 {
    public int[] solution(int[] A, int K) {
        // Allocate Array
        int [] rotatedA = new int[A.length];

        // Example of input variables ([3, 8, 9, 7, 6], 3)
        // Expected [9, 7, 6, 3, 8]
        //
        // ([1, 2, 3, 4], 4) => [1, 2, 3, 4]
        //
        if(K == A.length){
            rotatedA = A;
        } else {
            if(K < A.length) {
                //shift remaining
                int rindex = 0;
                for(int z = K-1; z < A.length; z++){
                    rotatedA[rindex] = A[z];
                    rindex = rindex + 1;
                    A[z] = -1;
                }

                //Shift those remaining outside
                int aindex = 0;
                for(int i = 0; i < rotatedA.length; i++){
                    if(rotatedA[i] == 0 && A[aindex] != -1){
                        rotatedA[i] = A[aindex];
                        aindex = aindex + 1;
                    }
                }           
            }
        }

        return rotatedA;
    }

  public static void main(String[] args) {

    // given input
    int array_shift_value = 4;
    int[] int_array = {1, 2, 3, 4};
    
    cyclicrotationv2 cr = new cyclicrotationv2();

    int[] shifted_int_array = cr.solution(int_array, array_shift_value);

    System.out.println("Integer Array Shifted: " + Arrays.toString(shifted_int_array));
  }
}