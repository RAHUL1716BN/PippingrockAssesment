package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Base.Basepage;
import Base.Elementmenu;



public class Homepage extends Basepage {
	

    public Homepage() {
        super();
    }
	
	public Elementmenu gotoElements() {
		WebElement elementsCard = driver.findElement(By.xpath(OR.getProperty("Elementlink")));
		Actions actions = new Actions(driver);
		actions.moveToElement(elementsCard).click().perform();
	//driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']")).click();
		return new Elementmenu(driver);

	}


		
	}
	

	


