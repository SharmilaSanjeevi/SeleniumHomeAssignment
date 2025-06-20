package testleaf.maraton1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch the Browser
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Load the Url "https://www.pvrcinemas.com/";
		driver.get("https://www.amazon.in/");
		
		//add  implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Type "Bags for boys" in the Search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys"+Keys.ENTER);
		
		//Choose the item in the result (bags for boys)
		
		//Print the total number of results (like 50000) example like this-----> 1-48 of over 50,000 results for "bags for boys"
		WebElement element = driver.findElement(By.xpath("(//div[@class='sg-col-inner']//h2)[1]"));
		System.out.println(element.getText());
		
		//Select the first 2 brands in the left menu (like American Tourister, Generic)
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		
		//Choose New Arrivals (Sort)
	    driver.findElement(By.xpath("(//span[@class='a-button-inner']/span)[1]")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		//Print the first resulting bag info (name, discounted price)
		WebElement element2 = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]"));
		System.out.println(element2.getText());
		WebElement element3 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		System.out.println(element3.getText());
		
		//Get the page title and close the browser(driver.close())
		System.out.println("Page Title: "+driver.getTitle());
		driver.quit();

	}

}
