public class summationOfPrimes {

    public static boolean isPrime(int n) {
        if (n == 1 || n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        long sum = -1;
        for (int i = 0; i<2000000; i++) {
            if(isPrime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
    
}
