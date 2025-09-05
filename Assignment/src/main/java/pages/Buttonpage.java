package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Basepage;
import Base.Elementmenu;

public class Buttonpage extends Basepage{

	
	public Buttonpage() {
		super();
	}
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public Elementmenu testdoubleclick() {
		
		WebElement doubleclickbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR.getProperty("doublebtn"))));
		wait.until(ExpectedConditions.elementToBeClickable(doubleclickbtn));
		Actions actions = new Actions(driver);
		actions.doubleClick(doubleclickbtn).perform();
		return new Elementmenu(driver);
		
	}
}
