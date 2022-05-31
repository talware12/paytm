package packp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browsers.Base;
import pomclasses.Headerp;
import pomclasses.Rechargeandbills;

public class Paytm {
	
	WebDriver driver;
	Headerp headerp;
	Rechargeandbills rechargeandbills;
	
	@Parameters ("browserName")
	@BeforeTest
	public void Browserlaunch(String browser) throws InterruptedException
	{
		
		System.out.println("browser");
		
		if(browser.equals("Chrome"))
		{
			driver = Base.openChromeBrowser();
		}
		
		if(browser.equals("Edge"))
		{
			driver = Base.openEdgeBrowser();
		}
		
		if(browser.equals("Firefox"))
		{
			driver = Base.openFirefoxBrowser();
		}
		
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		System.out.println("BeforeTest");
	}
  @BeforeClass
  public void createPOMobject() {
	  headerp = new Headerp(driver);
	  rechargeandbills = new Rechargeandbills(driver);
	  
  }
  
	@BeforeMethod
	public void varifyHeaderp() throws InterruptedException {
		
		driver.get("https://paytm.com/");
		
		
		
		headerp.ClickonCompany();
		Thread.sleep(3000);
         //String url= driver.getCurrentUrl();
		//Assert.assertEquals("https://paytm.com/", url);
		headerp.ClickonBlog();
		
		System.out.println("BeforeMethod");
		
	}
	
	@Test
	
	public void varifyRechargeandbills() throws InterruptedException {
		Thread.sleep(2000);
		driver.get("https://paytm.com/");
	 Thread.sleep(2000);
		rechargeandbills.ClickonBecomeaSellerandEarn();
	 //  String url= driver.getCurrentUrl();
		
	  // Assert.assertEquals("https://seller.paytm.com/login", url);
		
		//String title= driver.getTitle();
		//Assert.assertEquals("Paytm Marketplace Sign Up ",title);
		Thread.sleep(2000);
		rechargeandbills.ClickonSellonPaytm();
		
		System.out.println("Test");}
		
	
		@AfterMethod
		public void backtomainpage() {
			System.out.println("AfterMethod=Main page");
		}
		@AfterClass
		public void clearObject() {
			
			 headerp = null;
			  rechargeandbills = null;
			System.out.println("AfterClass");
		}
		
	@AfterTest
	 public void closedBrower() {
		driver.close();
		driver= null;
		System.gc();
		}
	}
	

	
		
	
	
	

