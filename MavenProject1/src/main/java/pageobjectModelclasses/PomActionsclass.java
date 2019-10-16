package pageobjectModelclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PomActionsclass {

private static WebElement element = null;
	
	public static void Field_Name(WebDriver driver){
		
		Actions actions = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("(//*[text()='Name'])[1]"));
		actions.doubleClick(ele).perform();
	} 
	
	public static void Field_Email(WebDriver driver){
	
		Actions builder = new Actions(driver);
	 	WebElement from = driver.findElement(By.xpath("(//*[text()='Email'])[2]"));
	 	WebElement to = driver.findElement(By.xpath("(//*[@class='blockLayout virtual ui-sortable'])[4]")); 
	 	builder.dragAndDrop(from, to).perform();
	}
	
	public static void Field_Address(WebDriver driver){
		
		Actions builder = new Actions(driver);
	 	WebElement from = driver.findElement(By.xpath("(//*[text()='Address'])[1]"));
	 	WebElement to = driver.findElement(By.xpath("(//*[@class='blockLayout virtual ui-sortable'])[4]")); 
	 	builder.dragAndDrop(from, to).perform();
	}
	
	public static void Field_Phone(WebDriver driver){
		
		Actions actions = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("(//*[text()='Phone'])[1]"));
		actions.doubleClick(ele).perform();
	}
	
	public static void Field_Checkbox(WebDriver driver){
		
		Actions actions = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("(//*[text()='Checkbox'])[1]"));
		actions.doubleClick(ele).perform();
	}
	
	
}
