package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class page02 {
	public WebDriver driver;
	
	public page02(WebDriver driver) {
		this.driver=driver;
	}
	
	By login=By.xpath("//a[contains(@href,\"sign_in\")]");
	By email=By.xpath("//input[@name=\"email\"]");
	By password=By.xpath("//input[@name=\"password\"]");
	By submit=By.xpath("//input[@type=\"submit\"]");
	
	public WebElement login() {
		return driver.findElement(login);
	}
	
	public WebElement email() {
		return driver.findElement(email);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement submit() {
		return driver.findElement(submit);
	}

}
