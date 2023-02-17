package searchbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demoqa.Base;

public class SearchBox extends Base{
	
	By searchBoxLocator = By.cssSelector("input[class='navbar__search--input']");
	
	// Localizador del botón que te redirige a la última pestaña de cards
	By lastBtnLocator = By.linkText("Last");

	//Localizador del botón de la pestaña 39
	By btn39Locator = By.partialLinkText("39");

	public SearchBox(WebDriver driver) {
		super(driver);
	}
	
	/* Este método encuentra el searchbox, escribe la palabra java 
	   y busca las cards relacionadas con dicha palabra presionando ENTER */
	public void useSearchBox() throws InterruptedException {
		if(findElement(searchBoxLocator).isDisplayed()) {
			clear(searchBoxLocator);		
			type("java",searchBoxLocator);
			findElement(searchBoxLocator).sendKeys(Keys.ENTER);
			Thread.sleep(1000);
		}
	}
	
	/*   Este método busca el botón que redirige a la última pestaña de noticias,
	 	 si esto es correcto verifica estar en la página 39 y escribe en la searchbox
	 	 programa exitoso */
	public void goLastPage() throws InterruptedException {
		click(lastBtnLocator);
		if(findElement(btn39Locator).isDisplayed()) {
			type("Successful program", searchBoxLocator);
		}else {
			System.out.println("Error when going to the last page");
		}
		Thread.sleep(1000);
	}
}
