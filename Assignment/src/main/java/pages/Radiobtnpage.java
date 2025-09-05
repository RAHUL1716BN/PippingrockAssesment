package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Base.Basepage;
import Base.Elementmenu;

public class Radiobtnpage extends Basepage {
	
	public Radiobtnpage() {
		super();
	}
	public void clickyes() {

		WebElement yesradio = driver.findElement(By.xpath(OR.getProperty("yesbtn")));
		yesradio.click();
	    
		
}
	
	public Elementmenu verifyyes() {
	    
		WebElement  result = driver.findElement(By.xpath(OR.getProperty("verifyyes")));
		Assert.assertEquals(result.getText(), "You have selected Yes");
		return new Elementmenu(driver);
	}
	}
