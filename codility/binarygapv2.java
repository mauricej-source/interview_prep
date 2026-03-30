public class binarygapv2 {
    public int solution(int N) {
        int maxgap = 0;
        int gap = 0;
        boolean found_1_start = false;
        boolean found_1_end = false;

        // Implement your solution here
        // ie: Test Input
        // 1001
        // 1000010001
        // 10000010001
        //
        // binary gap - x Number of Zereos encapsulated by the number 1
        // x Number of Zereos represents the binary gap

        if(N >= 0){
            String n_BinaryString = Integer.toBinaryString(N);

            char[] n_CharArray = n_BinaryString.toCharArray();

            for(int i=0; i<n_CharArray.length; i++){
                if(n_CharArray[i] == '1' && gap == 0){
                    //Start OR End of BinaryGap
                    found_1_start = true;

                    System.out.println("Start of Binary Gap ...");
                }

                if(found_1_start && n_CharArray[i] == '0'){
                    gap = gap + 1;
                    System.out.println("Binary Gap - " + gap);
                }

                if(n_CharArray[i] == '1' && gap > 0){
                    //Start OR End of BinaryGap
                    found_1_end = true;

                    System.out.println("End of Binary Gap ...");
                }

                if(found_1_start && found_1_end){
                    System.out.println("Binary Gap Found - " + gap);

                    if(maxgap != 0){
                        if(gap > maxgap){
                            maxgap = gap;
                        }
                    } else {
                        maxgap = gap;
                    }

                    gap = 0;
                    found_1_end = false;
                } else {
                    //do nothing for now
                }              
            }
        }

        return maxgap;
    }

    public static void main(String[] args) {
        // given input
        int valueToBeTested = 1042;
        binarygapv2 bg = new binarygapv2();

        System.out.println("Input Value - " + valueToBeTested);
        System.out.println("Binary String - Input Value - " + Integer.toBinaryString(valueToBeTested));
        System.out.println("------------------------");
        System.out.println("Largest Binary Gap Sequence is: " + bg.solution(valueToBeTested));
    }
}
