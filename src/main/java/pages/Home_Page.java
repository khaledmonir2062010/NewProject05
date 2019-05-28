package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page extends PageBase {

	public Home_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Register Object Web Element
	
	@FindBy(linkText="Register")
	WebElement Register_link;
	
	
	//login Object Web Element
	
	@FindBy(linkText="Log in")
	WebElement Login_Link;
	
	
	//WishList Object Web Element
	
	@FindBy(linkText="Wishlist")
	WebElement wishlist_Link;
	
	
	public void OpenRegisterationLink()
	{
		
		Click_Button(Register_link);
		
	}
	
	
	
	
	
}
