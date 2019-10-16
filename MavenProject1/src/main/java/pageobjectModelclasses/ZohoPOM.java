package pageobjectModelclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ZohoPOM {

private static WebElement element = null;
	
	public static WebElement Button_Login(WebDriver driver){
		
		WebElement ele = driver.findElement(By.xpath("//*[text()='Login']"));
		return ele;
	} 
	
	public static WebElement Field_Username(WebDriver driver){
		
		WebElement ele = driver.findElement(By.xpath("//*[@id='lid']"));
		return ele;
	}
	
	public static WebElement Field_Password(WebDriver driver){
		
		WebElement ele = driver.findElement(By.xpath("//*[@id='pwd']"));
		return ele;
	}
	
	public static WebElement Button_Submit(WebDriver driver){
		
		WebElement ele = driver.findElement(By.xpath("//*[@id='signin_submit']"));
		return ele;
	}

	public static WebElement Button_Creator(WebDriver driver){
	
		WebElement ele = driver.findElement(By.xpath("//*[text()='Creator']"));
		return ele;
	
	}

	public static WebElement Button_Newapplication(WebDriver driver){
	
		WebElement ele = driver.findElement(By.xpath("//div[@class='primary-btn btn createNewApp pull-left zc-app-walkthrough']"));
		return ele;
	}
	
	public static WebElement Button_CreatefromScratch(WebDriver driver){
		
		WebElement ele = driver.findElement(By.xpath("//*[text()='Create from scratch']"));
		return ele;
	}
	
	public static WebElement Field_ApplicationName(WebDriver driver){
		
		WebElement ele = driver.findElement(By.id("scrAppName"));
		return ele;
	}
	
	public static WebElement Button_Create(WebDriver driver){
		
		WebElement ele = driver.findElement(By.id("proceedBtn"));
		return ele;
	}
	
	public static WebElement Field_createNewForm(WebDriver driver){
		
		WebElement ele = driver.findElement(By.id("zc-create-onboard"));
		return ele;
	}
	
	public static WebElement Button_BlankFormType(WebDriver driver){
		
		WebElement ele = driver.findElement(By.xpath("(//*[text()='Blank'])[1]"));
		return ele;
	}
	
	public static WebElement Field_FormName(WebDriver driver){
		
		WebElement ele = driver.findElement(By.id("new-form-name"));
		return ele;
	}
	
	public static WebElement Button_CreateForm(WebDriver driver){
		
		WebElement ele = driver.findElement(By.id("create-form-trigger"));
		return ele;
	
	} 
	
	public static WebElement Field_DisplayName(WebDriver driver){
		
		WebElement ele = driver.findElement(By.xpath("(//*[@id='displayName'])[1]"));
		return ele;
	
	} 
	
	public static WebElement Button_Done(WebDriver driver){
		
		WebElement ele = driver.findElement(By.xpath("(//*[text()='Done'])[1]"));
		return ele;
	
	}

	public static WebElement Button_AccessthisApplication(WebDriver driver){
		
		WebElement ele = driver.findElement(By.id("zc-dem-access-link"));
		return ele;
	
	}
	
	public static WebElement Field_EnterFirstName(WebDriver driver){
		
		WebElement ele = driver.findElement(By.xpath("//*[@id='firstname']"));
		return ele;
	
	}
	
	public static WebElement Field_EnterEmailID(WebDriver driver){
		
		WebElement ele = driver.findElement(By.id("zc-Enter_Email_ID"));
		return ele;
	
	}
	
	public static WebElement Field_EnterAddress(WebDriver driver){
		
		WebElement ele = driver.findElement(By.xpath("//*[@id='route']"));
		return ele;
	
	}
	
	public static WebElement Field_EnterPhoneNumber(WebDriver driver){
		
		WebElement ele = driver.findElement(By.xpath(""));
		return ele;
	
	}
	
	public static WebElement Button_Submit1(WebDriver driver){
		
		WebElement ele = driver.findElement(By.xpath("//*[@name='submit']"));
		return ele;
	
	}
	
	public static WebElement Field_Report(WebDriver driver){
		
		WebElement ele = driver.findElement(By.xpath("(//*[@class='zc-nav-title'])[3]"));
		return ele;
	
	}
	
	public static WebElement Button_Menuicon(WebDriver driver){
		
		WebElement ele = driver.findElement(By.xpath("//*[@id='appIcon']/i"));
		return ele;
	
	}
	
	public static WebElement Button_LogOut(WebDriver driver){
		
		WebElement ele = driver.findElement(By.xpath("(//*[text()='Logout'])[2]"));
		return ele;
	
	}


}
