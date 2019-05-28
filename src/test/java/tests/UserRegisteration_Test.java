package tests;

import org.testng.annotations.Test;
import data.ExcelReader;
import java.io.IOException;

import org.testng.annotations.DataProvider;

import pages.Home_Page;
import pages.Registeration_Page;

public class UserRegisteration_Test extends TestBase{


	Home_Page homepageObject;
	Registeration_Page RegisterObject;

	@DataProvider(name="ExcelData")
	public Object[][] userRegisterData() throws IOException
	{
		 //get data from Excel Reader class 
		ExcelReader ER = new ExcelReader();
		return ER.getExcelData();
	}

	@Test(priority=1,alwaysRun=true,dataProvider="ExcelData")
	public void usercanRegisterSuccessfully(String firstname , String lastname , String email , String password, String confirmPass)
	{

		//Test Steps for clicking on the Register Link
		homepageObject =new Home_Page(driver);
		homepageObject.OpenRegisterationLink();
		
		//Enter the Registration Information as per Excel Sheet
		RegisterObject=new Registeration_Page(driver);
		RegisterObject.userRegisteration(firstname, lastname, email, password, confirmPass);


	}

}
