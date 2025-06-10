package week2.day2homeassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;


public class FaceBook {

	public static void main(String[] args) {
		// Initialize ChromeDriver 
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL https://en-gb.facebook.com/ 
		driver.get("https://www.facebook.com");
		
	    // Maximize the browser window 
		driver.manage().window().maximize();
		
	    // Add an implicit wait to ensure the web page elements are fully loaded
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

}
