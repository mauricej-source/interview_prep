import java.util.Arrays;

public class binarygapv4 {
    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);

        // We must remove trailing zeros because they don't form a "gap" 
        // (a gap must be surrounded by 1s).
        // Example: "101000" becomes "101"
        String trimmedBinary = binaryString.replaceAll("0+$", "");
        System.out.println("Trimmed Binary String - Input Value - " + trimmedBinary);

        return Arrays.stream(trimmedBinary.split("1"))   // 1. Split by '1's to get the gaps
                .mapToInt(String::length)                      // 2. Convert each gap to its length
                .max()                                         // 3. Find the maximum length
                .orElse(0);                              // 4. Return 0 if no gaps found
    }

    public static void main(String[] args) {
        // given input
        int valueToBeTested = 1042;
        binarygapv4 bg = new binarygapv4();

        System.out.println("Input Value - " + valueToBeTested);
        System.out.println("Binary String - Input Value - " + Integer.toBinaryString(valueToBeTested));
        System.out.println("------------------------");
        System.out.println("Largest Binary Gap Sequence is: " + bg.solution(valueToBeTested));
    }    
}
