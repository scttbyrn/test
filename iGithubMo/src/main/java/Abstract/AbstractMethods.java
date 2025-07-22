package Abstract;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;



//In this class where we can put all reusable methods for every page object class (ex. WebDriverWait()) , Generic Utilities:

public class AbstractMethods { //Constructor:

	WebDriver driver;

	public AbstractMethods(WebDriver driver) {

		this.driver = driver;
	}


	public void inputURL(String url) {

		driver.get(url);
	}


	public void clickButton (By find_By) { // reusable click buttons:

		driver.findElement(find_By).click(); 

	}

	public  void getLinkDetails(By find_By) {

		List<WebElement> linkDetails = driver.findElements(find_By);

		for(WebElement ele : linkDetails) {

			String textLink = ele.getText();
			System.out.println(textLink);
		}


	}


	public String getText(WebElement ele) {

		String getText = ele.getText();
		System.out.println(getText);

		return getText;

	}





}

