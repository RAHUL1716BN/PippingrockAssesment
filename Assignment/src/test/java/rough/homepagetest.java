package rough;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.Basepage;
import pages.Homepage;
import pages.Textpage;

public class homepagetest {
	
	
	public static void main(String[] args) {
	
      Homepage home = new Homepage();
       home.gotoElements();
    Textpage txt =  Basepage.menu.gotoText();
      txt.addalltext("rahul", "rahul@gmail.com", "Bengalore", "Same");
      
      Basepage.quitDriver();
	}
}
