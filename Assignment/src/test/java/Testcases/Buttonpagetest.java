package Testcases;

import org.testng.annotations.Test;

import Base.Basepage;
import Base.Elementmenu;
import pages.Buttonpage;

public class Buttonpagetest {

	@Test
	public void buttonpagetest() {
		
		Buttonpage bt = Basepage.menu.gotobuttons();
		bt.testdoubleclick();
		
		
	}
}
