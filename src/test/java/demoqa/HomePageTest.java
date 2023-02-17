package demoqa;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class HomePageTest {
	
	private WebDriver driver;
	HomePage demo_qa;
	
	@Before
	public void setUp() {
		demo_qa = new HomePage(driver);
		driver = demo_qa.chromeDriverConnection();
		demo_qa.visit("https://demoqa.com/");
	}
	@Test
	public void test() throws InterruptedException {
		demo_qa.homePage(driver);
		demo_qa.textBoxUse();
		
	}
	@After
	public void tearDown() {
		//driver.quit();
	}
}
