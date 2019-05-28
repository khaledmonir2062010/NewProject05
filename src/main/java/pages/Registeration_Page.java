package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registeration_Page extends PageBase {

	public Registeration_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	//Gender WebElement
	@FindBy(id="gender-male")
	WebElement Gender_Radiobtn;


	//FirstName WebElement
	@FindBy(id="FirstName")
	WebElement firstName_txtbox;


	//LastName WebElement
	@FindBy(id="LastName")
	WebElement lastName_txtbox;


	//DOB WebElements

	@FindBy(name="DateOfBirthDay")
	WebElement Day_Dropmenu;

	@FindBy(name="DateOfBirthMonth")
	WebElement Month_Dropmenu;

	@FindBy(name="DateOfBirthYear")
	WebElement Year_dromenu;


	//Email WebElement
	@FindBy(id="Email")
	WebElement Email_txtbox;


	//Password WebElement
	@FindBy(id="Password")
	WebElement pass_txtbox;

	//Password WebElement
	@FindBy(id="ConfirmPassword")
	WebElement Conpass_txtbox;
	
	//Register Button WebElement
	
	@FindBy(id="register-button")
	WebElement Registerbtn;
	
	//Logout Link
	@FindBy(linkText="Log out")
	WebElement logoutLink;
	
	@FindBy(css="div.result")
	public WebElement sucessmsg;
	
	
	public void userRegisteration(String Fname,String lastName, String email, String password, String confirmPass)
	{
		
		Click_Button(Gender_Radiobtn);
		
		clearText(firstName_txtbox);
		SetTXT(firstName_txtbox, Fname);
		clearText(lastName_txtbox);
		SetTXT(lastName_txtbox, lastName);
		clearText(Email_txtbox);
		SetTXT(Email_txtbox, email);
		clearText(pass_txtbox);
		SetTXT(pass_txtbox, password);
		clearText(Conpass_txtbox);
		SetTXT(Conpass_txtbox, confirmPass);
		
		Click_Button(Registerbtn);
		
	}
	
	public void LogoutLink()
	{
		
		Click_Button(logoutLink);
	}
	
	
	
	
	
	
	



}
