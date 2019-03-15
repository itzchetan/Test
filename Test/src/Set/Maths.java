package Set;

public class Maths {
int a,b,c,d;


Maths(int alpha, int bravo, int gamma, int delta){
	a=alpha;
	b=bravo;
	c=gamma;
	d=delta;
	}

void addition() {
	int add=a+b+c+d;
	System.out.println("The addition of total is :"+add);
}

void multiply() {
	int mul=a*b*c*d;
	System.out.println("The multiplication is :"+mul);
}

int group() {
	return (a+b)*(c+d);
	
}
}
