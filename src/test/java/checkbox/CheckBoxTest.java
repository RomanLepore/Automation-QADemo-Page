package checkbox;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CheckBoxTest {
	
	private WebDriver driver;
	CheckBoxUse demo_ch;
	
	@Before
	public void setUp() {
		demo_ch = new CheckBoxUse(driver);
		driver = demo_ch.chromeDriverConnection();
		demo_ch.visit("https://demoqa.com/elements");
	}
	@Test
	public void test() throws InterruptedException {
		demo_ch.checkBoxPage();
		assertEquals("You have selected :",demo_ch.documentActive());
		
	}
	@After
	public void tearDown() {
		driver.quit();
	}
	
}
