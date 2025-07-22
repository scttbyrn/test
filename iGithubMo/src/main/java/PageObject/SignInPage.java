package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Abstract.AbstractMethods;

public class SignInPage extends AbstractMethods {
	
	WebDriver driver;
	
	public SignInPage(WebDriver driver) {
		super(driver);
		this.driver = driver;

		PageFactory.initElements(driver,this);//Initialization:
	}
	
	@FindBy (xpath = "//input[@name = 'login']")
	WebElement login;
	
	@FindBy (xpath = "//input[@name = 'password']")
	WebElement password;
	
	@FindBy (xpath = "//input[@name = 'commit']")
	WebElement SignInButton;
	
	@FindBy (xpath = "//div[@class = 'js-flash-alert']")
	WebElement incorrectMessage;
	
	
	
	
	public void processLogInCredential(String uname, String pword) {
		
		login.sendKeys(uname);
		password.sendKeys(pword);
		SignInButton.click();
		
	}
	
	public String verifyIncorrectCredential() {
		
		String errormsg = getText(incorrectMessage);
		
		return errormsg;
	}
	
	
	
	
	
	

	
	
	
	
	
	

}
