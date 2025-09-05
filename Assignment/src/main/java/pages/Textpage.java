package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.Basepage;
import Base.Elementmenu;

public class Textpage extends Basepage{
	
	   public Textpage(WebDriver driver) {
	        super(); 
	   }
	public Elementmenu addalltext(String name, String Email, String Location, String PerLocation)  {
		
		driver.findElement(By.xpath(OR.getProperty("addName"))).sendKeys(name);
		driver.findElement(By.xpath(OR.getProperty("addemail"))).sendKeys(Email);
		driver.findElement(By.xpath(OR.getProperty("Addlocation"))).sendKeys(Location);
		driver.findElement(By.xpath(OR.getProperty("AddPerLoc"))).sendKeys(PerLocation);
		WebElement submitBtn = driver.findElement(By.xpath(OR.getProperty("Submit")));
		try {
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);
		    submitBtn.click();
		} catch (ElementClickInterceptedException e) {
		    // fallback to JS click
		    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
		}
		return new Elementmenu(driver);
	}

}
