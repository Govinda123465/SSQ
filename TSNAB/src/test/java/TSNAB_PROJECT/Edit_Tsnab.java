package TSNAB_PROJECT;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.bouncycastle.cms.bc.BcEdDSASignerInfoVerifierBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Edit_Tsnab {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver =new ChromeDriver();
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
	    
	    /*Edit the Existed Sim*/
	  driver.findElement(By.xpath("//a[@data-id='666aa114151e4076356570']")).click();
     	//Thread.sleep(2000);
     
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("cnm")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE ,"Airtel",Keys.TAB,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE ,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE ,"7569000000",Keys.TAB, Keys.BACK_SPACE,Keys.BACK_SPACE, Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
  
		
		  driver.findElement(By.id("smslmt")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"700", Keys.TAB, "800");
		  
	      Thread.sleep(2000);
		  Robot r =new Robot();
	
		   /*Bsnl*/ 
       driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple']")).click();
       
         r.keyPress(KeyEvent.VK_DOWN);
	      r.keyRelease(KeyEvent.VK_DOWN);
          driver.findElement(By.xpath("//span[@class='select2-dropdown select2-dropdown--below']/span/ul/li[2]")).click();
		   	  

      Thread.sleep(2000);
           /*VI*/
        driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple']")).click();
	   
	   r.keyPress(KeyEvent.VK_DOWN);
       r.keyRelease(KeyEvent.VK_DOWN);
       driver.findElement(By.xpath("//span[@class='select2-dropdown select2-dropdown--below']/span/ul/li[4]")).click();
               

       Thread.sleep(3000);
		
		  driver.findElement(By.xpath("//button[text()='Update']")).sendKeys(Keys.ENTER);  
		  
	}

}
