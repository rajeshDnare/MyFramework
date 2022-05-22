package pack01;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.ebay;
import pageObjects.page01;
import pageObjects.page02;
import resources.base;

public class Test04 extends base {
	WebDriver driver;

	public static Logger log = LogManager.getLogger(Test04.class.getName());

	@BeforeTest
	public void beforeTest05() throws IOException {
		driver = invokeBrowser();
		driver.get(prop.getProperty("url01"));
		log.info("Driver Invoked");

	}

	@Test
	public void Test05() {
		ebay e=new ebay(driver);
		Select s=new Select(e.selectDrop());
		s.selectByVisibleText("Cell Phones & Accessories");
		e.search().click();
		Assert.assertTrue(false);
	}

	@AfterTest
	public void afterTest05() {
		driver.quit();
		log.info("Driver closed");
	}

}
