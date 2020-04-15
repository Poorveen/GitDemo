package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	private By signin = By.cssSelector("a[href*='sign_in']");
	private By title = By.cssSelector(".text-center>h2");
	private By naviagtion = By.cssSelector(".navbar.navbar-default.navbar-static-top > div > nav");
	
	public LandingPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public WebElement getLogin()
	{
	   return driver.findElement(signin);
	}

	public WebElement getTitle() {
		return driver.findElement(title);
	}
}
