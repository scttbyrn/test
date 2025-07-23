package TestCasesSteps;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestComponents.Base;

public class TC01_LandingPage extends Base {
	
	@Test 
	public void verifyFooterText() {

		landingpage.getProductFooterText(); 
	}
	
	
	
	

}
