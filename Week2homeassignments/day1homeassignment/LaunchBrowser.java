package week2.day1homeassignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//Import the required libraries at the beginning of your Java class. 
		//(import org.openqa.selenium.chrome.ChromeDriver)
		//Instantiate the browser driver 
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url:   https://www.facebook.com/ 
		driver.get("https://www.facebook.com");
		
		//Maximize the browser window. 
		driver.manage().window().maximize();
		
		//Close the browser window. 
		driver.close();

	}

}
