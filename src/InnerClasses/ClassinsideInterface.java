package InnerClasses;
interface Vehicle{
	public int getNnoofwheels();
	class Defaultvehicle implements Vehicle{
		public int getNnoofwheels() {
			return 4;
		}
	}
}
class Bus implements Vehicle{
	public int getNnoofwheels() {
		return 7;
	}
}
public class ClassinsideInterface {

	public static void main(String[] args) {
	Vehicle.Defaultvehicle v=new Vehicle.Defaultvehicle();
	System.out.println(v.getNnoofwheels());
	Bus b=new Bus();
    System.out.println(b.getNnoofwheels());
	}

}
