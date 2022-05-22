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

public class Test02 extends base {
	WebDriver driver;

	public static Logger log = LogManager.getLogger(Test02.class.getName());

	@BeforeTest
	public void beforeTest03() throws IOException {
		driver = invokeBrowser();
		driver.get(prop.getProperty("url"));
		log.info("Driver Invoked");

	}

	@Test
	public void Test03() {
		page01 a = new page01(driver);
		a.openTab().click();
		Set<String> tabs = driver.getWindowHandles();
		Iterator<String> itr = tabs.iterator();
		String parent = itr.next();
		String child = itr.next();
		driver.switchTo().window(child);

		page02 b = new page02(driver);
		b.login().click();
		b.email().sendKeys("rajnare.82@gmail.com");
		b.password().sendKeys("rajeshnare");
		b.submit().click();
		log.info("Test03 done");

	}

	@AfterTest
	public void afterTest03() {
		driver.quit();
		log.info("Driver closed");
	}

}
