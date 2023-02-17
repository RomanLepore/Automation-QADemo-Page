package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demoqa.Base;

public class CheckBoxUse extends Base{
	
	By checkBoxListLocator = By.id("item-1");
	
	By expandBtnLocator = By.cssSelector("button[aria-label='Expand all']");
	By documentBtnLocator = By.cssSelector("label[for='tree-node-documents']");
	
	By documentActiveLocator = By.cssSelector("span");
	
	public CheckBoxUse(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void checkBoxPage() throws InterruptedException {
		click(checkBoxListLocator);
		Thread.sleep(2000);
		click(expandBtnLocator);
		Thread.sleep(2000);
		click(documentBtnLocator);
	}
	public String documentActive() throws InterruptedException {
		List<WebElement> spans  =  findElements(documentActiveLocator);
		return getText(spans.get(136));
	}
	
}
