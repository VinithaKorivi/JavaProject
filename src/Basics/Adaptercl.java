package Basics;
interface Vehicle{
	public abstract void start();
	public abstract void stop();
	public abstract void fuel();
	public abstract void Horn();	
}
abstract class  VehicleAdapter implements Vehicle{
	public void start() {
		
	}
	public void stop() {
		
	}
	public void fuel() {
		
	}
	public void Horn() {
		
	}
}
class Car extends VehicleAdapter{
    public void start() {
		System.out.println("Car started");
	}
public void stop() {
		System.out.println("car stopped");
	}
}
public class Adaptercl {

	public static void main(String[] args) {
		Vehicle v=new Car();
		v.start();
		v.stop();

	}

}
