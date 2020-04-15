package academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPage;
import resources.base;

public class titleValidation extends base {
	
	public static Logger log = LogManager.getLogger(base.class.getName()); 
	@BeforeTest
	
	public void initialize() throws IOException {
		driver = initializerDriver(driver);
		log.info("driver is initialize");
		
		driver.get("http://qaclickacademy.com");
		log.info("Navigate to home page");
	}
	
		@Test
		public void basePageNavigation() throws IOException {
			
			LandingPage l = new LandingPage(driver);
			//l.getLogin().click();
			
		// compare the text from browser with actual text 123
			Assert.assertEquals(l.getTitle().getText(),"FEATURED COURSES");
			
		
	}
		@AfterTest
		public void teardown() {
			
			driver.quit();
		}

}
