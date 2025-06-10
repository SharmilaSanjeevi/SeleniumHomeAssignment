package week2.day2homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
		//Initialize the WebDriver(ChromeDriver)
		EdgeDriver driver = new EdgeDriver();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Enter the username and password
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click the "Login" button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click the "CRM/SFA" link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on the "Accounts" tab
		driver.findElement(By.linkText("Accounts")).click();
		
		//Click on the "Create Account" button
		driver.findElement(By.linkText("Create Account")).click();
		
		//Enter an account name
		driver.findElement(By.id("accountName")).sendKeys("Sharmi");
		
		//Enter a description as "Selenium Automation Tester"
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//Select "ComputerSoftware" as the industry
		WebElement industryDropdown = driver.findElement(By.name("industryEnumId"));
		Select selectValueFromIndustryDropDown = new Select(industryDropdown);
		selectValueFromIndustryDropDown.selectByValue("IND_SOFTWARE");
		
		//Select "S-Corporation" as ownership using SelectByVisibleText
		WebElement ownerShipDropDown = driver.findElement(By.name("ownershipEnumId"));
		Select selectValueFromOwnerShipdropDownValue = new Select(ownerShipDropDown);
		selectValueFromOwnerShipdropDownValue.selectByVisibleText("S-Corporation");
		
		//Select "Employee" as the source using SelectByValue
		WebElement sourceDropDown = driver.findElement(By.id("dataSourceId"));
		Select selectValueFromSourceDropDown = new Select(sourceDropDown);
		selectValueFromSourceDropDown.selectByValue("LEAD_EMPLOYEE");
		
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex. 
		WebElement marketingDropdown = driver.findElement(By.id("marketingCampaignId"));
		Select selectValuefromMarketingDropDown = new Select(marketingDropdown);
		selectValuefromMarketingDropDown.selectByIndex(6);
		
		//Select "Texas" as the state/province using SelectByValue
		WebElement stateProvinceDropDown = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select selectValueFromStateProvinceDropDown = new Select(stateProvinceDropDown);
		selectValueFromStateProvinceDropDown.selectByValue("TX");
		
		//Click the "Create Account" button. 
		driver.findElement(By.className("smallSubmit")).click();
		
		//Close the browser window
		driver.close();
		
		
	
		

	}

}
