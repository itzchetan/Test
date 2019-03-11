
public class Watches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Watch Timex = new Watch(4534, "TIMEX",8754 , 5);
		System.out.println("The Profit made selling timex is:" + Timex.profits());

		Watch watch2 = new Watch(2354,"Citizen",4536,87);
		System.out.println("The profit made selling "+watch2.Brand+" is of Rs:"+watch2.profits());
		
	}

}
