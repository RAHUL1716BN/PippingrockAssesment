package Testcases;

import org.testng.annotations.Test;

import pages.Homepage;

public class HomepageTest {
	
	@Test
	public void homepagetest() {

	      Homepage home = new Homepage();
	       home.gotoElements();
	}

}
