package demoqa;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

@SuppressWarnings("unused")
public class HomePage extends Base {

	By elementBtnLocator = By.cssSelector("div h5");

	By webTablesLocator = By.id("item-3");

	By searchBoxLocator = By.id("searchBox");
	By deleteBtnLocator = By.id("delete-record-2");

	By textBoxLocator = By.id("item-0");
	By fullNameLocator = By.id("userName");

	By submitBtnLocator = By.id("submit");

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void homePage(WebDriver driver) throws InterruptedException {

		click(elementBtnLocator);

		// Fluent Wait
		FluentWait fwait = new FluentWait(driver);
		fwait.withTimeout(Duration.ofSeconds(10L)).pollingEvery(Duration.ofSeconds(2L));
		fwait.ignoring(NoSuchElementException.class);

		click(webTablesLocator);

		if (findElement(searchBoxLocator).isDisplayed()) {
			clear(searchBoxLocator);
			click(searchBoxLocator);
			type("12000", searchBoxLocator);
			// Espera ingresada para poder apreciar lo que hace la automatización
			Thread.sleep(1000);
			click(deleteBtnLocator);
		}
	}

	public void textBoxUse() throws InterruptedException {
		click(textBoxLocator);
		Thread.sleep(2000);

		if (findElement(fullNameLocator).isDisplayed()) {
			type("Trabajo terminado!!", fullNameLocator);
			click(submitBtnLocator);
		} else {
			System.out.println("ERROR");
		}
	}
}
