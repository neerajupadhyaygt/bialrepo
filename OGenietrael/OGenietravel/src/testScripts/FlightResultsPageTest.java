package testScripts;

import org.testng.annotations.Test;

import pageObjects.FlightResultsPageObjects;

public class FlightResultsPageTest extends FlightResultsPageObjects{

	 @Test
		public  void Validatingdefaultflightdetailsbooksearch() {
		
  
   driverInitialization();
   HomePageTest homepage = new HomePageTest();
   homepage.formpagesearch(); 
   FlightResultsPageTest bookpage = new FlightResultsPageTest();
   bookpage.bookflights();
	}

}
