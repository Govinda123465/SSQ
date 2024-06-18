package TSNAB_PROJECT;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Libraries.*;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


//import Libraries.General_Utilities;

public class Add_and_edit_sim extends General_Utilities
{
            
	public static void main(String[] args) throws Throwable
	{	
		
		     WebDriver driver =new ChromeDriver();
		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		       
				driver.get("https://rao.dev.salesquared.in/tsnab_portal");
				
				driver.manage().window().maximize();
				
				driver.findElement(By.id("details-button")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("proceed-link")).click();
			
				Thread.sleep(1000);
				
				driver.findElement(By.name("username")).sendKeys("govinda.p@Krishnasoft.in", Keys.TAB, "Tsnab@123");	
				Thread.sleep(2000);
				 driver.findElement(By.id("sub")).click(); 
				 Thread.sleep(2000);
			
				 /*Manage Minu*/
			WebElement ele=driver.findElement(By.xpath("//b[text()='Manage']"));
			Actions act =new Actions(driver);
			
			act.moveToElement(ele).build().perform();
			
			/* SIM Menu */
			driver.findElement(By.xpath("//b[text()=' Register SIMS']")).click();
			
			/*Add new SIM*/
			driver.findElement(By.id("add_new_cont")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("cnm")).sendKeys("JIO",Keys.TAB,"7569762324",Keys.TAB, "Testing Purpose");
			
			Thread.sleep(1000);
			
		   driver.findElement(By.xpath("//span[text()='Select...']")).click();
		
		   Robot r =new Robot();
		   
		   r.keyPress(KeyEvent.VK_DOWN);
		   r.keyRelease(KeyEvent.VK_DOWN);
			
		   r.keyPress(KeyEvent.VK_DOWN);
		   r.keyRelease(KeyEvent.VK_DOWN);
			
		   r.keyPress(KeyEvent.VK_DOWN);
		   r.keyRelease(KeyEvent.VK_DOWN);
			
		   driver.findElement(By.xpath("//span[@class ='select2-results']/ul/li[4]")).click();
		   
		   driver.findElement(By.id("smslmt")).sendKeys("500", Keys.TAB, "500");
		   
	   
           Thread.sleep(2000);
//              /*Bsnl*/
//           driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple']")).click();
//		   
//		   r.keyPress(KeyEvent.VK_DOWN);
//		   r.keyRelease(KeyEvent.VK_DOWN);
//           driver.findElement(By.xpath("//span[@class='select2-dropdown select2-dropdown--below']/span/ul/li[2]")).click();
		   
           Thread.sleep(2000);
	      /*Airtel*/
	       driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple']")).click(); 
	   
	        r.keyPress(KeyEvent.VK_DOWN);
             r.keyRelease(KeyEvent.VK_DOWN);
             driver.findElement(By.xpath("//span[@class='select2-dropdown select2-dropdown--below']/span/ul/li")).click();
       
//            Thread.sleep(2000);
//       /*VI*/
//            driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple']")).click();
//		   
//		   r.keyPress(KeyEvent.VK_DOWN);
//		   r.keyRelease(KeyEvent.VK_DOWN);
//           driver.findElement(By.xpath("//span[@class='select2-dropdown select2-dropdown--below']/span/ul/li[2]")).click();
//         
           Thread.sleep(2000);
           /*JIO*/
           driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple']")).click();
		   
		   r.keyPress(KeyEvent.VK_DOWN);
		   r.keyRelease(KeyEvent.VK_DOWN);
           driver.findElement(By.xpath("//span[@class='select2-dropdown select2-dropdown--below']/span/ul/li[3]")).click();
        
		 	//	driver.findElement(By.id("add")).click();
		 			
		 		Thread.sleep(10000);	 			
	}

}
