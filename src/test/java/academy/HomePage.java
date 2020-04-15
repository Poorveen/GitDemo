package academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;


public class HomePage extends base {
	
	public static Logger log = LogManager.getLogger(base.class.getName()); 
	@Test(dataProvider ="getdata")
	public void basePageNavigation(String Username, String Password, String Text) throws IOException {
		
		driver = initializerDriver(driver);
		
		driver.get("http://qaclickacademy.com");
		log.info("Navigate to home page");
		
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();
		
		LoginPage lp = new LoginPage(driver);
		lp.email().sendKeys(Username);
		lp.password().sendKeys(Password);
		lp.login().click();
		System.out.println(Text);
	
	}
	@AfterTest
	public void teardown() {
		driver.quit();
		driver=null;
		
	}
	@DataProvider
	public Object[][] getdata() {
		
		Object[][] data = new Object [2][3];
				
				data[0][0]="unrestrictedabc@mail.com";
				data[0][1]="123456";
				data[0][2]="unrestricted";	
				
				data[1][0]="restrictedabc@mail.com";
				data[1][1]="123456";
				data[1][2]="restricted";
				
				return data;
				
	
	}
	

	
	}
	



		