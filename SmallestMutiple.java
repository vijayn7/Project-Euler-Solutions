public class SmallestMutiple {
    public static void main(String[] args) {
        boolean solved = false;
        for (int i = 1; !solved; i++) {
            for (int j = 20; j > 1; j--) {
                if (i % j != 0) {
                    break;
                }
                if (i % j == 0 && j == 2) {
                    solved = true;
                    System.err.println(i);
                }
            }
        }
    }
    
}
