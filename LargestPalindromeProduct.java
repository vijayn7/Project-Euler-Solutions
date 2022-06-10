import java.security.Principal;

public class LargestPalindromeProduct{
    
    public static boolean isPalindrome(int n){
        int reversedNum = 0, remainder;
        int originalNum = n;
    
        while (n != 0) {
            remainder = n % 10;
            reversedNum = reversedNum * 10 + remainder;
            n /= 10;
        }
        if (originalNum == reversedNum) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] arg){
        int largestPalindrome = 0;

        for (int i = 999; i > 100; i--) {
            for (int j = 999; j > 100; j--) {
                if (isPalindrome(i*j) && i*j > largestPalindrome) {
                    largestPalindrome = i*j;
                }
            }
        }
        System.err.println(largestPalindrome);
    }
}