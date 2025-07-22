package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Abstract.AbstractMethods;

public class SignUpPage extends AbstractMethods {

	WebDriver driver;

	public SignUpPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);//Initialization:
	}

	@FindBy (xpath = "//input[@type = 'email']")
	WebElement email_Textbox;

	@FindBy (xpath = "//input[@type = 'password']")
	WebElement password_Textbox;

	@FindBy (xpath = "//a[normalize-space() = 'Sign up']")
	WebElement signUp_Button;
	
	@FindBy (xpath = "(//auto-check/div/p)[1]")
	WebElement email_ErrorMessage;
	
//	@FindBy (xpath = "//a[normalize-space() = 'Sign in →']")
//	WebElement SignIn;
	
	By SignIn = By.xpath("//a[normalize-space() = 'Sign in →']");
	
	



	public void processSignUp(String email, String password) {
		//	
		email_Textbox.sendKeys(email);
		password_Textbox.sendKeys(password);


	}
	
	public String email_ErrorMessage() {
		//	
		String errorMessage = getText(email_ErrorMessage);
		return errorMessage;
		
	}
	
	
	public SignInPage clickSignIn() {
		
		clickButton(SignIn);
		return new SignInPage(driver);
	}
	
	
	
	
	
	public void dummy() {
		//	
	System.out.println("dummy");


	}




}
