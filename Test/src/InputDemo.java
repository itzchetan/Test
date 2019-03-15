import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);//
		
		int a = input.nextInt();// this method is reading inputvalue and assigning to a
		int b = input.nextInt();
		
		
		System.out.println("Sum is: " + (a+b));
		
		input.close();
		
		if (a==10) {
			System.out.println("This is the correct output");
		}
		else
		{
			System.out.println("Wrong");
		}
		
	}

}
