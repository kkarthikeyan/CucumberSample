package pages;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;


public class HomePage extends PageObject {
	public void launchApp() throws InterruptedException {
		getDriver().get("https://www.walgreens.com");
		
		//dismiss t&c popup
		getDriver().findElement(By.linkText("Dismiss")).click();
		Thread.sleep(100);	
	}
	
	public void checkCartCount(int count) {
		if(count==0) {
			List<WebElement> cartitems = getDriver().findElements(By.className("wag-cart-item-count"));
			assertTrue("Cart Item Count icon should not be displayed", cartitems.isEmpty());
		}
	}
	
	public void searchItem(String itemName) {
		getDriver().findElement(By.id("ntt-placeholder")).sendKeys(itemName);
		getDriver().findElement(By.className("wag-header-search-btn")).click();		
	}
}
