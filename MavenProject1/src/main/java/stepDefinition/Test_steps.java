package stepDefinition;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonMethods.HelperMethods;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectModelclasses.PomActionsclass;
import pageobjectModelclasses.ZohoPOM;

public class Test_steps {
	
	private static WebDriver driver = null;
	FluentWait<WebDriver> wait;	

	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\R.Kamalakkannan\\Eclipse_64\\Chromedriver\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;	
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(30, TimeUnit.SECONDS) 			
				.pollingEvery(5, TimeUnit.SECONDS) 			
				.ignoring(NoSuchElementException.class);
		driver.get("https://www.zoho.com");
		System.out.println("***Launched the browser and Zoho application successfully****");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		
		ZohoPOM.Button_Login(driver).click();
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
	    
		ZohoPOM.Field_Username(driver).sendKeys("R.kamalakkannan@perficient.com");
		ZohoPOM.Field_Password(driver).sendKeys("September@2019");
		ZohoPOM.Button_Submit(driver).click();
		System.out.println("************Zoho application logged in successfully***********");
	}

	
	@Then("^user is displayed with Zoho appa page$")
	public void user_is_displayed_with_Zoho_appa_page() throws Throwable {	    
		ZohoPOM.Button_Creator(driver).isDisplayed();
		System.out.println("*************Zoho apps are displayed successfully**************");
	}

	
	@Given("^the user click on the create application field$")
	public void the_user_click_on_the_create_application_field() throws Throwable {

		ZohoPOM.Button_Creator(driver).click();
		Thread.sleep(2000);
		ZohoPOM.Button_Newapplication(driver).click();
		Thread.sleep(2000);
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='Create from scratch']"))));
		ZohoPOM.Button_CreatefromScratch(driver).click();	
		ZohoPOM.Field_ApplicationName(driver).sendKeys("Newapplication" + HelperMethods.RandomNumbers(driver));
		ZohoPOM.Button_Create(driver).click();
		System.out.println("*********Creating New application from scratch successfully***********");
	}	
	   
	
	@When("^I Select a new BlankForm template$")
	public void i_Select_a_new_BlankForm_template() throws Throwable {
		
		ZohoPOM.Field_createNewForm(driver).click();
		ZohoPOM.Button_BlankFormType(driver).click();
		ZohoPOM.Field_FormName(driver).isEnabled();
		ZohoPOM.Field_FormName(driver).sendKeys("newblankForm" + HelperMethods.RandomNumbers(driver));
		ZohoPOM.Button_CreateForm(driver).click();
		System.out.println("*********Creating New Form in BlankType successfully***************");
				
	}


	@When("^I enter inputs for all the basic fields$")
	public void i_enter_inputs_for_all_the_basic_fields() throws Throwable {
	   
		PomActionsclass.Field_Name(driver);
		ZohoPOM.Field_DisplayName(driver).sendKeys("Name of the Form");
		PomActionsclass.Field_Email(driver);
		ZohoPOM.Field_DisplayName(driver).sendKeys("Enter Email ID");
		PomActionsclass.Field_Address(driver);
		ZohoPOM.Field_DisplayName(driver).sendKeys("Enter New Address");
		PomActionsclass.Field_Phone(driver);
		ZohoPOM.Field_DisplayName(driver).sendKeys("Enter Telephone Number");
		PomActionsclass.Field_Checkbox(driver);
		ZohoPOM.Button_Done(driver).click();
		ZohoPOM.Button_AccessthisApplication(driver).isEnabled();
		ZohoPOM.Button_AccessthisApplication(driver).click();
		System.out.println("********* New Form in BlankType is created successfully***************");
		
	}
		@Then("^user is created with new Form successfully$")
		public void user_is_created_with_new_Form_successfully() throws Throwable {
		//enter the inputs in the form to submit
		
		for (int i=0; i<4; i++) {
		
		ZohoPOM.Field_EnterFirstName(driver).sendKeys("TestForm" + HelperMethods.RandomNumbers(driver)); 		
		ZohoPOM.Field_EnterEmailID(driver).sendKeys("TestForm1"+ HelperMethods.RandomNumbers(driver) +"@gmail.com");
		ZohoPOM.Field_EnterAddress(driver).sendKeys("No." + HelperMethods.RandomNumbers(driver) +",Guindy,Chennai");
		ZohoPOM.Button_Submit1(driver).click();
		ZohoPOM.Field_Report(driver).click();
		System.out.println("********* Form Report with data's are viewed successfully***************");
		
		}
		
	}

	@And("^I Logout the application$")
	public void i_Logout_the_application() throws Throwable {
		
//		Logout the application by clicking on the profile		
//		driver.findElement(By.id("zc-account-settings")).click();
		ZohoPOM.Button_Menuicon(driver).click();
		ZohoPOM.Button_LogOut(driver).click();
		System.out.println("Zoho application logged out successfully");
		
//		check if home page is display back
		String Assert1 = driver.findElement(By.xpath("(//*[text()='LOGIN'])[1]")).getText();
		Assert.assertEquals("Login button is displayed now", Assert1, "LOGIN");
		Assert.assertTrue(Assert1.toUpperCase().contains("LOGIN"));

		
	}



}
