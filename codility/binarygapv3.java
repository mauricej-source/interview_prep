public class binarygapv3 {
    public int solution(int N) {
        // Step 1: Remove trailing zeros (they can't form a gap)
        while (N > 0 && (N & 1) == 0) {
            N >>= 1;
        }

        int maxGap = 0;
        int currentGap = 0;

        // Step 2: Iterate through the remaining bits
        while (N > 0) {
            if ((N & 1) == 0) {
                // We found a zero, increment the current potential gap
                currentGap++;
            } else {
                // We hit a one, which closes the gap
                maxGap = Math.max(maxGap, currentGap);
                currentGap = 0;
            }
            // Logical shift right to check the next bit
            N >>= 1;
        }

        return maxGap;
    }

    public static void main(String[] args) {
        // given input
        int valueToBeTested = 1042;
        binarygapv3 bg = new binarygapv3();

        System.out.println("Input Value - " + valueToBeTested);
        System.out.println("Binary String - Input Value - " + Integer.toBinaryString(valueToBeTested));
        System.out.println("------------------------");
        System.out.println("Largest Binary Gap Sequence is: " + bg.solution(valueToBeTested));
    }    
}
