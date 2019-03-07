
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 0, n2 = 1;
		for (int i = 1; i <= 10; i++) {

			

			int sum = n1 + n2;
			n1 = n2; //n2 value is now passed to n1
			n2 = sum; //sum value is now passed to n2
			System.out.println("Fibonacci " + n1);
		}
	}
}
