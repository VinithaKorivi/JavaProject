package PracticePrograms;
class Room{
	private String roomtype;
	public Room(String roomtype) {
		this.roomtype=roomtype;
	}
	public void show() {
		System.out.println("roomtype="+roomtype);
	}
}
class House{
	private Room room;
	public House() {
		this.room=new Room("bedroom");
	}
	public void showing() {
		System.out.println("House has:");
		room.show();
	}
}
public class Composition {

	public static void main(String[] args) {
		House h=new House();
		h.showing();

	}

}
