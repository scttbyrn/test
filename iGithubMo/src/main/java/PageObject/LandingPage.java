package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Abstract.AbstractMethods;

public class LandingPage extends AbstractMethods {

	//	WebDriver driver = new ChromeDriver();
	WebDriver driver;

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;

		PageFactory.initElements(driver,this);//Initialization:
	}


	//Page Factory:
	//	@FindBy (xpath = "//a[normalize-space() = 'Sign up']")
	//	WebElement signUp_Button;

	By FooterProductList = By.xpath("//ul[@class = 'list-style-none color-fg-muted f5']/li");
	By signupButton = By.xpath("//a[normalize-space() = 'Sign up']");



	public SignUpPage clickSignUp() {
		//		driver.findElement(By.xpath("//a[normalize-space() = 'Sign up']")).click();  //can use without constructor:
		//		signUp_Button.click();  //setup for page factory:

		clickButton(signupButton); //reusable methods for clicking buttons


		return new SignUpPage(driver);

	}

	public void getProductFooterText() {
		getLinkDetails(FooterProductList);


	}

	public void gotoWebsite() {


		inputURL("https://github.com/");

	}






}
