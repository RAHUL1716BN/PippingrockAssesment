package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.Buttonpage;
import pages.Checkboxpage;
import pages.Linkpage;
import pages.Radiobtnpage;
import pages.Textpage;

public class Elementmenu extends Basepage {
	
	WebDriver driver ;
	
	public Elementmenu(WebDriver driver) {
		this.driver = driver;
	}
	public Textpage gotoText() {
		
		driver.findElement(By.xpath(OR.getProperty("Textopition"))).click();
		return new Textpage(driver);
	}
	
	public Checkboxpage gotoCheckbox() {
		
		driver.findElement(By.xpath(OR.getProperty("Checkboxoption"))).click();
		
		return new Checkboxpage();
	}

	
	public Radiobtnpage gotoRadioButton() {
		
		driver.findElement(By.xpath(OR.getProperty("Radiobtn"))).click();
		
		return new Radiobtnpage();
	}
	
	
	
	public void gotoWebtable() {
		
	}
	
	public Buttonpage gotobuttons() {
		
		driver.findElement(By.xpath(OR.getProperty("btn"))).click();
		return new Buttonpage();
	}
	
	public Linkpage gotoLinks() {
		
		driver.findElement(By.xpath(OR.getProperty("linkbtn"))).click();
		return new Linkpage();
	}
}
