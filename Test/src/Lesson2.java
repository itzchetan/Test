

public class Lesson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 10;
		int number2 = 20;

		int addition1 = 12;
		int addition2 = 23;
		int addition3 = 45;
		
		
		int addall=addition(addition1, addition2,addition3);
		System.out.println("The three number addition is:"+addall);
		
		

		float meters = 102.0f;
		float KM = divide(meters);
		System.out.println("\nThe Meter to KM conversion is " + KM);
		
		

		int addition = addNumbers(number1, number2);
		System.out.println("\nThe addition is :" + addition);
		
		

		int multiply = multiply(number1, number2);
		System.out.println("\nThe multiplication is :" + multiply);

	}

	public static int addNumbers(int a, int b) {
		int sum = a + b;
		return sum;

	}

	public static int multiply(int a, int b) {
		int m = a * b;
		return m;
	}

	public static float divide(float a) {
		float k = a / 1000;
		return k;
	}

	public static int addition(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}
}
