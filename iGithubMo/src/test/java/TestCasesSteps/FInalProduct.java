package TestCasesSteps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import PageObject.SignInPage;
import PageObject.SignUpPage;
import Abstract.AbstractMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FInalProduct{


	@Test
	public void GitHub() {



		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		


	//Automate Steps Area:
		
		//Landing Page Check Product Footer:
		LandingPage landingPage = new LandingPage(driver);
		landingPage.gotoWebsite();
		landingPage.getProductFooterText(); 
		
		
		//Sign-Up page area:
		SignUpPage signuppage = landingPage.clickSignUp(); 
		signuppage.processSignUp("Scott","Pass123456");
		Assert.assertEquals(signuppage.email_ErrorMessage(),"Email is invalid or already taken"); //Verify Error Message:
		
		//Sign-In Page:
		SignInPage signInPage = signuppage.clickSignIn();
		signInPage.processLogInCredential("Scott","Pass123456");
		Assert.assertEquals(signInPage.verifyIncorrectCredential(),"Incorrect username or password."); //Verify Error Message:
		
//		driver.quit();
	
	}
}




//	public void Calculator() {
//		
//		int a;
//		
//		PS1 PS1 = new PS1(2);
//		
//		
//		
//		System.out.println(PS1.increment());
//		
//		System.out.println(PS1.multiply());
//		
//		
//		
//	}




//	@Test
//	public void openWebsite() {
//
//		System.out.println("Hello");
//	}
//	
//	@Test
//	public void secondTest() {
//
//		System.out.println("Hello");
//	}
//	
//	@BeforeTest
//	public void secondTest1() {
//
//		System.out.println("Hello");
//	}
//	
//	
//	@BeforeSuite
//	public void secondTest2() {
//
//		System.out.println("Hello");
//	}
//	
//	@BeforeMethod
//	public void secondTest3() {
//
//		System.out.println("Hello");
//	}
//	
//	@BeforeClass
//	public void secondTest4() {
//
//		System.out.println("Hello");
//	}






