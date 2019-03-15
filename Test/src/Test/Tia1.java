package Test;

import java.util.Scanner;

public class Tia1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tia Coles = new Tia(32, 57, 765, 987, 564);

				System.out.println("Press 1 to display Profit:\nPress 2 to display loss:");
		System.out.println("Press 3 to diplay total sale: ");
		
		Scanner Choice = new Scanner(System.in);
		int a = Choice.nextInt();
		Choice.close();

		if(a==1) {
			Coles.Profit();
		}
		
		if (a==2) {
			Coles.Loss();
		}
		
		if (a==3) {
			Coles.TotalSale();
		}
		
		else {
			System.out.println("Error in selection Please enter 1,2 or 3");
		}
		
	}

}
