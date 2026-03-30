public class frogjmpv2 {
    public int solution(int pos, int dest, int increment){
        int numberofjumps = 0;
        int remainder = 0;
        int jumps_estimated = 0;

        if((pos + increment) > dest){
            numberofjumps = 1;
        } else {
            remainder = (dest % increment);

            jumps_estimated = (dest - remainder)/increment;

            numberofjumps = jumps_estimated + 1;
        }

        return numberofjumps;
    }    

  public static void main(String[] args) {
    frogjmpv2 frogger = new frogjmpv2();
    
    System.out.println("Number of Jumps: " + frogger.solution(1, 48, 10));
  }
}
