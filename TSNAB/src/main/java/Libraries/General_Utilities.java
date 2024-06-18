package Libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class General_Utilities 
      {
	         
		    /*    public static void main(String[] arg) throws Throwable  
		        {
		          // Some code that might throw Throwable
		           throw new Throwable("An error occurred");
		        }
		   */
	
			/*Maximize the TSNAB */
		 	public void maximeWindow(WebDriver driver) 
		 	{
		 		  driver.manage().window().maximize();
			}
	
	
	
			/*Log Out of TSNAB*/	  	 
	  		  //   driver.findElement(By.xpath("//span[@class ='d-none d-md-inline']")).click();
	  		     
	  	  	  //   driver.findElement(By.xpath("//a[text()=\"Log Out\"]")).click(); 
		     
	
			   /* Monitoring */
//      	  WebElement ele= driver.findElement(By.xpath("//b[text()='Monitoring']"));
//            Actions act = new Actions(driver);
//	          act.moveToElement(ele).perform();    
//              
//	         Thread.sleep(2000);
//	        driver.findElement(By.xpath("//b[text()='Live Monitoring']")).click();
	 
	
	  }


