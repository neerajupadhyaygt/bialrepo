package testScripts;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.FlightReviewPageObjects;

public class FlightReviewBookPageTest extends FlightReviewPageObjects {

	@BeforeMethod
	public  void Setup() {
		
		driverInitialization();
		
	}
	
	@Test
	public void Validatingdefaultflightdetailsbooksearch() throws InterruptedException {

		HomePageTest homepage = new HomePageTest();
		homepage.departurecityopen("Mumbai");
		homepage.arrivalcityopen("Delhi");
//		homepage.clickonwarddate();
//		homepage.enteronwarddate();	
		homepage.formpagesearch();
		Thread.sleep(3000);
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		resultpage.bookflights();
		FlightReviewBookPageTest reviewpage = new FlightReviewBookPageTest();
		reviewpage.travellerfirstname("TestDAyjhAAD");
		reviewpage.lastname("TestFFghdfgfRF");
		reviewpage.validemailid("neeraj.u@genietalk.ai");
		reviewpage.validphoneno("7987004870");
		// detailspage.paymentbutton();
		reviewpage.DirectButton();
		if (driver.findElements(By.xpath(
				"//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']"))
				.size() > 0) {
			// Flight not found
			reviewpage.Bookingfaildonebutton();
			driver.quit(); // Booking fail
			return; 
		}
		reviewpage.ViewBooking();
		reviewpage.Viewdetailsclick();


	}
	
	@Test
	public void Validatingdefaultflightdetailsbooksearchwithgst() throws InterruptedException {

		HomePageTest homepage = new HomePageTest();
		
		homepage.clickonwarddate();
		homepage.enteronwarddate();	
		homepage.formpagesearch();
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		resultpage.bookflights();
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();	
		detailspage.travellerfirstname("TestWWFRW");
		detailspage.lastname("TestEFDEE");
		detailspage.validemailid("test789@gmail.com");
		detailspage.validphoneno("6634567890");
		detailspage.GSTcheckboxclick();
		detailspage.gstnumber("07AABCU9603R1ZP");
		detailspage.companyemailid("testnn@gmail.com");
		detailspage.companyphone("6788955440");
		detailspage.companyname("GTalk");
		detailspage.companyaddress("IndoreB");
		// detailspage.paymentbutton();
		detailspage.DirectButton();
		Thread.sleep(3000);
		if (driver.findElements(By.xpath(
				"//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']"))
				.size() > 0) Thread.sleep(3000); {
			// Flight not found
			detailspage.Bookingfaildonebutton();
			driver.quit(); // Booking fail
			return;
		}
	//			detailspage.ViewBooking();
	//			detailspage.Viewdetailsclick();	
	}
				
	
	@Test
	public void Validatingdefaultflightdetailsbooksearchgstwithviewdetails() throws InterruptedException {

		HomePageTest homepage = new HomePageTest();
		
		homepage.clickonwarddate();
		homepage.enteronwarddate();	
		homepage.formpagesearch();
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		resultpage.bookflights();
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		detailspage.travellerfirstname("TestVAgDD");
		detailspage.lastname("TestAFgA");
		detailspage.validemailid("test123@gmail.com");
		detailspage.validphoneno("9934567890");
		detailspage.GSTcheckboxclick();
		detailspage.gstnumber("04AABCU9603R1ZV");
		detailspage.companyemailid("testhg@gmail.com");
		detailspage.companyphone("12345678890");
		detailspage.companyname("GTai");
		detailspage.companyaddress("IndoreA");
		// detailspage.paymentbutton();
		detailspage.DirectButton();
		
		if (driver.findElements(By.xpath(
				"//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']"))
				.size() > 0) {
			// Flight not found
			detailspage.Bookingfaildonebutton();
			driver.quit(); // Booking fail
			return;
		}
		detailspage.ViewBooking();
		detailspage.Viewdetailsclick();


	}
	
	@Test
	public void Validatingdefaultflightdetailsbooksearchwithbackhomepage() throws InterruptedException {

		HomePageTest homepage = new HomePageTest();
		homepage.clickonwarddate();
		homepage.enteronwarddate();	
		homepage.formpagesearch();
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		resultpage.bookflights();
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		detailspage.travellerfirstname("TestFD");
		detailspage.lastname("TestFC");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
		// detailspage.paymentbutton();
		detailspage.DirectButton();
		if (driver.findElements(By.xpath(
				"//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']"))
				.size() > 0) {
			// Flight not found
			detailspage.Bookingfaildonebutton();
			driver.quit(); // Booking fail
			return;
		}
		
        detailspage.TicketHomePage();

	}

	@Test
	public void ValidatingdefaultflightdetailsbooksearchwithCancellation() throws InterruptedException {

		HomePageTest homepage = new HomePageTest();
		homepage.departurecityopen("Mumbai");
		//homepage.arrivalcityopen("");	
		homepage.clickonwarddate();
		homepage.enteronwarddate();	
		homepage.formpagesearch();
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		resultpage.bookflights();
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		detailspage.travellerfirstname("TestCgR");
		detailspage.lastname("TestSJgF");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
		// detailspage.paymentbutton();
		detailspage.DirectButton();
		
//		  try {
//	            // Switch to the alert and get its text
//	            Alert alert = driver.switchTo().alert();
//	            System.out.println("Your request is being submitted: " + alert.getText()); // Print Alert popup
//
//	            // Close the alert by clicking 'OK'
//	            alert.accept();
//
//	            // After handling the alert, quit the driver
//	            driver.quit();
//	            
//		  }
//	            
//	            catch (Exception e) {
//	                // If no alert is found, this block will be executed
//	                System.out.println("No alert found. Proceeding to the next step.");
		
		if (driver.findElements(By.xpath(
				"//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']"))
				.size() > 0) {
			// Flight not found
			detailspage.Bookingfaildonebutton();
			driver.quit(); // Booking fail
			return;
		}
		detailspage.ViewBooking();
	    detailspage.Viewdetailsclick();
		// Cancellation
			detailspage.CancelBooking();
	        detailspage.CancelFullBooking();
	        
	            

//		// Reschedule
//		detailspage.RescheduleBooking();
//		// driver.findElement(By.className("modal-dialog"));
//		WebElement modalContainer = driver.findElement(By.className("modal-dialog"));
//		WebElement modalContentheader = modalContainer
//				.findElement(By.xpath(".//div[@class='Flight-font16 Flight-font-bold modal-title h4']"));
//		Assert.assertEquals(modalContentheader.getText(), "Change flight(s) date/time",
//				"Verify the modal body message");
//		WebElement modalAcceptButton = modalContainer.findElement(By.xpath(
//				"//button[@class='sc-gEvEer fteAEG Flight-btn-purple btn Flight-font13 Flight-font-semibold rounded-pill']"));
//		modalAcceptButton.click();
//
//		detailspage.RescheduleCheckBox();
//		detailspage.RescheduleDateOpen();
//		detailspage.RescheduleDateClick();
//		detailspage.RescheduleSubmitClick();
////		org.openqa.selenium.Alert al = driver.switchTo().alert();
////		// click on OK to accept with accept()
////		al.accept();
//		 Thread.sleep(4000);
//		Alert alert = driver.switchTo().alert();
//		System.out.println("your request is been submitted:"+alert.getText()); //Print Alert popup
//		alert.accept(); //Close Alert popup
	}
	
	@Test
	public void ValidatingdefaultflightdetailsbooksearchwithReschedule() throws InterruptedException {

		HomePageTest homepage = new HomePageTest();
	//	homepage.departurecityopen("Mumbai");
		//homepage.arrivalcityopen("");	
		homepage.clickonwarddate();
		homepage.enteronwarddate();	
		homepage.formpagesearch();
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		resultpage.bookflights();
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		detailspage.travellerfirstname("TestVggfdUU");
		detailspage.lastname("TestFCUfggggf");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
		// detailspage.paymentbutton();
		detailspage.DirectButton();
		
//		  try {
//	            // Switch to the alert and get its text
//	            Alert alert = driver.switchTo().alert();
//	            System.out.println("Your request is being submitted: " + alert.getText()); // Print Alert popup
//
//	            // Close the alert by clicking 'OK'
//	            alert.accept();
//
//	            // After handling the alert, quit the driver
//	            driver.quit();
//	            
//		  }
//	            
//	            catch (Exception e) {
//	                // If no alert is found, this block will be executed
//	                System.out.println("No alert found. Proceeding to the next step.");
		
		if (driver.findElements(By.xpath(
				"//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']"))
				.size() > 0) {
			// Flight not found
			detailspage.Bookingfaildonebutton();
			driver.quit(); // Booking fail
			return;
		}
		detailspage.ViewBooking();
      detailspage.Viewdetailsclick();
		// Cancellation
//			detailspage.CancelBooking();
//	        detailspage.CancelFullBooking();
	        
	            

		// Reschedule
		detailspage.RescheduleBooking();
		// driver.findElement(By.className("modal-dialog"));
		WebElement modalContainer = driver.findElement(By.className("modal-content"));
		WebElement modalContentheader = modalContainer
				.findElement(By.xpath(".//div[@class='Flight-font16 Flight-font-bold modal-title h4']"));
		Assert.assertEquals(modalContentheader.getText(), "Change flight(s) date/time",
				"Verify the modal body message");
//		WebElement modalAcceptButton = modalContainer.findElement(By.xpath(
//				"//button[@class='sc-gEvEer fteAEG Flight-btn-purple btn Flight-font13 Flight-font-semibold rounded-pill']"));
//		modalAcceptButton.click();

	//	detailspage.RescheduleCheckBox();
		detailspage.RescheduleDateOpen();
		detailspage.RescheduleDateClick();
		detailspage.RescheduleSubmitClick();
//		org.openqa.selenium.Alert al = driver.switchTo().alert();
//		// click on OK to accept with accept()
//		al.accept();
		 Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		System.out.println("your request is been submitted:"+alert.getText()); //Print Alert popup
		alert.accept(); //Close Alert popup
	}
	@Test
	public void Validatingdefaultflightdetailsbooksearchwithseatmealandluggage() throws InterruptedException {

		HomePageTest homepage = new HomePageTest();	
		homepage.formpagesearch();	
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		resultpage.bookflights();
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		detailspage.travellerfirstname("TestVSR");
		detailspage.lastname("TestGFRE");
			
        //Seat
		
		if (driver.findElements(By.xpath("//button[@name='Select Seats']")).size() > 0) {
		    // Element found
			detailspage.selectseat();
			detailspage.choiceseat();
			detailspage.addondone();
		} else {
		   
		    System.out.println("Seat element not found. Skipping seat selection.");
		   
		}

        //Meal
		
		if (driver.findElements(By.xpath("//button[@name='Select Meals']")).size() > 0) {
		    // Element found
			 detailspage.addmeals();
			    detailspage.choicemeals();
			    detailspage.addondone();
		} else {
		    // Element not found
		   
		    System.out.println("Meal element not found. Skipping Meal selection.");
		   
		}
		
        //Baggage

		if (driver.findElements(By.xpath("//button[@name='Select Baggage']")).size() > 0) {
		    // Element found
			 detailspage.selectluggage();
			    detailspage.choiceluggage();
			    detailspage.addondone();
		} else {
		    // Element not found
		    System.out.println("Baggage element not found. Skipping Baggage selection.");
		  
		}
		
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
		
			detailspage.DirectButton();
			
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	
	}


	@Test
	public void ValidatingdefaultflightBookDetailsoneWaywithClassFirst() throws InterruptedException {

		HomePageTest homepage = new HomePageTest();
		
		homepage.classdownside();
		homepage.first();
		homepage.formpagesearch();
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		
		if (driver.findElements(By.xpath("//div[@class='mt-3 card-title h5']")).size() > 0) {
			// Flight not found
			resultpage.flightnotfound();
			driver.quit(); // Quit the driver if flight not found
			return;

		} else {
			// Flight found
			resultpage.bookflights();
		}
		// bookpage.bookflights();
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		detailspage.travellerfirstname("TestHRIF");
		detailspage.lastname("TestRDI");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
			detailspage.DirectButton();
			
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	}


	@Test
	public void ValidatingdefaultflightBookDetailsoneWaywithClassBusiness() throws InterruptedException {

		HomePageTest homepage = new HomePageTest();
		homepage.classdownside();
		homepage.business();
		homepage.formpagesearch();
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		if (driver.findElements(By.xpath("//div[@class='mt-3 card-title h5']")).size() > 0) {
			// Flight not found
			resultpage.flightnotfound();
			driver.quit(); // Quit the driver if flight not found
			return;

		} else {
			// Flight found
			resultpage.bookflights();
		}
	//	bookpage.bookflights();
		
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		Thread.sleep(3000);
				  try {
	        	Alert al = driver.switchTo().alert(); 
	    		System.out.println("Message:Request flight is not longer available.Please try different flight:"+al.getText());
	            al.accept();
	            driver.quit();
	        } catch (Exception e) {
	            System.out.println("No alert found. Proceeding to the next step.");
	        }	
		

		detailspage.travellerfirstname("TestASDC");
		detailspage.lastname("TestHJRDD");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
		
			detailspage.DirectButton();
		
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	}

	@Test
	public void ValidatingdefaultflightBookDetailsoneWaywithClassPremiumEconomy() throws InterruptedException {

		HomePageTest homepage = new HomePageTest();
	
		homepage.classdownside();
		homepage.premiumeconomy();
		homepage.formpagesearch();
		
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		if (driver.findElements(By.xpath("//div[@class='mt-3 card-title h5']")).size() > 0) {
			// Flight not found
			resultpage.flightnotfound();
			driver.quit(); // Quit the driver if flight not found
			return;

		} else {
			// Flight found
			resultpage.bookflights();
		}
		// bookpage.bookflights();
		
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		
		detailspage.travellerfirstname("TestTDGJD");
		detailspage.lastname("TestGHFG");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
		
			detailspage.DirectButton();
		
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	}

	@Test
	public void ValidatetheDomesticDefaultFlightBookDetailsoneWaywithAdultsChildInfant()
			throws InterruptedException {
		HomePageTest homepage = new HomePageTest();
	
		homepage.passengerarrowdown();
		int i = 1;
		while (i < 2) {
			homepage.adult();
			homepage.child();
			homepage.infant();
			i++;
		}
		homepage.passengerarrowup();
	    homepage.formpagesearch();
	FlightResultsPageTest resultpage = new FlightResultsPageTest();
	resultpage.bookflights();
	
	FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
	
	detailspage.travellerfirstname("TestnameA");
	detailspage.lastname("TestsurnameA");
	detailspage.firstname1("TestnameB");
	detailspage.lastname1("TestsurnameB");
	detailspage.childfirstname("TestnameC");
	detailspage.childlastname("TestsurnameC");
	detailspage.infantfirstname("TestnameD");
	detailspage.infantlastname("TestsurnameD");
	detailspage.infantdob();
	detailspage.infantdobclick();
	detailspage.validemailid("test@gmail.com");
	detailspage.validphoneno("12345678890");
//	detailspage.paymentbutton();

		detailspage.DirectButton();
	
		if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
            // Flight not found
            detailspage.Bookingfaildonebutton();
            driver.quit(); // Booking fail
            return;}
        detailspage.ViewBooking();
    	detailspage.Viewdetailsclick();

	}

	@Test
	public void ValidatetheDomesticDefaultFlightBookDetailsoneWaywithFareStudent() throws InterruptedException {
		HomePageTest homepage = new HomePageTest();
		
		homepage.faretypestudent();
		homepage.formpagesearch();
	
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		resultpage.bookflights();
		
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		
		detailspage.travellerfirstname("TestGSG");
		detailspage.lastname("TestRG");
		detailspage.StudentIdno("ASDF1F");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
		//detailspage.paymentbutton();
		
		detailspage.DirectButton();
	
		if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
            // Flight not found
            detailspage.Bookingfaildonebutton();
            driver.quit(); // Booking fail
            return;}
        
		detailspage.ViewBooking();
		detailspage.Viewdetailsclick();

	}

	@Test
	public void ValidatetheDomesticDefaultFlightBookDetailsoneWaywithFareStudentclassfirst() throws InterruptedException {
		HomePageTest homepage = new HomePageTest();
	
		homepage.classdownside();
		homepage.first();
		homepage.faretypestudent();
		homepage.formpagesearch();
	
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
	
		 if (driver.findElements(By.xpath("//div[@class='mt-3 card-title h5']")).size() > 0) {
	            // Flight not found
	            resultpage.flightnotfound();
	            driver.quit(); // Quit the driver if flight not found
	            return;
	           
	        } else {
	            // Flight found
	            resultpage.bookflights();
	        }
	//	bookpage.bookflights();
		 Thread.sleep(3000);
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
	
		detailspage.travellerfirstname("TestRGFG");
		detailspage.lastname("TestRRGE");
		detailspage.StudentIdno("ASWDF1F");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
		
			detailspage.DirectButton();
			
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	}
	
	@Test
	public void ValidatetheDomesticDefaultFlightBookDetailsoneWaywithFareStudentclassPremiumEconomy() throws InterruptedException {
		HomePageTest homepage = new HomePageTest();
		
		homepage.classdownside();
		homepage.premiumeconomy();
		homepage.faretypestudent();
		homepage.formpagesearch();
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		 if (driver.findElements(By.xpath("//div[@class='mt-3 card-title h5']")).size() > 0) {
	            // Flight not found
	            resultpage.flightnotfound();
	            driver.quit(); // Quit the driver if flight not found
	            return;
	           
	        } else {
	            // Flight found
	            resultpage.bookflights();
	        }
	//	bookpage.bookflights();
		
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
	
		detailspage.travellerfirstname("TestRTTDW");
		detailspage.lastname("TestRDS");
		detailspage.StudentIdno("ASWEDF1F");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
		
			detailspage.DirectButton();
			
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	}
	
	@Test
	public void ValidatetheDomesticDefaultFlightBookDetailsoneWaywithFareStudentclassBusiness() throws InterruptedException {
		HomePageTest homepage = new HomePageTest();
		
		homepage.classdownside();
		homepage.business();
		homepage.faretypestudent();
		homepage.formpagesearch();
	
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		 if (driver.findElements(By.xpath("//div[@class='mt-3 card-title h5']")).size() > 0) {
	            // Flight not found
	            resultpage.flightnotfound();
	            driver.quit(); // Quit the driver if flight not found
	            return;
	           
	        } else {
	            // Flight found
	            resultpage.bookflights();
	        }
	//	bookpage.bookflights();
		
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
	
		detailspage.travellerfirstname("TestRFGF");
		detailspage.lastname("TestWETG");
		detailspage.StudentIdno("ASDVCF1F");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
		
			detailspage.DirectButton();
		
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	}
	
	@Test
	public void ValidatetheDomesticDefaultFlightBookDetailsoneWaywithFareArmedforce() throws InterruptedException {
		HomePageTest homepage = new HomePageTest();
		
		homepage.faretypearmedforces();
		homepage.formpagesearch();
	
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		
		resultpage.bookflights();
		
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		
		detailspage.travellerfirstname("TestWRGG");
		detailspage.lastname("TestRTFJ");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
		
			detailspage.DirectButton();
			
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	}

	@Test
	public void ValidatetheDomesticDefaultFlightBookDetailsoneWaywithFareArmedforceClassfirst() throws InterruptedException {
		HomePageTest homepage = new HomePageTest();
		
		homepage.classdownside();
		homepage.first();
		homepage.faretypearmedforces();
		homepage.formpagesearch();
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		 if (driver.findElements(By.xpath("//div[@class='mt-3 card-title h5']")).size() > 0) {
	            // Flight not found
	            resultpage.flightnotfound();
	            driver.quit(); // Quit the driver if flight not found
	            return;
	           
	        } else {
	            // Flight found
	            resultpage.bookflights();
	        }
	//	bookpage.bookflights();
	
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		
		detailspage.travellerfirstname("TestSKRG");
		detailspage.lastname("TestSRGF");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
		
			detailspage.DirectButton();
			
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	}
	
	@Test
	public void ValidatetheDomesticDefaultFlightBookDetailsoneWaywithFareArmedforceClassPremiumEconomy() throws InterruptedException {
		HomePageTest homepage = new HomePageTest();
		
		homepage.classdownside();
		homepage.premiumeconomy();
		homepage.faretypearmedforces();
		homepage.formpagesearch();
	
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		 if (driver.findElements(By.xpath("//div[@class='mt-3 card-title h5']")).size() > 0) {
	            // Flight not found
	            resultpage.flightnotfound();
	            driver.quit(); // Quit the driver if flight not found
	            return;
	           
	        } else {
	            // Flight found
	            resultpage.bookflights();
	        }
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		
		detailspage.travellerfirstname("TestRGDd");
		detailspage.lastname("TestRGDF");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
		
			detailspage.DirectButton();
		
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	}
	
	@Test
	public void ValidatetheDomesticDefaultFlightBookDetailsoneWaywithFareArmedforceClassBusiness() throws InterruptedException {
		HomePageTest homepage = new HomePageTest();
		homepage.classdownside();
		homepage.business();
		homepage.faretypearmedforces();
		homepage.formpagesearch();
		
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		 if (driver.findElements(By.xpath("//div[@class='mt-3 card-title h5']")).size() > 0) {
	            // Flight not found
	            resultpage.flightnotfound();
	            driver.quit(); // Quit the driver if flight not found
	            return;
	           
	        } else {
	            // Flight found
	            resultpage.bookflights();
	        }
		
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		
		detailspage.travellerfirstname("TestSRGF");
		detailspage.lastname("TestSRGH");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
	
			detailspage.DirectButton();
			
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	

	}
	
	@Test
	public void ValidatetheDomesticDefaultFlightBookDetailsoneWaywithdoctorandnurses() throws InterruptedException {
		HomePageTest homepage = new HomePageTest();
		
		homepage.faretypedoctorandnurses();
		homepage.formpagesearch();
		
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
	
		resultpage.bookflights();
		
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
	
		detailspage.travellerfirstname("TestRSGD");
		detailspage.lastname("TestSRDRE");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
		
			detailspage.DirectButton();
			
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	}
	
	@Test
	public void ValidatetheDomesticDefaultFlightBookDetailsoneWaywithdoctorandnursesclassfirst() throws InterruptedException {
		HomePageTest homepage = new HomePageTest();
		
		homepage.faretypedoctorandnurses();
		homepage.classdownside();
		homepage.first();
		homepage.formpagesearch();
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		 if (driver.findElements(By.xpath("//div[@class='mt-3 card-title h5']")).size() > 0) {
	            // Flight not found
	            resultpage.flightnotfound();
	            driver.quit(); // Quit the driver if flight not found
	            return;
	           
	        } else {
	            // Flight found
	            resultpage.bookflights();
	        }
	//	bookpage.bookflights();
		
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		detailspage.travellerfirstname("TestSWEEFW");
		detailspage.lastname("TestRSKG");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
	
			detailspage.DirectButton();
		
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
			
	}
	
	@Test
	public void ValidatetheDomesticDefaultFlightBookDetailsoneWaywithdoctorandnursesclassPremiumEconomy() throws InterruptedException {
		HomePageTest homepage = new HomePageTest();
		
		homepage.faretypedoctorandnurses();
		homepage.classdownside();
		homepage.premiumeconomy();
		homepage.formpagesearch();
		
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		 if (driver.findElements(By.xpath("//div[@class='mt-3 card-title h5']")).size() > 0) {
	            // Flight not found
	            resultpage.flightnotfound();
	            driver.quit(); // Quit the driver if flight not found
	            return;
	           
	        } else {
	            // Flight found
	            resultpage.bookflights();
	        }
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		
		detailspage.travellerfirstname("TestTGWE");
		detailspage.lastname("TestSRJUJ");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
	
			detailspage.DirectButton();
		
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	}
	
	@Test
	public void ValidatetheDomesticDefaultFlightBookDetailsoneWaywithdoctorandnursesclassBusiness() throws InterruptedException {
		HomePageTest homepage = new HomePageTest();
		
		homepage.faretypedoctorandnurses();
		homepage.classdownside();
		homepage.business();
		homepage.formpagesearch();
	
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		 if (driver.findElements(By.xpath("//div[@class='mt-3 card-title h5']")).size() > 0) {
	            // Flight not found
	            resultpage.flightnotfound();
	            driver.quit(); // Quit the driver if flight not found
	            return;
	           
	        } else {
	            // Flight found
	            resultpage.bookflights();
	        }
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		detailspage.travellerfirstname("TestJYI");
		detailspage.lastname("TestJHYH");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
		
			detailspage.DirectButton();
			
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	}
	
	@Test
	public void ValidatetheDomesticDefaultFlightBookDetailsoneWaywithFareSeniorCitizen() throws InterruptedException {
		HomePageTest homepage = new HomePageTest();
		homepage.faretypeseniorcitizen();
		homepage.formpagesearch();
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		resultpage.bookflights();
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		detailspage.travellerfirstname("Testyhtu");
		detailspage.lastname("Testthfhr");
		detailspage.dob();
		detailspage.seniorcitizendobclick();
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
		
			detailspage.DirectButton();
			
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
			}

	@Test
	public void ValidatetheDomesticDefaultFlightBookDetailsoneWaywithFareSeniorCitizenclassfirst() throws InterruptedException {
		HomePageTest homepage = new HomePageTest();
	
		homepage.classdownside();
		homepage.first();
		homepage.faretypeseniorcitizen();
	
		homepage.formpagesearch();
		
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		 if (driver.findElements(By.xpath("//div[@class='mt-3 card-title h5']")).size() > 0) {
	            // Flight not found
	            resultpage.flightnotfound();
	            driver.quit(); // Quit the driver if flight not found
	            return;
	           
	        } else {
	            // Flight found
	            resultpage.bookflights();
	        }
	//	bookpage.bookflights();
		 
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		
		detailspage.travellerfirstname("Testtryry");
		detailspage.lastname("Testyhtd");
		detailspage.dob();
		detailspage.seniorcitizendobclick();
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
		
			detailspage.DirectButton();
			
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	}
	

	@Test
	public void ValidatetheDomesticDefaultFlightBookDetailsoneWaywithFareSeniorCitizenclassPremiumEconomy() throws InterruptedException {
		HomePageTest homepage = new HomePageTest();
	
		homepage.classdownside();
		homepage.premiumeconomy();
		homepage.faretypeseniorcitizen();
		homepage.formpagesearch();
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		 if (driver.findElements(By.xpath("//div[@class='mt-3 card-title h5']")).size() > 0) {
	            // Flight not found
	            resultpage.flightnotfound();
	            driver.quit(); // Quit the driver if flight not found
	            return;
	           
	        } else {
	            // Flight found
	            resultpage.bookflights();
	        }
	//	bookpage.bookflights();
		
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
	
		detailspage.travellerfirstname("Testffthr");
		detailspage.lastname("Testtht");
		detailspage.dob();
		detailspage.seniorcitizendobclick();
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
		
			detailspage.DirectButton();
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	}
	

	@Test
	public void ValidatetheDomesticDefaultFlightBookDetailsoneWaywithFareSeniorCitizenclassBusiness() throws InterruptedException {
		HomePageTest homepage = new HomePageTest();
		homepage.classdownside();
		homepage.business();
		homepage.faretypeseniorcitizen();
		homepage.formpagesearch();
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		 if (driver.findElements(By.xpath("//div[@class='mt-3 card-title h5']")).size() > 0) {
	            // Flight not found
	            resultpage.flightnotfound();
	            driver.quit(); // Quit the driver if flight not found
	            return;
	           
	        } else {
	            // Flight found
	            resultpage.bookflights();
	        }
	//	bookpage.bookflights();
		
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		
		detailspage.travellerfirstname("Testhutd");
		detailspage.lastname("testuuhrt");
		detailspage.dob();
		detailspage.seniorcitizendobclick();
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
		
			detailspage.DirectButton();
			
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	}
	
	@Test
	public  void ValidatetheDomesticDefaultFlightBookDetailsRoundTrip() throws InterruptedException{
		HomePageTest homepage = new HomePageTest();
		
		homepage.clickonwarddate();
	//	homepage.nextmonth();
		homepage.enteronwarddate();
		homepage.clickreturndate();
		homepage.enterreturndate();
		homepage.formpagesearch();
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		
		resultpage.roundbookflights();
		
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		
		detailspage.travellerfirstname("Testgtggthr");
		detailspage.lastname("Testhtrggthf");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
		
			detailspage.DirectButton();
			Thread.sleep(3000);
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	
	}
	
	@Test
	public  void ValidatetheEnteringCityFlightBookDetailsRoundTrip() throws InterruptedException{
		HomePageTest homepage = new HomePageTest();
		homepage.departurecityopen("Pune");
		homepage.arrivalcityopen("Indore");	
		homepage.clickonwarddate();
	//	homepage.nextmonth();
		homepage.enteronwarddate();
		homepage.clickreturndate();
		homepage.enterreturndate();
		homepage.formpagesearch();
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		resultpage.roundbookflights();
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		detailspage.travellerfirstname("Testhhhtrty");
		detailspage.lastname("TestjjrJyj");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
		
			detailspage.DirectButton();
			
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	}	
	

	@Test
	public  void ValidatetheDomesticDefaultFlightBookDetailsRoundTripwithClassFirst() throws InterruptedException{
		HomePageTest homepage = new HomePageTest();
		
		homepage.clickonwarddate();
		//homepage.nextmonth();
		homepage.enteronwarddate();
		homepage.clickreturndate();
		homepage.enterreturndate();
		homepage.classdownside();
		homepage.first();
		homepage.formpagesearch();
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		 if (driver.findElements(By.xpath("//div[@class='mt-3 card-title h5']")).size() > 0) {
	            // Flight not found
	            resultpage.flightnotfound();
	            driver.quit(); // Quit the driver if flight not found
	            return;
	           
	        } else {
	            // Flight found
	            resultpage.roundbookflights();
	        }
	//	bookpage.roundbookflights();
		
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
	
		detailspage.travellerfirstname("Testjhtyt");
		detailspage.lastname("Testhrjjt");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
			detailspage.DirectButton();
		
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	}
	
	@Test
	public  void ValidatetheDomesticDefaultFlightBookDetailsRoundTripwithClassBusiness() throws InterruptedException{
		HomePageTest homepage = new HomePageTest();

		homepage.clickonwarddate();
	//	homepage.nextmonth();
		homepage.enteronwarddate();
		homepage.clickreturndate();
		homepage.enterreturndate();
		homepage.classdownside();
		homepage.business();
		homepage.formpagesearch();
	
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		 if (driver.findElements(By.xpath("//div[@class='mt-3 card-title h5']")).size() > 0) {
	            // Flight not found
	            resultpage.flightnotfound();
	            driver.quit(); // Quit the driver if flight not found
	            return;
	           
	        } else {
	            // Flight found
	            resultpage.roundbookflights();
	        }
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
	
		detailspage.travellerfirstname("Testeyjkjy");
		detailspage.lastname("Testtyhrthhj");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
	
		detailspage.DirectButton();
	
			
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	}
	
	@Test
	public  void ValidatetheDomesticDefaultFlightBookDetailsRoundTripwithClassPremiumEconomy() throws InterruptedException{
		HomePageTest homepage = new HomePageTest();
		
		homepage.clickonwarddate();
	//	homepage.nextmonth();
		homepage.enteronwarddate();
		homepage.clickreturndate();
		homepage.enterreturndate();
		homepage.classdownside();
		homepage.premiumeconomy();
		homepage.formpagesearch();
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		 if (driver.findElements(By.xpath("//div[@class='mt-3 card-title h5']")).size() > 0) {
	            // Flight not found
	            resultpage.flightnotfound();
	            driver.quit(); // Quit the driver if flight not found
	            return;
	           
	        } else {
	            // Flight found
	            resultpage.roundbookflights();
	        }
	//	bookpage.roundbookflights();
		
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		
		detailspage.travellerfirstname("Testtytrj");
		detailspage.lastname("Testytrjjuk");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
	
			detailspage.DirectButton();
			
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	}
	
	@Test
	public  void ValidatetheDomesticDefaultFlightBookDetailsOneWayTripwithSwap() throws InterruptedException{
		HomePageTest homepage = new HomePageTest();
		
		homepage.swaping();
		homepage.formpagesearch();
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		resultpage.bookflights();
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		detailspage.travellerfirstname("Testukjy");
		detailspage.lastname("Testyjktyg");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
	    detailspage.DirectButton();
		
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
		}	
	
	
	

	
	@Test
	public  void ValidatetheDomesticDefaultFlightBookDetailsRoundTripwithSwap() throws InterruptedException{
		HomePageTest homepage = new HomePageTest();
	
		homepage.swaping();
		homepage.clickonwarddate();
	//	homepage.nextmonth();
		homepage.enteronwarddate();
		homepage.clickreturndate();
		homepage.enterreturndate();
		homepage.formpagesearch();
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		resultpage.roundbookflights();
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		detailspage.travellerfirstname("Testyujgry");
		detailspage.lastname("Testyjgvhf");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
		
			detailspage.DirectButton();
		
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	}
	
	@Test
	public  void ValidatetheDefaultFlightBookDetailsOneWayTripwithCitySelectDropdown() throws InterruptedException{
		HomePageTest homepage = new HomePageTest();
	
		homepage.departuredropdown();
		homepage.dropdowndeparturecity();
		homepage.arrivaldropdown();
		homepage.dropdownarrivalcity();
		homepage.formpagesearch();
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		resultpage.bookflights();
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		detailspage.travellerfirstname("Testvvfjg");
		detailspage.lastname("Testsytjjuy");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
		
			detailspage.DirectButton();
		
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();

	}
	
	@Test
	public  void ValidatetheFlightBookDetailsRoundTripwithCitySelectDropdown() throws InterruptedException{
		HomePageTest homepage = new HomePageTest();
		homepage.departuredropdown();
		homepage.dropdowndeparturecity();
		homepage.arrivaldropdown();
		homepage.dropdownarrivalcity();
		homepage.clickonwarddate();
	//	homepage.nextmonth();
		homepage.enteronwarddate();
		Thread.sleep(3000);
		homepage.clickreturndate();
		homepage.enterreturndate();
		homepage.formpagesearch();
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		resultpage.internationalroundflightbook();
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		detailspage.travellerfirstname("Testvhvfjg");
		detailspage.lastname("Testsytjjuyh");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("1234437890");
//		detailspage.paymentbutton();
	
			detailspage.DirectButton();
			
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	}
	
	@Test
	public  void ValidatetheEnteringCityFlightBookDetailsRoundTripInternational() throws InterruptedException{
		HomePageTest homepage = new HomePageTest();
		homepage.departurecityopen("Dubai");
		homepage.arrivalcityopen("Bangkok");	
		homepage.clickonwarddate();
	//	homepage.nextmonth();
		homepage.enteronwarddate();
		Thread.sleep(3000);
		homepage.clickreturndate();
		homepage.enterreturndate();
		homepage.formpagesearch();
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		 if (driver.findElements(By.xpath("//div[@class='mt-3 card-title h5']")).size() > 0) {
	            // Flight not found
	            resultpage.flightnotfound();
	            driver.quit(); // Quit the driver if flight not found
	            return;
	           
	        } else {
	            // Flight found
	            resultpage.internationalroundflightbook();
	        }
		
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		detailspage.travellerfirstname("Testnameyuren");
		detailspage.lastname("Testsurnameuyne");
		detailspage.dob();
		detailspage.dobclick();
		Thread.sleep(3000);
		detailspage.validpassport("N1234567");
		detailspage.validissuepassport();
		detailspage.Passportissuedate();
		detailspage.validexpirepassport();
		detailspage.Passportexpiredate();
		detailspage.nationality("India");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
		Thread.sleep(3000);
			detailspage.DirectButton();
			Thread.sleep(3000);
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	}		
	
	@Test
	public  void ValidatetheEnteringCityFlightBookDetailsRoundTripInternationalPassport() throws InterruptedException{
		HomePageTest homepage = new HomePageTest();
	Thread.sleep(3000);
		homepage.departurecityopen("Newark");
		homepage.arrivalcityopen("Delhi");	
		homepage.clickonwarddate();
	//	homepage.nextmonth();
		homepage.enteronwarddate();
		Thread.sleep(3000);
		homepage.clickreturndate();
		homepage.enterreturndate();
		homepage.formpagesearch();
		FlightResultsPageTest resultpage = new FlightResultsPageTest();
		resultpage.internationalroundflightbook();
		FlightReviewBookPageTest detailspage = new FlightReviewBookPageTest();
		detailspage.travellerfirstname("testgyuy");
		detailspage.lastname("testjktu");
		detailspage.dob();
		detailspage.dobclick();
		Thread.sleep(3000);
		detailspage.validpassport("N1234567");
		detailspage.validissuepassport();
		detailspage.Passportissuedate();
		detailspage.validexpirepassport();
		detailspage.Passportexpiredate();
		detailspage.nationality("India");
		detailspage.validemailid("test@gmail.com");
		detailspage.validphoneno("12345678890");
//		detailspage.paymentbutton();
		Thread.sleep(3000);
			detailspage.DirectButton();
			Thread.sleep(3000);
			if (driver.findElements(By.xpath("//button[@class='btn rounded-pill mt-4 Flight-search-flight-btn font20 text-white  border-0 btn btn-primary']")).size() > 0) {
	            // Flight not found
	            detailspage.Bookingfaildonebutton();
	            driver.quit(); // Booking fail
	            return;}
	           
			detailspage.ViewBooking();
			detailspage.Viewdetailsclick();
	}		
	
	@AfterMethod
	public  void endup() throws InterruptedException  {
		Thread.sleep(3000);
	teardown();
		
	}
}