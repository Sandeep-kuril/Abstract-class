abstract class Vehicle{
	void fuel() {
		System.out.println("Every vehicle should have fuel");
	}
	abstract void car_AC();
	abstract void autodrive();
	
	
}
abstract class Car extends Vehicle{
	abstract void car_AC();
	void autodrive() {
		System.out.println("Luxery car have Autodriver Functionality");
	}
}

class Carac extends Car{
	 void car_AC() {
		System.out.println("Luxery car have AC Functionality");
	}
}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Carac ac=new Carac();
        ac.fuel();
        ac.car_AC();
        ac.autodrive();
	}

}
