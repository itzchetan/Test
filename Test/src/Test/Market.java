package Test;

//Use of Private 

public class Market {
private int costprice;
int sellingprice, quantity;

Market(int cp, int sp, int q){
	costprice=cp;
	sellingprice=sp;
	quantity=q;
	
	
}
int profit() {
	return(sellingprice-costprice)*quantity;
	
}
void costing (int c) {
	if((c>50)&&(c<100)){
		costprice=c;
		System.out.println("The costsprice is now:"+costprice);
	}
	else
		System.out.println("Error: Cannot set more than 100");
}
}
