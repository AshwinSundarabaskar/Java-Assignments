package week2.day2;

public class Browser {
	
	//creating 1st method
	public String launchBrowser (String browserName) {
		System.out.println(browserName+ " Browser launched successfully");
		return browserName;
	}
	
	//creating 2nd method
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}

	//creating object and calling the above methods
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser object= new Browser();
		object.launchBrowser("Google Chrome");
		object.loadUrl();

	}
}
