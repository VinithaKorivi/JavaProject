package PracticePrograms;
interface Vehicle{
	int brate=1000;
	void start();
	void stop();
	double calculaterent(int days);
	
	default void maintenance() {
		System.out.println("General vehicle maintenance scheduled:");
	}
	static void rentalpolicy() {
		System.out.println("Rental Policy: Damage charges and taxes apply");
	}
		
}
interface Electric{
	void chargebattery();
	default void batterystatus(int percent) {
		System.out.println("Battery is at "+percent+"%");
	}
}
class Car implements Vehicle{
	private String model;
	public Car (String model) {
		this.model=model;
	}
	@Override
	public void start() {
		System.out.println(model+"Car Started");
	}
	@Override
	public void stop() {
		System.out.println(model+"Car stopped");
	}
	@Override
	public double calculaterent(int days) {
		return brate*days;
	}
}
class Electricbike implements Vehicle,Electric{
	private String brand;
	public Electricbike(String brand) {
		this.brand=brand;
	}
	@Override
	public void start() {
		System.out.println(brand+"Electric bike started silently");
	}
	@Override
	public void stop() {
		System.out.println(brand+"Electric bite stopped");
	}
	@Override
	public double calculaterent(int days) {
		return (brate*0.5)*days;
	}
	@Override
	public void chargebattery() {
		System.out.println(brand+"E bike charging");
	}
}
public class INTERFACE {

	public static void main(String[] args) {
     Vehicle.rentalpolicy();
     
     Vehicle car=new Car("Toyota");
     Vehicle ebike= new Electricbike("Hero");
     
     car.start();
     car.stop();
     System.out.println("car rented 3 days"+car.calculaterent(3));
     car.maintenance();
     System.out.println("----------------------");
     ebike.start();
     ebike.stop();
     System.out.println("bike rented 5 days"+ebike.calculaterent(5));
     ebike.maintenance();
   
     
     Electricbike e=new Electricbike("Ather");
     e.chargebattery();
     e.batterystatus(50);
	}

}
