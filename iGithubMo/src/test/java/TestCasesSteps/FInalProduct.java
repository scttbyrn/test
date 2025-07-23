package TestCasesSteps;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

import PageObject.LandingPage;
import PageObject.SignInPage;
import PageObject.SignUpPage;
import TestComponents.Base;

public class FInalProduct extends Base{


	@Test (dataProvider="dataProvider")
	public void GitHub(HashMap<String,String> input) throws IOException{

		//Sign-Up page area:
		SignUpPage signuppage = landingpage.clickSignUp(); 
		signuppage.processSignUp(input.get("email"), input.get("password"));
		Assert.assertEquals(signuppage.email_ErrorMessage(),"Email is invalid or already taken"); //Verify Error Message:
		
		//Sign-In Page:
		SignInPage signInPage = signuppage.clickSignIn();
		signInPage.processLogInCredential(input.get("email"), input.get("password"));
		Assert.assertEquals(signInPage.verifyIncorrectCredential(),"Incorrect username or password."); //Verify Error Message:
		
	}
	
	
	@DataProvider
	public Object[][] dataProvider() throws IOException {
//		List<HashMap<String,String>> data = List<HashMap<String, String>> jsonHashMap(System.getProperty("user.dir")+"\\src\\test\\java\\dataProvider\\dataProvider.json");
		List<HashMap<String,String>> data = jsonHashMap(System.getProperty("user.dir")+"\\src\\test\\java\\dataProvider\\dataProvider.json");
		return new Object [] [] { {data.get(0)},{data.get(1)} };
	}
	
}



//WebDriverManager.chromedriver().setup();
//WebDriver driver = new ChromeDriver();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//driver.manage().window().maximize();



//Automate Steps Area:

////Landing Page Check Product Footer:
//LandingPage landingpage = new LandingPage(driver);
//landingpage.gotoWebsite();
//landingpage.getProductFooterText(); 



//Landing Page Check Product Footer:
//launchApplication();
//landingpage.gotoWebsite();

//Landing Page Check Product Footer:




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






