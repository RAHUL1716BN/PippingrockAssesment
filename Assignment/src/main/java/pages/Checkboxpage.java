package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Basepage;
import Base.Elementmenu;

public class Checkboxpage extends Basepage {
	
   public Checkboxpage() {
	   super();
   }
	
	public void gotocheckbox()  {
		
		driver.findElement(By.cssSelector(OR.getProperty("Expandall"))).click();
		
	}
	
	public Elementmenu gotoSelected() {
		driver.findElement(By.xpath(OR.getProperty("Selectedbox"))).click();
		return new Elementmenu(driver);
	}
	}

