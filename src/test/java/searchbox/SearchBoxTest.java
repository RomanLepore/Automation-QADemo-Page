package searchbox;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SearchBoxTest {
	
	private WebDriver driver;
	private SearchBox sb;
	
	@Before
	public void setUp() {
		sb = new SearchBox(driver);
		driver = sb.chromeDriverConnection();
		sb.visit("https://www.toolsqa.com/selenium-training/");
	}
	@Test
	public void test() throws InterruptedException {
		sb.useSearchBox();
		sb.goLastPage();
	}
	@After
	public void tearDown() {
		driver.quit();
	}
	
}
