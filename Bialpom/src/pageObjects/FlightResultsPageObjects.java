package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import libraries.Utillities;

public class FlightResultsPageObjects extends Utillities {

	@FindBy(id="fare id")
    WebElement bookflight;
	
	
	@FindBy(xpath="//button[@class='sc-gEvEer fteAEG ms-2 btn Flight-btn-purple Flight-sm-btn Flight-font16 rounded-pill']")
    WebElement roundbookflight;
	
	@FindBy(xpath="//button[@class='sc-gEvEer fteAEG ms-md-2 mt-1 mt-md-0 btn Flight-btn Flight-btn-purple Flight-phn-book-btn rounded-pill Flight-font-semibold']")
    WebElement internationalroundbookflight;
	
	@FindBy(xpath="//div[@class='mt-3 card-title h5']")	
	WebElement flightnotfound;
	
	
	
	// constructor
		public FlightResultsPageObjects() {
			super();
			PageFactory.initElements(driver, this);
		}

		// actions
		public void bookflights() {
			bookflight.click();
		}
		
		
		public void roundbookflights() {
			roundbookflight.click();
		}
		public void internationalroundflightbook() {
			internationalroundbookflight.click();
		}
		public void flightnotfound() {
			flightnotfound.click();
		}
		
}
