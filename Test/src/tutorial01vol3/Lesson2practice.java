package tutorial01vol3;

public class Lesson2practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 43;
		int number2 = 12;
		int number3 = 87;
		int Average = average(number1, number2, number3);
		System.out.println("The average is:"+Average);
		
		int Average1 = complex(number1, number2, number3);
		System.out.println("The average is:"+Average1);
		
		int both = average(number1, number2, number3)+complex(number1, number2, number3);
		System.out.println("The average is:"+both);
	}

	public static int average(int a, int b, int c) {
		int avg = (a + b + c) / 3;
		return avg;

	}
	public static int complex(int a, int b, int c) {
		int avg = a+b+c;
		int n = avg*100;
		return n;
		
	}
	
	
	
}
