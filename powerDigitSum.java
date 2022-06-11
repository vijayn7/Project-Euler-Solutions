import java.math.BigInteger;

public class powerDigitSum{
    public static void main(String[] args) {
		BigInteger number = new BigInteger(String.valueOf(2));
		BigInteger power = number.pow(1000);
		String powerInString = String.valueOf(power);
		int length = powerInString.length();
		int sum = 0;
		int temp = 0;

		for (int i = 0; i < length; i++) {
			temp = powerInString.charAt(i) - 48;
			sum += temp;
		}
		System.out.println(sum);
	}
}