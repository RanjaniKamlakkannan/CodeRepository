package commonMethods;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HelperMethods {
	
	private static WebElement element = null;
	
	public static int RandomNumbers(WebDriver driver){
	
		 // create instance of Random class 
        Random rand = new Random(); 
  
        // Generate random integers in range 0 to 999 
        int rand_int1 = rand.nextInt(1000);
        System.out.println("Random Integers: "+rand_int1); 
		return rand_int1;
	}
	
	

}
