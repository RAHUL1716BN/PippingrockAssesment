package pages;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.Basepage;

public class Linkpage extends Basepage {

	public Linkpage() {
		super();
	}
	public void gotonewtab() {
		
		WebElement newtabs = driver.findElement(By.xpath(OR.getProperty("newtab")));
		newtabs.click();
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
	}
}
