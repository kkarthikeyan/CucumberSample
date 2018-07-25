package steps;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;
	
	@When("^user launches the application$")
	public void userLaunchesTheApplication() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.walgreens.com");
		
		//dismiss t&c popup
		driver.findElement(By.linkText("Dismiss")).click();
		Thread.sleep(100);	
	}
	
	@Then("^cart item count should not be displayed$")
	public void cartItemCountShouldNotBeDisplayed() throws Throwable {
		//verify item not in cart
		List<WebElement> cartitems = driver.findElements(By.className("wag-cart-item-count"));
		assertTrue("Cart Item Count icon should not be displayed", cartitems.isEmpty());

		driver.quit();
	}

}
