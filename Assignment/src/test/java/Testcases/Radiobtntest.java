package Testcases;

import org.testng.annotations.Test;

import Base.Basepage;
import pages.Radiobtnpage;

public class Radiobtntest {

	@Test
	public void radiobtntest() {
		
		  Radiobtnpage rd = Basepage.menu.gotoRadioButton();
		  rd.clickyes();
		  rd.verifyyes();
	}
	
	
}

