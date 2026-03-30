import java.util.Arrays;

public class cyclicrotationv3 {
    public int[] solution(int[] A, int K) {
        // Handle empty array or zero-length edge cases
        if (A == null || A.length == 0) {
            return A;
        }

        int n = A.length;
        
        // Optimization: K rotations is the same as K % N rotations
        int actualRotations = K % n;
        
        // If rotations result in the same array, return early
        if (actualRotations == 0) {
            return A;
        }

        int[] rotatedArray = new int[n];

        for (int i = 0; i < n; i++) {
            // Calculate the new position using modular arithmetic
            int newPosition = (i + actualRotations) % n;
            rotatedArray[newPosition] = A[i];
        }

        return rotatedArray;
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
