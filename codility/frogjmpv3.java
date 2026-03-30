public class frogjmpv3 {
    public int solution(int X, int Y, int D) {
        // Calculate the total distance to cover
        int distanceToCover = Y - X;

        // If the frog is already at or past the target, 0 jumps needed
        if (distanceToCover <= 0) {
            return 0;
        }

        // Calculate full jumps
        int jumps = distanceToCover / D;

        // If there's a remainder, we need one more jump to reach/surpass Y
        if (distanceToCover % D != 0) {
            jumps++;
        }

        return jumps;
    }    

  public static void main(String[] args) {
    frogjmpv3 frogger = new frogjmpv3();
    
    System.out.println("Number of Jumps: " + frogger.solution(1, 48, 10));
  }
}
