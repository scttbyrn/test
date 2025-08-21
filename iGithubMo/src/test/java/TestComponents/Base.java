package TestComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import PageObject.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;




public class Base { //In this class where can put all of the global steps can be executed thru all the test cases:

	public WebDriver driver;
	public LandingPage landingpage;

	public WebDriver initializeDriver() throws IOException {

		// properties class:
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\GlobalData.properties");
		prop.load(fis);

		String browserName = prop.getProperty("browser");
//		String browserName = System.getProperty("browser")!=null ? System.getProperty("browser") :prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}
		
		else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\sbEscueta\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
			

		}
		

		
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//		
		return driver;

	}

	@BeforeMethod (alwaysRun = true) //it will run before methods
	public LandingPage launchApplication() throws IOException{

		driver = initializeDriver();
		landingpage = new LandingPage(driver);
		landingpage.gotoWebsite();
		return landingpage;

	}

	@AfterMethod (alwaysRun = true) //it will run after methods
	public void tearDown() {

		driver.quit();


	}


	public List<HashMap<String, String>> jsonHashMap(String filepath) throws IOException {

		//read json to string
		String jsonContent = FileUtils.readFileToString(new File(filepath),StandardCharsets.UTF_8);

		//String to Jackson Databind

		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {});
		return data;


	}
	
	
	public String getScreenshot(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
		
		
	}



}

