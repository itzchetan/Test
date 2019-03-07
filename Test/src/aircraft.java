
public class aircraft {
	int speed, age, wheels;
	String Name, Type;
	float fuel;
	


	void defaultAircraft() {
		speed = 10;
		age = 5;
		wheels = 3;
		Name = "Mirage";
		Type = "Fighter";
		System.out.println("Speed :" + speed + "\n Age of plane : " + age + "\n Name of Palne: " + Name + "\nType of Plane: "
				+ Type + "\nWheels in Plane: " + wheels);
	}
	
	
	void initializeAircraft(int planeSpeed, int planeAge) {
		
		speed = planeSpeed;
		age = planeAge;
		
		
	}
	void displayAircraft() {
		System.out.println(speed +" The speed " +age +"Age");
	}
}



