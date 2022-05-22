package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ebay {
	public WebDriver driver;
	
	public ebay(WebDriver driver) {
		this.driver=driver;
	}
	
	By selectDrop=By.xpath("//select[@aria-label=\"Select a category for search\"]");
	By search=By.xpath("//input[@type=\"submit\"]");
	
	public WebElement selectDrop() {
		return driver.findElement(selectDrop);
	}
	
	public WebElement search() {
		return driver.findElement(search);
	}
	

}
