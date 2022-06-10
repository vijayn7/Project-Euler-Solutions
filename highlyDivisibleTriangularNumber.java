public class highlyDivisibleTriangularNumber {

    public static int numberOfDivisors(int n) {
        int divisors = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors++;
            }
        }
        return divisors;
    }

    public static int numberFromSequence(int step) {
        int sum = 0;
        for (int i = 0; i <=step; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        boolean shouldContinue = true;
        for (int i = 1; shouldContinue; i++) {
            if (numberOfDivisors(numberFromSequence(i)) > 500) {
                System.out.println(numberFromSequence(i));
                shouldContinue = false;
            }
        }
    }
    
}
