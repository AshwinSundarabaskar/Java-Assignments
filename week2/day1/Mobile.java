package week2.day1;

public class Mobile {
	
	//create 1st method
	public void makeCall (String mobileModel, float mobileWeight) {
		System.out.println(mobileModel+ " is the mobile model");
		System.out.println(mobileWeight+ " is the mobile weight");
	}
	
	//create 2nd method
	public void sendMsg (boolean isFullCharged, int mobileCost) {
		System.out.println(isFullCharged+ " Mobile is charged");
		System.out.println(mobileCost+ " is the mobile cost");
	}

	//create a new object
	public static void main(String[] args) {
		Mobile object= new Mobile();
		object.makeCall("Samsung", 1.5f);
		object.sendMsg(true, 8000);
		System.out.println("This is my mobile");
	}

}
