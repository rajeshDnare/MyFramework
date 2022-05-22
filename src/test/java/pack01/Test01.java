package pack01;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.page01;
import resources.base;

public class Test01 extends base{
	public WebDriver driver;
	page01 a;
	
	public static Logger log=LogManager.getLogger(Test01.class.getName());
	@BeforeTest
	public void beforeTest01() throws IOException {
		driver=invokeBrowser();
		driver.get(prop.getProperty("url"));
		log.info("Driver Inovoked");
	}
	
	@Test
	public void Test01() {
		
		a=new page01(driver);
		a.SuggestionBox().sendKeys("Ind");
		log.info("Text Typed");
		List<WebElement> sugg=a.Suggestions();
		Iterator<WebElement> itr=sugg.iterator();
		while(itr.hasNext()) {
			WebElement name=itr.next();
			if(name.getText().equalsIgnoreCase("India")) {
				name.click();
			}
		}
		log.info("Options Selected");
		
	}
	
	@Test
	public void selectBox() {
		Select s=new Select(a.selectBox());
		s.selectByVisibleText("Option2");
		log.info("Options Selected");
		
	}
	
	@AfterTest
	public void afterTest01() {
		driver.close();
		log.info("Driver closed");
	}
}
