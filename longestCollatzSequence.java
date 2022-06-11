public class longestCollatzSequence {
    public static void main(String[] args) {
        long sequenceLength = 0;
        long startingNumber = 0;
        long sequence;
 
        for (int i = 2; i <= 1000000; i++) {
            int currentLength = 1;
            sequence = i;

            while (sequence != 1) {
                if ((sequence % 2) == 0) {
                    sequence = sequence / 2;
                } else {
                    sequence = sequence * 3 + 1;
                }
                currentLength++;
            }

            if (currentLength > sequenceLength) {
            sequenceLength = currentLength;
            startingNumber = i;
            }
        }
        System.err.println(startingNumber);
    }
}