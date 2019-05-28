package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

	protected WebDriver driver;
	
	//Constructor For Page_Factory objects 
	
	public PageBase(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	//Click Buttons Method
	protected static void Click_Button(WebElement button)
	{
		button.click();
	}
	
	
	//Send text(send keys) Method
	protected static void SetTXT(WebElement txtelement,String value)
	{
		
		txtelement.sendKeys(value);
	}
	
	//Clear Element text box Method
	public void clearText(WebElement element) 
	{
		element.clear();
	}
	
	
}
