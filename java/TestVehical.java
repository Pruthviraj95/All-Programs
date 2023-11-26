abstract class vehical {
	int regno;
	int cost;
	String model;
	double fule_cap, max_speed,milage;
	abstract void fule_need(double km);
	abstract void dist_covered(double hrs);
	void display(){
		System.out.println("Registor number="+regno);
		System.out.println("Cost of Bus="+cost);
		System.out.println("Name of model="+model);
		System.out.println("Capacity of Bus="+fule_cap);
		System.out.println("Maximum speed of bus="+max_speed);
		System.out.println("Milage of bus="+milage);
	}
}
class bus extends vehical{
	bus(){
		regno=0001;
		cost=2500000;
		model="Benze";
		fule_cap=50;
		max_speed=60;
		milage=13.7;
	}
	void fule_need(double km){
		double x=km/milage;
		System.out.println("Fule Needed for given distance"+x);
	}
	void dist_covered(double hrs){
		double covered=max_speed*hrs;
		System.out.println("Distance covered is"+covered);
	}

}

class truck extends vehical{
	truck(){
		regno=0002;
		cost=3000000;
		model="Bharat";
		fule_cap=80;
		max_speed=40;
		milage=9;
	}
	void fule_need(double km){
		double x=km/milage;
		System.out.println("Fule Needed for given distance"+x);
	}
	void dist_covered(double hrs){
		double covered=max_speed*hrs;
		System.out.println("Distance covered is"+covered);
	}

}
class TestVehical{
	public static void main(String arg[]){
		bus b1=new bus();
		b1.display();
		b1.fule_need(300);
		b1.dist_covered(6.8);
		truck b2=new truck();
		b2.display();
		b2.fule_need(450);
		b2.dist_covered(8.9);

	}

	
	
}