/*
 * Java Program to find missing numbers in an integer
 * array with duplicates. Array may contains more
 * than one duplicates.
 * 
 * input: {1, 1, 2, 3, 5, 5, 7, 9, 9, 9};
 * output: 4, 6, 8
 */
import java.util.HashSet;

public class missinginteger {
    public int solution(int[] A){
        HashSet<Integer> nums = new HashSet<Integer>();
    
        for(int i = 1; i <= A.length+1; i++){
            nums.add(i);
        }

        System.out.println(nums.toString());

        for(int a: A){
            nums.remove(new Integer(a));
        }

        System.out.println(nums.toString());

        return nums.iterator().next();
    }

  public static void main(String[] args) {

    // given input
    //int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9};
    int[] input = { 2, 3, 1, 5};
    missinginteger mi = new missinginteger();
    
    System.out.println("Missing Integer Found: " + mi.solution(input));
  }
}