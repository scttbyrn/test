package steps;


import java.util.List;
import java.util.Map;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Page.Objects.Common_Functions;
import Page.Objects.LandingPage;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import steps.ShoppingCartGlueSteps;


public class TestOnly{


	//	public static String web;
	public static LandingPage land = new LandingPage();
	public static Common_Functions common = new Common_Functions();
	//	public static WebDriver driver = new ChromeDriver();
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {



		//		//debugger:
				//		
		//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sbEscueta\\Documents\\Scott_Chrome_TestOnly");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "localhost:58023");
		WebDriver driver = new ChromeDriver(options);
		
//		driver.findElement(By.xpath("//a[normalize-space() = 'Log in']")).click();
//		driver.findElement(By.xpath("//input [@id = 'Email']")).sendKeys("toscascott@tosca.com");
//		driver.findElement(By.xpath("//input [@id = 'Password']")).sendKeys("Tosca@12345");
//		driver.findElement(By.xpath("//input [@value = 'Log in']")).click();




//		////				//As Map for trace dubbugerAddress:
//						WebDriverManager.chromedriver().setup();
//						ChromeDriver chromedriver = new ChromeDriver();
//				//		WebDriver webDriver = new ChromeDriver();
//						Capabilities cap = chromedriver.getCapabilities();
//						Map<String, Object> myCap = cap.asMap();
//						System.out.println(myCap);
//						chromedriver.get("https://demowebshop.tricentis.com/");
//		






		//---------------------------------------| Debugging Area: |---------------------------------------------------------------------------------------------------------------------//
		//		

		//		driver.findElement(By.xpath("//a[text() = 'Log in']")).click();
		//		driver.findElement(By.xpath("//span [normalize-space() = 'Shopping cart']")).click();
		//		
		//		driver.findElement(By.xpath("//a[normalize-space() = 'Log in']")).click();
		//		driver.findElement(By.xpath("//input [@id = 'Email']")).sendKeys("toscascott@tosca.com");
		//		driver.findElement(By.xpath("//input [@id = 'Password']")).sendKeys("Tosca@12345");

		//		driver.findElement(By.xpath("(//a[normalize-space() = 'Books'])[3]")).click();
		//		
		//		WebElement web = driver.findElement(By.xpath("//input[@id = 'add-to-cart-button-13']"));
		//		 web.click();

		//		driver.findElement(By.xpath("//span [normalize-space() = 'Shopping cart']")).click();


		//		WebElement dropdownCountry = driver.findElement(By.id("CountryId")); //Country:
		//		Select selectObjectCountry = new Select(dropdownCountry);
		//		selectObjectCountry.selectByVisibleText("United States");
		//		
		//		WebElement dropdownStateProvince = driver.findElement(By.id("StateProvinceId"));//Province:
		//		Select selectObjectProvince = new Select(dropdownStateProvince);
		//		selectObjectProvince.selectByVisibleText("Hawaii");


		//		System.out.println(a);



		//		TC01_ShoppingCart test01 = new TC01_ShoppingCart();
		//		
		//		test01.click_books_in_categories();

		//		driver.findElement(By.xpath("//input [@id = 'add-to-cart-button-13']")).click();


//----------------------------------------| Constraint Functions |--------------------------------------/
//		
//		List<WebElement>shopCartTable = driver.findElements(By.xpath("//table[@class = 'cart']/tbody/tr/td/a[@class = 'product-name']"));
//		System.out.println("Table Count: " +shopCartTable.size());
//
//		for(WebElement ele:shopCartTable) {
//
//			String value = ele.getText();
//			String product = "Black & White Diamond Heart";
//			
//			System.out.println("Get Value: " +value); //captured value
//
//			if(value.equals(product)) {
//				
//				System.out.println("Loop Value: " +value);
//				WebElement remove = driver.findElement(By.xpath("//td[normalize-space() = '"+product+"']/../td[normalize-space() = 'Remove:']")); //Constraint:
//				remove.click();
//				
//				break;
//			}
//
//
//
//		}

//---------------------------------------| |---------------------------------------------------/
		
//		driver.findElement(By.xpath("//input [@id = 'termsofservice']")).click();
//	
//		driver.findElement(By.xpath("//button [@id = 'checkout']")).click();
//		
//		for (int i=1; i<=5; i++) { //for address:
//			
//			driver.findElement(By.xpath("(//input[@value= 'Continue'])["+i+"]")).click();
//			Thread.sleep(3000);
//			
		
//		}
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scroll(0,1000)");
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//input [@value = 'Confirm']")).click();
//		
//////		driver.findElement(By.xpath("//input[@title = 'Continue']")).click();
//		
//		driver.findElement(By.xpath("//a[normalize-space() = 'Click here for order details.']")).click();
		
		
		
		
//		driver.findElement(By.xpath("//div[@class = 'column information']")).click();
//		
//		
//		driver.findElements(By.xpath("//div[@class = 'column information']/ul/li"));
		
		
		
		



		}

	}
