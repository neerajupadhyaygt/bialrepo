package pageObjects;

//package com.bial.qa.pages;



//import com.bial.qa.base.TestBase;
//import com.bial.qa.util.utilFunctions;

import libraries.BaseTestDriver;
import libraries.Utillities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePageObjects extends Utillities {

	@FindBy(id="swap-image")
    WebElement swap;
	
	@FindBy(id="react-select-2-input")
    WebElement dropdowndeparture;
	
	@FindBy(id="react-select-2-option-4")
    WebElement dropdowndeparturecity;
	
	@FindBy(id="react-select-3-input")
    WebElement dropdownarrival;
	
	@FindBy(id="react-select-3-option-10")
    WebElement dropdownarrivalcity;
	
	@FindBy(xpath="//button[@name='mobilesearch']")
    WebElement search;

	@FindBy(xpath="//input[@value='1 Passenger']")
	WebElement passengerdown;
	
	@FindBy(xpath="//img[contains(@class, 'sc-aXZVg') and contains(@class, 'hMvnGg') and contains(@class, 'Flight-ctm-icon') and contains(@class, 'Flight-ctm-slct') and @alt='arrowdown']")
	WebElement passengerup;
	 
	@FindBy(xpath="//button[@name='adult' and contains(@class, 'btn quantity-right-plus') and @data-type='plus']")
	WebElement adultselect;
	
	@FindBy(xpath="//button[@name='child' and contains(@class, 'sc-gEvEer') and contains(@class, 'fteAEG') and contains(@class, 'btn') and contains(@class, 'quantity-right-plus') and contains(@class, 'border-0')]")
	WebElement childselect;
	
	@FindBy(xpath="//button[@name='infant' and contains(@class, 'sc-gEvEer') and contains(@class, 'fteAEG') and contains(@class, 'btn') and contains(@class, 'quantity-right-plus') and contains(@class, 'border-0')]")
	WebElement infantselect;
	
	@FindBy(xpath="//input[@placeholder='1 Cabin Class']")
	WebElement classdown;
	
	@FindBy(id="641c3f20feb29baa0897a270")
	WebElement classfirst;
	
	@FindBy(id="641c3ee5feb29baa0897a26e")
	WebElement classpremiumeconomy;
	
	@FindBy(id="641c3f16feb29baa0897a26f")
	WebElement classbusiness;
	
	@FindBy(xpath="//img[contains(@src,'images/home/Icon-Arrow-Down.svg')]")
	WebElement classup;                                                    
	
	@FindBy(id="641c3ebdfeb29baa0897a26cdesktop")
	WebElement farestudent;
	
	@FindBy(id="641c3ea9feb29baa0897a26bdesktop")
	WebElement fareseniorcitizen;
	
	@FindBy(id="649149830c993ba4ee967980desktop")
	WebElement farearmedforce;
	
	@FindBy(id="649149c20c993ba4ee967981desktop")
	WebElement faredoctorandnurses;
	
	@FindBy(xpath="//input[@name='departdate' and @placeholder='Onward Date']")
	WebElement onwarddateopen;
	
	@FindBy(xpath="//button[@class='react-datepicker__navigation react-datepicker__navigation--next']")
	WebElement clicknextmonth;
	
	@FindBy(xpath="//div[contains(@class, 'react-datepicker__day') and @aria-label='Choose Wednesday, August 30th, 2023']")
	WebElement onwarddateclick;
	
	@FindBy(xpath="//div[contains(@class, 'react-datepicker__day') and @aria-label='Choose Thursday, August 31st, 2023']")
	WebElement returndateclick;
	
	@FindBy(xpath="//input[@name='arrivaldate' and @placeholder='Return Date']")
	WebElement returndateopen;
			
	@FindBy(xpath="//input[@id='react-select-2-input']")
	WebElement fromcityopen;


	@FindBy(xpath="//input[@id='react-select-3-input']")
	WebElement tocityopen;

	



	// constructor
	public HomePageObjects() {
		super();
		PageFactory.initElements(driver, this);
	}

	// actions
	
	public void formpagesearch() {
		search.click();
	}
	public void swaping() {
		swap.click();
	}
	
	public void departuredropdown() {
		dropdowndeparture.click();
	}

	public void dropdowndeparturecity() {
	dropdowndeparturecity.click();
	}
	
	public void arrivaldropdown() {
		dropdownarrival.click();
	}
	
	public void dropdownarrivalcity() {
		dropdownarrivalcity.click();
		}
	
	public void passengerarrowdown() {
		passengerdown.click();
	}
	
	public void nextmonth() {
		clicknextmonth.click();
	}
	
	public void passengerarrowup() {
		passengerup.click();
	}
	
	public void adult() {
		adultselect.click();
	}
	
	public void child() {
		childselect.click();
	}
	
	public void infant() {
		infantselect.click();
	}

	public void classupside() {
		classup.click();
	}
	public void classdownside() {
		classdown.click();
		
	}
	public void first() {
		classfirst.click();
	}
	
	
	public void premiumeconomy() {
		classpremiumeconomy.click();
	}
	
	
	public void business() {
		classbusiness.click();
	}
	
	public void faretypestudent() {
		farestudent.click();
	}
	
	public void faretypeseniorcitizen() {
		fareseniorcitizen.click();
	}
	
	public void faretypearmedforces() {
		farearmedforce.click();
	}
	
	public void faretypedoctorandnurses() {
		faredoctorandnurses.click();
	}
	
	public void clickonwarddate() {
		onwarddateopen.click();

	}
	
	public void clickreturndate() {
		returndateopen.click();

	}
	
	public void enteronwarddate() {
		onwarddateclick.click();
	}
	
	public void enterreturndate() {
		returndateclick.click();
	}
	
	public void departurecityopen(String departurecity) throws InterruptedException {
		fromcityopen.click();
		fromcityopen.sendKeys(departurecity);
		Thread.sleep(2000);
		fromcityopen.sendKeys(Keys.ENTER);
		
	}
	
	public void arrivalcityopen(String arrivalcity) throws InterruptedException {
		tocityopen.click();
		tocityopen.sendKeys(arrivalcity);
		Thread.sleep(2000);
		tocityopen.sendKeys(Keys.ENTER);
	}
	
	
	
	
	
	

// Select the option by index"
		
//	public void selectCities(String onwardcity,String arrivalcity) {
//
//		//fromcityopen.click();
//		fromcityopen.sendKeys(onwardcity);
//		tocityopen.sendKeys(arrivalcity);
//	}
//	public void clickSearchButton() {
//    search.click();
//
//	}




//	public void enterDepartureCity() {
//		toCityDrop.click();
//		searchToCity.sendKeys(prop.getProperty("From"));
//		utilFunctions.ExpWaitForWebelement(firstOption);
//		firstOption.click();
//	}
//
//	public void enterReturnCity () {
//		toCityDrop.sendKeys(prop.getProperty("To"));
//		utilFunctions.ExpWaitForWebelement(firstOption);
//		firstOption.click();
//	}

//	public void enterDepartureDate (long i) {
//		onwarddateopen.click();
//		Utillities date = Utillities.getCurrentAndReturnDates();
//		driver.findElement(Utillities.customXpath(onwarddateopen, date.departureDate)).click();
//	}
//
//
//	public void enterReturnDate (long i) {
//		returndateopen.click();
//		Utillities date = Utillities.getCurrentAndReturnDates();
//		driver.findElement(Utillities.customXpath(returndateopen, date.returnDate)).click();
//	}

	

}
