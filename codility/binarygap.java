public class binarygap {
    public int solution(int N){
        int retValue = 0;
        int newSequence = 0;
        int oldSequence = 0;

        if(N > 0){
            String convertedToByteString = Integer.toBinaryString(N);
            char[] convertedCharArray = convertedToByteString.toCharArray();

            int firstIndexOfZero = convertedToByteString.indexOf("0");
            int firstIndexOfOne = convertedToByteString.indexOf("1");
            int lastIndexOfOne = convertedToByteString.lastIndexOf("1");

            System.out.println("Converted Binary String: " + convertedToByteString);
            System.out.println("First 0 at Character Index: " + firstIndexOfZero);
            System.out.println("First 1 at Character Index: " + firstIndexOfOne);
            System.out.println("Last 1 at Character Index: " + lastIndexOfOne);

            //100000
            if(firstIndexOfZero >=0 && firstIndexOfOne != lastIndexOfOne && lastIndexOfOne > firstIndexOfOne + 1){
                for(int q = firstIndexOfZero; q< convertedCharArray.length; q++){
                    if(convertedCharArray[q] == '0'){
                        newSequence+=1;
                    } else {
                        if(q < convertedCharArray.length -1){
                            if(newSequence > oldSequence) oldSequence = newSequence;
                            newSequence = 0;
                        }
                    }
                }

                if(oldSequence > newSequence){
                    retValue = oldSequence;
                } else {
                    retValue = newSequence;
                }
            }
        }

        return retValue; 
    }

  public static void main(String[] args) {

    // given input
    int valueToBeTested = 6;
    binarygap bg = new binarygap();
    
    System.out.println("Largest Binary Gap Sequence is: " + bg.solution(valueToBeTested));
  }
}