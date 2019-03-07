package Practice;

public class Vehicle {
	int cc;
	int wheels;
	int gears;
	String Number;
	String Make;

	void defaultvehicle() {
		cc = 1000;
		wheels = 4;
		gears = 6;
		Number = "MH20BN2519";
		Make = "Hyundai";
	}

	void initialisevehicle(int c, int w, int g, String N, String M) {
		cc=c;
		wheels = w;
		gears = g;
		Number = N;
		Make = M;
		System.out.println("\nCC is: "+c+"\nWhels are:"+w+"\nGears are:"+g+"\nNumber of Vehicle is: "+N+"\nMake of Vehicle is:"+M);
		}
	
	void display() {
		System.out.println("\nCC is: "+cc+"\nWheels are:"+wheels+"\nGears are:"+gears+"\nNumber of Vehicle is: "+Number+"\nMake of Vehicle is:"+Make);
	}
	{
		System.out.println("This is for static");
	}
	

}

