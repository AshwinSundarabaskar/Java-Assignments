package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		//Instantiate the browser driver
		ChromeDriver driver= new ChromeDriver();
		//launch url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize screen
		driver.manage().window().maximize();
		//locate and enter username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//locate and enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//locate and click login
		driver.findElement(By.className("decorativeSubmit")).click();
		//locate and click crmsfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//locate and click leads tab
		driver.findElement(By.linkText("Leads")).click();
		//locate and click create lead option
		driver.findElement(By.linkText("Create Lead")).click();
		//locate and enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TNQ Technologies");
		//locate and enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ashwin");
		//locate and enter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sundarabaskar");
		//locate and click create lead button
		driver.findElement(By.name("submitButton")).click();
		//close the browser
		driver.close();
	}

}
