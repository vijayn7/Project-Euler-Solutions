import java.lang.Math;
import java.security.cert.TrustAnchor;
public class LargestPrimeFactor{

    public static boolean isPrime(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] arg){
        int i = 2;
        int savedNumber = 1;
        while (i < Math.sqrt(600851475143L)) {
            if (600851475143L % i == 0) {
                if (isPrime(i)) {
                    savedNumber = i;
                    System.err.println(i);
                    i++;
                }
            }
            else {
                i++;
            }
        }
    }
}