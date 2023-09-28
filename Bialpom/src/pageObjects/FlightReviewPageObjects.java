package pageObjects;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import libraries.Utillities;

public class FlightReviewPageObjects extends Utillities{

	@FindBy(id="travller-lastname100")
    WebElement firstname;
	
	@FindBy(id="travller-lastname 100")
    WebElement travellerlastname;
	
	@FindBy(id="travller-lastname101")
    WebElement firstname1;
	
	@FindBy(id="travller-lastname 101")
    WebElement travellerlastname1;
	
	@FindBy(id="travller-lastname200")
    WebElement childfirstname;
	
	@FindBy(id="travller-lastname 200")
    WebElement childlastname;
	
	@FindBy(id="travller-lastname300")
    WebElement infantfirstname;
	
	@FindBy(id="travller-lastname 300")
    WebElement infantlastname;
	
	@FindBy(id="travller-dob300")
    WebElement infantdob;
	
	@FindBy(xpath="//div[contains(@class, 'react-datepicker__day') and @aria-label='Choose Tuesday, August 1st, 2023']")
	WebElement infantclickdob;

	@FindBy(id="travller-dob100")
    WebElement travellerdob;
	
	@FindBy(xpath="//div[contains(@class, 'react-datepicker__day') and @aria-label='Choose Tuesday, August 2nd, 2011']")
	WebElement clickdob;
	
	@FindBy(xpath="//div[contains(@class, 'react-datepicker__day') and @aria-label='Choose Thursday, August 1st, 1963']")
	WebElement clickdobSC;
	
	@FindBy(xpath="//input[@placeholder='Passport Number *']")
	WebElement clickpassport;
	
	@FindBy(id="passportdate")
	WebElement clickissuepassportdate;
	
	@FindBy(xpath="//div[contains(@class, 'react-datepicker__day') and @aria-label='Choose Tuesday, August 1st, 2023']")
	WebElement PPissuedate;
	
	@FindBy(xpath="//input[@placeholder='Expiry Date * ']")
	WebElement clickexpirepassportdate;
	
	@FindBy(xpath="//div[contains(@class, 'react-datepicker__day') and @aria-label='Choose Thursday, September 28th, 2023']")
	WebElement PPexpiredate;
	
	@FindBy(id="exampleForm.SelectCustom")
	WebElement nationality;
	
	@FindBy(xpath="//button[@name='Select Seats']")
	WebElement seat;
	
	@FindBy(xpath="//td[@class='p-2'][1]")
	WebElement choiceseat;
	
	@FindBy(xpath="//button[@name='Select Meals']")
	WebElement addmeals;
	
	@FindBy(xpath="//button[@class='sc-gEvEer fteAEG btn quantity-right-plus border-0']")
	WebElement choicemeal;
	
	@FindBy(xpath="//button[@name='Select Baggage']")
	WebElement luggage;

	@FindBy(xpath="//button[@class='sc-gEvEer fteAEG btn quantity-right-plus border-0']")
	WebElement choiceluggage;
	
	@FindBy(xpath="//button[@class='sc-gEvEer fteAEG btn Flight-btn-purple Flight-sm-btn Flight-font14']")
	WebElement addondone;
	
	@FindBy(id="emailadd")
    WebElement emailid;

	@FindBy(xpath="//input[@placeholder='Phone Number*']")
	WebElement phoneno;		
	
	
	@FindBy(xpath="//input[@id='test']")
	WebElement gstcheckbox;
	
	@FindBy(id="gstnumber")
	WebElement gstno;
	
	@FindBy(id="companyemail")
	WebElement compemail;
	
	@FindBy(id="phonenumber")
	WebElement gstphoneno;
	
	@FindBy(id="companyname")
	WebElement compname;
	
	@FindBy(id="companyaddress")
	WebElement compadd;
	
	@FindBy(xpath="//button[@class='sc-gEvEer fteAEG btn btn-lg btn-block Flight-btn-purple Flight-btn-gradient w-100 rounded-pill']")
	WebElement makepaymentbutton;	
	
	@FindBy(xpath="//button[@class='sc-gEvEer fteAEG btn btn-lg btn-block Flight-btn-gradient Flight-btn-purple rounded-pill mx-2']")
	WebElement directbutton;
	
	@FindBy(xpath="//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")
	WebElement bookingfailbutton;
	
	// Ticket page
	
	@FindBy(xpath="//button[@class='btn Flight-btn rounded-pill Flight-btn-purple Flight-font14 border-0 btn btn-light']")
	WebElement ticketviewbooking;
	
	@FindBy(xpath="//button[@class='btn rounded-pill Flight-search-flight-btn Flight-font20 text-white  border-0 is-search-btn btn btn-light']")
	WebElement tickethomepage;
	
	// Orderlist page
	
	@FindBy(xpath="//button[@class='sc-gEvEer fteAEG Flight-btn my-2 btn w-50 Flight-btn-purple Flight-font13 Flight-font-bold'][1]")
	WebElement cancelbutton;
	
	@FindBy(xpath="//button[@class='sc-gEvEer fteAEG Flight-btn my-2 btn w-50 Flight-btn-purple Flight-font13 Flight-font-bold'][2]")
	WebElement reschedulebutton;
	
	@FindBy(xpath="//button[@class='sc-gEvEer fteAEG Flight-btn-purple btn Flight-font13 me-2 Flight-font-semibold']")
	WebElement cancelfullbooking;
	
	@FindBy(xpath="//button[@class='sc-gEvEer fteAEG Flight-btn-purple btn Flight-font13 Flight-font-semibold rounded-pill']")
	WebElement continuereschedule;
	
	@FindBy(xpath="//input[@id='reschedule-checkbox']")
	WebElement reschedulecheckbox;
	
	@FindBy(xpath="//input[@name='departdate' and @placeholder='Please select the preferred date']")
	WebElement rescheduledateopen;
	
	@FindBy(xpath="//div[contains(@class, 'react-datepicker__day') and @aria-label='Choose Thursday, August 31st, 2023']")
	WebElement rescheduledate;
	
	@FindBy(xpath="//button[@class='sc-gEvEer fteAEG Flight-btn-purple btn Flight-font13 Flight-font-semibold']")
	WebElement submitreschedulebutton;
	
	@FindBy(className="modal-dialog")
	WebElement modaldialougknowledge;
	
	@FindBy(xpath=".//div[@class='Flight-font16 Flight-font-bold modal-title h4']")
	WebElement modalheaderknowledge;
	
	@FindBy(xpath="//button[@class='sc-gEvEer fteAEG Flight-btn-purple btn Flight-font13 Flight-font-semibold rounded-pill']")
	WebElement modalacceptbutton;
	
	@FindBy(id="status-button")
	WebElement viewdetailsbutton;
	
	@FindBy(id="travller-di100")
	WebElement studentidno;
	
	// constructor
			public FlightReviewPageObjects() {
				super();
				PageFactory.initElements(driver, this);
			}

			// actions
			public void travellerfirstname(String fname) throws InterruptedException {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", firstname);
				//firstname.click();
				firstname.sendKeys(fname);
				Thread.sleep(2000);
				firstname.sendKeys(Keys.ENTER);
				
			}
			public void lastname(String lname) throws InterruptedException {
				
				travellerlastname.click();
				travellerlastname.sendKeys(lname);
				travellerlastname.sendKeys(Keys.ENTER);
	}
		    public void firstname1(String fname) throws InterruptedException {
				
				firstname1.click();
				firstname1.sendKeys(fname);
				firstname1.sendKeys(Keys.ENTER);
	}
		    
			 public void lastname1(String lname) throws InterruptedException {
					
					travellerlastname1.click();
					travellerlastname1.sendKeys(lname);
					travellerlastname1.sendKeys(Keys.ENTER);
		}
		   
					
					public void dob() {
						travellerdob.click();
						}
					
					public void dobclick() {
						clickdob.click();
						}
			
       public void childfirstname(String fname) throws InterruptedException {
    	   JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", childfirstname);
			//	childfirstname.click();
				childfirstname.sendKeys(fname);
				childfirstname.sendKeys(Keys.ENTER);
	}
       public void childlastname(String lname) throws InterruptedException {
			
			childlastname.click();
			childlastname.sendKeys(lname);
			childlastname.sendKeys(Keys.ENTER);
}
       
       public void infantfirstname(String fname) throws InterruptedException {
    	   JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", infantfirstname);
    	  // infantfirstname.click();
    	   infantfirstname.sendKeys(fname);
    	   infantfirstname.sendKeys(Keys.ENTER);
}

       public void infantlastname(String lname) throws InterruptedException {
			
    	     infantlastname.click();
			infantlastname.sendKeys(lname);
			infantlastname.sendKeys(Keys.ENTER);
}
       
       public void infantdob() {
			infantdob.click();
			}
		
		public void infantdobclick() {
			infantclickdob.click();
			}
			
		public void seniorcitizendobclick() {
			clickdobSC.click();
			}
			public void validpassport(String passport) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", clickpassport);
				//clickpassport.click();
				clickpassport.sendKeys(passport);
				clickpassport.sendKeys(Keys.ENTER);
			}
			
//			public void validissuepassport(String issuepassport) {
//				JavascriptExecutor js = (JavascriptExecutor) driver;
//				js.executeScript("arguments[0].click();", clickissuepassportdate);
//			//	clickissuepassportdate.click();
//				clickissuepassportdate.sendKeys(issuepassport);
//				clickissuepassportdate.sendKeys(Keys.ENTER);
//			}
			
			public void validissuepassport() {
			
				clickissuepassportdate.click();
			}
			
			public void Passportissuedate (){
				
				PPissuedate.click();
			}
			
           public void Passportexpiredate (){
				
				PPexpiredate.click();
			}

//			public void validexpirepassport(String expirepassport) {
//				JavascriptExecutor js = (JavascriptExecutor) driver;
//				js.executeScript("arguments[0].click();", clickexpirepassportdate);
//				clickexpirepassportdate.sendKeys(expirepassport);
//				clickexpirepassportdate.sendKeys(Keys.ENTER);
//			}
			
       	public void validexpirepassport() {
			
			clickexpirepassportdate.click();
		}
       	
			public void nationality(String country) {
				nationality.click();
				nationality.sendKeys(country);
				nationality.sendKeys(Keys.ENTER);
				}
			
			public void selectseat() {
			seat.click();
			}
			
			public void choiceseat() {
			choiceseat.click();	
				}
			
			public void addmeals() {
				addmeals.click();
				}
			
			public void choicemeals() {
				choicemeal.click();	
					}
			
			 
				public void selectluggage() {
				luggage.click();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
				}
			
			public void choiceluggage() {
				choiceluggage.click();	
					}
			
			public void addondone() {
				addondone.click();
				
			}
			 
			
			public void validemailid(String email) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", emailid);
			//	emailid.click();
				emailid.sendKeys(email);
				emailid.sendKeys(Keys.ENTER);
			}
			
			public void validphoneno(String no) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", phoneno);
				//phoneno.click();
				phoneno.sendKeys(no);
				phoneno.sendKeys(Keys.ENTER);
			}
			
			public void GSTcheckboxclick() {	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", gstcheckbox);
			
				}
			
			public void gstnumber(String validgst) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", gstno);
			//	gstno.click();
				gstno.sendKeys(validgst);
				gstno.sendKeys(Keys.ENTER);
			}
			
			public void companyemailid(String validemail) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", compemail);
		//  	compemail.click();
				compemail.sendKeys(validemail);
				compemail.sendKeys(Keys.ENTER);
			}
			
			public void companyphone(String no) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", gstphoneno);
			  //  gstphoneno.click();
			    gstphoneno.sendKeys(no);
			    gstphoneno.sendKeys(Keys.ENTER);
			}
			
			
//			public void companyphone(String number) {
//			    gstphoneno.click();
//			    gstphoneno.sendKeys(number);
//			    gstphoneno.sendKeys(Keys.ENTER);
//			}
			public void companyname(String validname) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", compname);
				//compname.click();
				compname.sendKeys(validname);
				compname.sendKeys(Keys.ENTER);
			}
			public void companyaddress(String validaddress) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", compadd);
		//		compadd.click();
				compadd.sendKeys(validaddress);
				compadd.sendKeys(Keys.ENTER);
			}
			
			
			public void paymentbutton() {
				makepaymentbutton.click();
			}
			public void DirectButton() { JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", directbutton);
				
			}
			public void Bookingfaildonebutton() {
				bookingfailbutton.click();
			}
			
			// ticket page
			
			public void ViewBooking()  {JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", ticketviewbooking);
				}
			
			public void TicketHomePage() {JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", tickethomepage);
			}
			
			//orderlist Page
			
			public void CancelBooking() {
				cancelbutton.click();
			}
			
			public void RescheduleBooking() {
				reschedulebutton.click();
			}
			
			public void CancelFullBooking() { JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", cancelfullbooking);
		//		cancelfullbooking.click();
			}
			
			public void RescheduleContinue() {
				continuereschedule.click();
			}
			
			public void RescheduleCheckBox() { JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", reschedulecheckbox);
				reschedulecheckbox.click();
			}
			
			public void RescheduleDateOpen() {
				rescheduledateopen.click();
			}

			public void RescheduleDateClick() {
				rescheduledate.click();
			}
			
			public void RescheduleSubmitClick() {
				submitreschedulebutton.click();
			}
			
			public void Viewdetailsclick() {
				viewdetailsbutton.click();
			}
			
			public void StudentIdno(String studentid) {
				studentidno.click();
				studentidno.sendKeys(studentid);
				studentidno.sendKeys(Keys.ENTER);
			}
			

}
