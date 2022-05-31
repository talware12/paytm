package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rechargeandbills {

	@FindBy (xpath ="//div[text()='Become a Seller & Earn']")
	private WebElement BecomeaSellerandEarn;
	 
	@FindBy (xpath = "//button[@type='success']" )
	private WebElement SellonPaytm;
	
	
	
	public Rechargeandbills (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	 
	public void ClickonBecomeaSellerandEarn()
	{
		BecomeaSellerandEarn.click();
	}
	
	

	public void ClickonSellonPaytm() {
		SellonPaytm.click();
		
	}
	

}
