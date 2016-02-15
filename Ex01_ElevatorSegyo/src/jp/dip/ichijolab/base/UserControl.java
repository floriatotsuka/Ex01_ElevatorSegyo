package src.jp.dip.ichijolab.base;

public class UserControl {

	private static User usr = new User();

	public void walkToFloor(int floor) {

		if (floor != usr.getFloor()){
			usr.setFloor(floor);
			System.out.println("I'm in "+ usr.getFloor()+ "F.");
		} else {
			System.out.println("I'm already in " + floor + "F.");
		}

	}

}
