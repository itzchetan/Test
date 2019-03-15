package Test;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
		
		int x= Input.nextInt();
		int y= Input.nextInt();
		Input.close();
		
		System.out.println("The output is:" +(x+y));

	}

}
