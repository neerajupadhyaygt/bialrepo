package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import libraries.BaseTestDriver;
import pageObjects.HomePageObjects;



public class HomePageTest extends HomePageObjects {
	
	 @Test
		public  void Validatingdefaultflightdetailsbooksearch() {
		
     
      driverInitialization();
      HomePageTest homepage = new HomePageTest();
      homepage.formpagesearch(); 
	}

}
