public class hundredThousandthPrime {

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int primesFound = 0;
        for (int i = 2; primesFound <= 10001; i++) {
            if (primesFound == 10001) {
                System.out.println(i-1);
                break;
            }
            if (isPrime(i)) {
                primesFound++;
            }
        }

    }
}
