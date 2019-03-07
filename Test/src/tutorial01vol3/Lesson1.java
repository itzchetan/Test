package tutorial01vol3;

public class Lesson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is my start of program");// first this line would be printed
		firstName();// after first line printed firstName method would be called
		lastName();// after FirstName method is executed lastName method would be executed
		addNames();// after lastName is executed addNames would be executed.

		System.out.println("\nThis is the end of Program");// once all the methods are executed this line would be
															// printed
		

	}

	public static void firstName() {
		System.out.println("My First name is Chetan");
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("The sum is :" + c);
		

	}

	public static void lastName() {
		System.out.println("\nMy last Name is Singh");
	}

	public static void addNames() {
		int a = 6;
		int b = 5;
		int sum = a + b;
		System.out.println("\nThe sum is :" + sum);
	}

}
