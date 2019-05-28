package tests;

import java.io.FileReader;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import pages.Home_Page;
import pages.Registeration_Page;

public class UserRegisteration_Test2_CSVReader extends TestBase{


	Home_Page homepageObject;
	Registeration_Page RegisterObject;

	//for reading CSV
	CSVReader reader;

	@Test(priority=1,alwaysRun=true)
	public void usercanRegisterSuccessfully() throws IOException
	{
		//Get the path for the CSV file
		String CSV_file=System.getProperty("user.dir")+"\\src\\test\\java\\data\\UserData.csv";
		reader= new CSVReader(new FileReader(CSV_file));
		
		String[] CSVCell;
		
		//while loop will be executed till the last value in CSV file
		
		while((CSVCell=reader.readNext())!=null)
		{
			String firstname=CSVCell[0];
			String lastName=CSVCell[1];
			String email=CSVCell[2];
			String password=CSVCell[3];
			String conPass=CSVCell[4];
			
			
		//Test Steps for clicking on the Register Link
		homepageObject =new Home_Page(driver);
		homepageObject.OpenRegisterationLink();

		//Enter the Registration Information as per Excel Sheet
		RegisterObject=new Registeration_Page(driver);
		RegisterObject.userRegisteration(firstname,lastName,email,password,conPass);
		Assert.assertTrue(RegisterObject.sucessmsg.getText().contains("Your registration completed"));
		RegisterObject.LogoutLink();
		}
		


	}

}
