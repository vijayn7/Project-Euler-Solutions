public class numberToArray {

    public static int[] toArray(int n) {
        String temp = Integer.toString(n);
        int[] numbers = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
        }
        return numbers;
    }

    public static int[] toArray(long n) {
        String temp = Long.toString(n);
        int[] numbers = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
        }
        return numbers;
    }

    public static void main(String[] args) {
        int integer1 = 236849987;
        Long long1 = 7809267843120924812L;
        
        System.err.println(toArray(integer1));
        System.err.println(toArray(long1));
        //both fuctions return an array you can index into
    }
    
}
