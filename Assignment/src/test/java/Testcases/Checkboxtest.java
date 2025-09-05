package Testcases;

import org.testng.annotations.Test;

import Base.Basepage;
import pages.Checkboxpage;

public class Checkboxtest {

	@Test
	public void checkboxtest() {
		
	    Checkboxpage check = Basepage.menu.gotoCheckbox();
	    check.gotocheckbox();
	   check.gotoSelected();
	 
	}
}
