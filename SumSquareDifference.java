public class SumSquareDifference {

    public static int squaredSum(int range) {
        int sum = 0;
        for (int i = 1; i <= range; i++) {
            sum += i*i;
        }
        return sum;
    }

    public static int sumSquared(int range) {
        int sum = 0;
        for (int i = 1; i <= range; i++) {
            sum += i;
        }
        return sum * sum;
    }

    public static void main(String[] args) {
        System.out.println(sumSquared(100) - squaredSum(100));
    }
}
