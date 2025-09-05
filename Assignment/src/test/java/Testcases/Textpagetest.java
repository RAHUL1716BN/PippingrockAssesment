package Testcases;

import org.testng.annotations.Test;

import Base.Basepage;
import pages.Textpage;

public class Textpagetest {
	
	
	@Test
	public void textpagetest() {
		
		 Textpage txt =  Basepage.menu.gotoText();
	      txt.addalltext("rahul","rahul@gmail.com", "Bengalore", "Same");
		
	}
 
}
