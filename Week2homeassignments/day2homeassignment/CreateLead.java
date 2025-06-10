package week2.day2homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// Initialize the WebDriver (ChromeDriver).
		EdgeDriver driver = new EdgeDriver();
		
		//Load the URL http://leaftaps.com/opentaps/. 
		driver.get("http://leaftaps.com/opentaps/");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Enter the username and password
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
				
		//Click the "Login" button
		driver.findElement(By.className("decorativeSubmit")).click();
				
		//Click the "CRM/SFA" link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on the "Create Lead" button. 
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter a FirstName. 
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Muthu");
		
		//Enter a LastName. 
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		
		//Enter a CompanyName. 
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//Enter a Title . 
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium");
		
		//Click the "Create Lead" button. 
		driver.findElement(By.name("submitButton")).click();
		
		//Verify that the Title is displayed correctly.
		
		//Close the browser window. 
		driver.close();

	}

}
