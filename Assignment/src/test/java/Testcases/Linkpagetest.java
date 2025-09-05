package Testcases;

import org.testng.annotations.Test;

import Base.Basepage;
import pages.Linkpage;

@Test
public class Linkpagetest {

	
	public void linkpagetest() {
		Linkpage link = Basepage.menu.gotoLinks();
		link.gotonewtab();
	}
}
