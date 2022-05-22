package pack01;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.page01;
import pageObjects.page02;
import resources.base;

public class Test03 extends base {
	WebDriver driver;

	public static Logger log = LogManager.getLogger(Test03.class.getName());

	@BeforeTest
	public void beforeTest04() throws IOException {
		driver = invokeBrowser();
		driver.get(prop.getProperty("url"));
		log.info("Driver Invoked");

	}

	@Test
	public void Test04() {
		page01 c=new page01(driver);
		c.alertName().sendKeys("Rajesh");
		c.alertButton().click();
		Assert.assertTrue(driver.switchTo().alert().getText().contains("Rajesh"));
		log.info("Alert Accepted");

	}

	@AfterTest
	public void afterTest04() {
		driver.quit();
		log.info("Driver closed");
	}

}
