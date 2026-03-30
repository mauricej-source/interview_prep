public class palindrome {
    public static void main(String args[]) {
        String testSubject = "code";

        boolean isPalindrome = false;

        String reverse = "";

        for (int i =testSubject.length() - 1; i>=0; i--){

            reverse = reverse + testSubject.charAt(i);
        }

        if(testSubject.equalsIgnoreCase(reverse)){
            isPalindrome = true;
        }
 
        System.out.println(testSubject);
        System.out.println(reverse);
        System.out.println(isPalindrome);
    }
}
