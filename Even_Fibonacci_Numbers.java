public class Even_Fibonacci_Numbers {
    public static void main(String[] arg){
        int currentNumber = 0;
        int sum = 0;
        int f = 0;
        int s = 1;

        while(currentNumber < 4000000) {
            currentNumber = f + s;
            f = s;
            s = currentNumber;
        
            if (currentNumber%2 == 0) {
                sum += currentNumber;
            }
        }
        System.err.println(sum);
    }
    
}
