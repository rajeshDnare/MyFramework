package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page01 {
	public WebDriver driver;
	
	/**
	public page01(WebDriver driver) {
		this.driver=driver;
	}
	//using page objects
//	By SuggestionBox=By.xpath("//input[@id=\"autocomplete\"]");
	By Suggestions=By.xpath("//li[@class=\"ui-menu-item\"]/div");
	By selectBox=By.xpath("//select[@id=\"dropdown-class-example\"]");
	By openTab=By.xpath("//a[@id=\"opentab\"]");
	By alertName=By.xpath("//input[@id=\"name\"]");
	By alertButton=By.xpath("//input[@id=\"alertbtn\"]");
	
//	public WebElement SuggestionBox() {
//		return driver.findElement(SuggestionBox);
//	}
//	
	public List<WebElement> Suggestions() {
		return driver.findElements(Suggestions);
	}
	
	public WebElement selectBox() {
		return driver.findElement(selectBox);
	}
	
	public WebElement openTab() {
		return driver.findElement(openTab);
	}
	
	public WebElement alertName() {
		return driver.findElement(alertName);
	}
	
	public WebElement alertButton() {
		return driver.findElement(alertButton);
	}
	**/

	//By using page object factory
	 
	public page01(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id=\"autocomplete\"]") WebElement SuggestionBox;
	@FindBy(xpath = "//li[@class=\"ui-menu-item\"]") List<WebElement> Suggestions;
	@FindBy(xpath = "//select[@id=\"dropdown-class-example\"]") WebElement selectBox;
	@FindBy(xpath = "//a[@id=\"opentab\"]") WebElement openTab;
	@FindBy(xpath = "//input[@id=\"name\"]") WebElement alertName;
	@FindBy(xpath = "//input[@id=\"alertbtn\"]") WebElement alertButton;
	
	public WebElement SuggestionBox() {
		return SuggestionBox;
	}
	
	public List<WebElement> Suggestions() {
		return Suggestions;
	}
	
	public WebElement selectBox() {
		return selectBox;
	}
	
	public WebElement openTab() {
		return openTab;
	}
	
	public WebElement alertName() {
		return alertName;
	}
	
	public WebElement alertButton() {
		return alertButton;
	}
	

}
