import java.math.BigInteger;
import java.util.*;

public class FrogJmp {
    public int solution(int X, int Y, int D){
        int nextJump = 0;
        int rem = 0;
        BigInteger retValue = new BigInteger("0");

        if(X > 0 && Y > 0 && X <= Y){
            retValue = new BigInteger(Y+"");

            retValue = retValue.subtract(new BigInteger(X+""));

            retValue = retValue.divide(new BigInteger(D+""));

            rem = (Y-X)%D;

            if(rem > 0){
                nextJump = 1;
            }
        }

        return retValue.intValue() + nextJump;
    }

  public static void main(String[] args) {

    // given input
    int X = 10;
    int Y = 10;
    int D = 30;

    FrogJmp fj = new FrogJmp();
    
    System.out.println("Number of least Jumps: " + fj.solution(X, Y, D));
  }    
}
