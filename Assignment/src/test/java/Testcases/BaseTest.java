package Testcases;

import org.testng.annotations.AfterSuite;

import Base.Basepage;

public class BaseTest {
	
	@AfterSuite
	public void tearDown() {
    Basepage.quitDriver();
}
}