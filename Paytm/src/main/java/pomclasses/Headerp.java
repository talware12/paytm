package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Headerp {
	
	@FindBy (xpath = "//a[text()='Company']" )
	private WebElement Company;
	
	
	@FindBy (xpath ="(//a[text()='Blog'])[1]")
	private WebElement Blog;
	 
	
	
	
	
	/*public Headerp (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	 
	public void ClickonCompany() {
		Company.click();
		
	}*/
	
	public void ClickonBlog()
	{
		 Blog.click();
	}

	
	
	

	


}




