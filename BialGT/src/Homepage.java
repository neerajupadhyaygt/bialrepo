import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Homepage {

	
	public static void main(String[] args) throws InterruptedException  {
		
		WebDriverManager.chromedriver().create(); 
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://bial.genietalk.ai/flights");
	   // Thread.sleep(3000);
	 //   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    // Explict wait
	    //WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(30));
	    //w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='websearch']")));
	    //  ((WebElement) w).click();
		//Thread.sleep(3000);
	     //System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
	    // driver.quit();
	
		//*****************************************************************************************	
		//TC1 Click search on home page (by default)
	
		
//         driver.findElement(By.xpath("//div[@class='text-center final-btn mt-3 home-search-btn']")).click();

		 //****************************************************************************************
        // TC2 9 adult

//     
//		driver.findElement(By.xpath("//input[@value='1 Passenger']")).click();
//		int i= 1;
//        while(i<10)
//        {
//     	driver.findElement(By.xpath("//button[@name='adult']")).click();
//      	i++;
//        }
//        // Thread.sleep(3000);
//       for(int i=1;i<10;i++){
//        	driver.findElement(By.xpath("//button[@name='adult']")).click();
//         }
//      
//       Thread.sleep(5000);
//   
//           driver.findElement(By.className("home-heading")).click();    
//           driver.findElement(By.xpath("//button[@name='mobilesearch']")).click();  

        //***************************************************************************************
       //TC3  9 adult 9 infants
           
           
      
//  		driver.findElement(By.xpath("//input[@value='1 Passenger']")).click();
//  		int i=1;
//  		while(i<10)
//        {
// 
//   	    driver.findElement(By.xpath("//button[@name='adult']")).click();  
//   	    driver.findElement(By.xpath("//button[@class='sc-dicizt eECEbI btn quantity-right-plus' and @data-type='plus']")).click();     	
//     	i++;
//   	    }
//  		Thread.sleep(3000);
//
//		driver.findElement(By.id("react-select-3-option-6")).click();
//	    driver.findElement(By.xpath("//input[@id='react-select-3-input']")).click();
//	    driver.findElement(By.id("react-select-3-option-7")).click();
// 		driver.findElement(By.className("home-heading")).click();    
//        driver.findElement(By.xpath("//button[@name='websearch']")).click();  
        
        //*********************************************************************************************
        //TC4 1 adult 8 child
	    
//	    driver.findElement(By.xpath("//input[@value='1 Passenger']")).click();
//		int i=1;
//		while(i<10)
//       {
//        driver.findElement(By.xpath("//button[@name='child' and contains(@class, 'sc-dicizt') and contains(@class, 'eECEbI') and contains(@class, 'btn') and contains(@class, 'quantity-right-plus') and contains(@class, 'border-0')]")).click();
//	        
//	     	i++;
//	        }
//       driver.findElement(By.xpath("//img[@alt='arrowdown' and contains(@class, 'sc-bgqQcB') and contains(@class, 'gFDEWi') and contains(@class, 'ctm-icon') and contains(@class, 'ctm-slct')]")).click();
//       driver.findElement(By.xpath("//button[@name='mobilesearch']")).click();  
	
        
        //*********************************************************************************************
        //TC5 class first
        
//        driver.findElement(By.xpath("//input[@placeholder='1 Cabin Class']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.id("641c3f20feb29baa0897a270")).click();
        
       // Thread.sleep(3000);
     // driver.findElement(By.xpath("//img[@alt='arrowdown' and @src='images/home/Icon-Arrow-Down.svg' and contains(@class, 'sc-bgqQcB') and contains(@class, 'gFDEWi') and contains(@class, 'ctm-icon')]")).click();
      // Class dropdown close
     //   driver.findElement(By.xpath("//span[contains(@class, 'cursor-pointer') and contains(@class, 'pax-arrow') and contains(@class, 'open-select')]/img[@alt='arrowdown' and @src='images/home/Icon-Arrow-Down.svg' and contains(@class, 'sc-bgqQcB') and contains(@class, 'gFDEWi') and contains(@class, 'ctm-icon')]")).click();
      
        
      // driver.findElement(By.xpath("//button[@name='mobilesearch']")).click();  
//        
     //***************************************************************************************************   
        //TC6 class premium economy
       
//       driver.findElement(By.xpath("//input[@placeholder='1 Cabin Class']")).click();
//       driver.findElement(By.id("641c3ee5feb29baa0897a26e")).click();
//       
//       driver.findElement(By.className("home-heading")).click();    
//       driver.findElement(By.xpath("//button[@name='websearch']")).click();  
       
       //*************************************************************************************************
       // TC7 Class Business
       
//       driver.findElement(By.xpath("//input[@placeholder='1 Cabin Class']")).click();
//       Thread.sleep(3000);
//       driver.findElement(By.id("641c3f16feb29baa0897a26f")).click();
//       
//       driver.findElement(By.className("home-heading")).click();    
//       driver.findElement(By.xpath("//button[@name='mobilesearch']")).click();
       
       //************************************************************************************************
       //TC 8 fare type student
       
//       driver.findElement(By.id("641c3ebdfeb29baa0897a26c")).click();
//       
//       driver.findElement(By.xpath("//button[@name='websearch']")).click();
       
       //****************************************************************************************************
       //TC 9 fare type senior citizen
	//	Thread.sleep(3000);
//       driver.findElement(By.id("641c3ea9feb29baa0897a26b")).click();
//     
//       driver.findElement(By.xpath("//button[@name='mobilesearch']")).click();
       
       //****************************************************************************************************
       //TC 10 round trip
       
//		 driver.findElement(By.xpath("//input[@name='departdate' and @placeholder='Onward Date']")).click();
//		 
//		driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--009']")).click();
//		   
//		driver.findElement(By.xpath("//input[@name='arrivaldate' and @placeholder='Return Date']")).click();
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day') and @aria-label='Choose Friday, May 12th, 2023']")).click();
//      
//       driver.findElement(By.xpath("//button[@name='mobilesearch']")).click();
       
       //****************************************************************************************************
       //TC 11 9 adult round trip
       
//       
//		driver.findElement(By.xpath("//input[@name='arrivaldate' and @placeholder='Return Date']")).click();
//		driver.findElement(By.xpath("//input[@value='06/05/2023']")).click();
//		driver.findElement(By.className("home-heading")).click();  
//		
//		driver.findElement(By.xpath("//input[@value='1 Passenger']")).click();
//        int i=1;
//        while(i<10)
//       {
//    	driver.findElement(By.xpath("//button[@name='adult']")).click();
//     	i++;
//       }
//     
//        driver.findElement(By.className("home-heading")).click(); 
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("//button[@name='websearch']")).click();
       
	 //********************************************************************************************************  
     //TC 12 9 adult and 9 infant round trip  
       
       
//        driver.findElement(By.xpath("//input[@name='arrivaldate' and @placeholder='Return Date']")).click();
//		driver.findElement(By.xpath("//input[@value='06/05/2023']")).click();
//		driver.findElement(By.className("home-heading")).click();  
//		
//		driver.findElement(By.xpath("//input[@value='1 Passenger']")).click();
//        int i=1;
//        while(i<10)
//       {
//    	driver.findElement(By.xpath("//button[@name='adult']")).click();
//    	driver.findElement(By.xpath("//button[@class='sc-dicizt eECEbI btn quantity-right-plus' and @data-type='plus']")).click();  
//     	i++;
//       }
//     
//        driver.findElement(By.className("home-heading")).click(); 
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("//button[@name='websearch']")).click();
       
        //*****************************************************************************************************
        // TC 13 1 adult and 8 child round trip
       
//       driver.findElement(By.xpath("//input[@name='departdate' and @placeholder='Onward Date']")).click();
//		 
//		driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--009']")).click();
//		   
//		driver.findElement(By.xpath("//input[@name='arrivaldate' and @placeholder='Return Date']")).click();
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day') and @aria-label='Choose Friday, May 12th, 2023']")).click();
//       
//       driver.findElement(By.xpath("//input[@value='1 Passenger']")).click();
//     		int i=1;
//     		while(i<10)
//            {
//             driver.findElement(By.xpath("//button[@name='child' and contains(@class, 'sc-dicizt') and contains(@class, 'eECEbI') and contains(@class, 'btn') and contains(@class, 'quantity-right-plus') and contains(@class, 'border-0')]")).click();
//     	        
//     	     	i++;
//     	        }
//            driver.findElement(By.xpath("//img[@alt='arrowdown' and contains(@class, 'sc-bgqQcB') and contains(@class, 'gFDEWi') and contains(@class, 'ctm-icon') and contains(@class, 'ctm-slct')]")).click();
//            driver.findElement(By.xpath("//button[@name='mobilesearch']")).click();  
       //*****************************************************************************************************
       // TC 14 Class first Round Trip
       
//        driver.findElement(By.xpath("//input[@name='departdate' and @placeholder='Onward Date']")).click();
//        Thread.sleep(3000);
//    	driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day') and @aria-label='Choose Saturday, May 13th, 2023']")).click();
//		   
//		driver.findElement(By.xpath("//input[@name='arrivaldate' and @placeholder='Return Date']")).click();
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--022']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='1 Cabin Class']")).click();
//        driver.findElement(By.id("641c3f20feb29baa0897a270")).click();
        //driver.findElement(By.className("home-heading")).click();  
      //  driver.findElement(By.xpath("//img[@class='sc-bgqQcB']")).click();
     //   driver.findElement(By.className("sc-bgqQcB")).click();
      //  Thread.sleep(4000);
//        driver.findElement(By.id("react-select-3-option-6")).click();
//	    driver.findElement(By.xpath("//input[@id='react-select-3-input']")).click();
//	    driver.findElement(By.id("react-select-3-option-7")).click();
	//    driver.findElement(By.xpath("//button[@name='mobilesearch']")).click();
        
       //***************************************************************************************************** 
       //TC 15 Class Premium Economy Round Trip
        
//        driver.findElement(By.xpath("//input[@name='arrivaldate' and @placeholder='Return Date']")).click();
//        driver.findElement(By.xpath("//input[@value='06/05/2023']")).click();
//		driver.findElement(By.className("home-heading")).click();  
//		driver.findElement(By.xpath("//input[@placeholder='1 Cabin Class']")).click();
//        driver.findElement(By.id("641c3ee5feb29baa0897a26e")).click();
//        driver.findElement(By.className("home-heading")).click();  
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("//button[@name='websearch']")).click();
        
        //****************************************************************************************************
        //TC 16 Class Business Round Trip
        
//        driver.findElement(By.xpath("//input[@name='arrivaldate' and @placeholder='Return Date']")).click();
//        driver.findElement(By.xpath("//input[@value='06/05/2023']")).click();
//		driver.findElement(By.className("home-heading")).click();  
//		driver.findElement(By.xpath("//input[@placeholder='1 Cabin Class']")).click();
//        driver.findElement(By.id("641c3f16feb29baa0897a26f")).click();
//        driver.findElement(By.className("home-heading")).click();  
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//button[@name='websearch']")).click();
       
        //****************************************************************************************************
        // TC 17 Fare type student Round trip
        
        
//      driver.findElement(By.xpath("//input[@name='arrivaldate' and @placeholder='Return Date']")).click();
//        driver.findElement(By.xpath("//input[@value='06/05/2023']")).click();
//		driver.findElement(By.className("home-heading")).click();  
//		driver.findElement(By.id("641c3ebdfeb29baa0897a26c")).click();
//		Thread.sleep(3000);
//	    driver.findElement(By.xpath("//button[@name='websearch']")).click();
	       
     //********************************************************************************************************   
       // TC 18 Fare type Senior Citizen Round Trip
	    
	    
//    driver.findElement(By.xpath("//input[@name='arrivaldate' and @placeholder='Return Date']")).click();
//    driver.findElement(By.xpath("//input[@value='07/05/2023']")).click();
//	driver.findElement(By.className("home-heading")).click();  
//	driver.findElement(By.id("641c3ea9feb29baa0897a26b")).click();
//	Thread.sleep(3000);
//    driver.findElement(By.xpath("//button[@name='websearch']")).click();
        
     //*******************************************************************************************************   
     //  TC 19 swap rest default
//driver.findElement(By.xpath("//img[contains(@class,'swap-icn') and @id='swap-image']")).click();
// Thread.sleep(3000);
// driver.findElement(By.xpath("//button[@name='websearch']")).click();
//     
//	    Thread.sleep(3000);
//   driver.findElement(By.xpath("//img[contains(@class,'swap-icn') and @id='swap-image']")).click();
//    Thread.sleep(3000);
//    driver.findElement(By.xpath("//button[@name='mobilesearch']")).click();
//        
    //*********************************************************************************************************    
    // TC 20 selecting domestic city by dropdown default date
//		Thread.sleep(4000);
//		driver.findElement(By.id("react-select-2-input")).click();
//		driver.findElement(By.id("react-select-2-option-4")).click();
//	    driver.findElement(By.xpath("//input[@id='react-select-3-input']")).click();
//	    driver.findElement(By.id("react-select-3-option-10")).click();
//	    Thread.sleep(3000);
//	    driver.findElement(By.xpath("//button[@name='mobilesearch']")).click();
	    
   //***********************************************************************************************************
//   //TC 21 Select any city, default date
//	    driver.findElement(By.id("react-select-2-input")).sendKeys("Pune");
//	    Thread.sleep(1000); // Add a delay of 1 second (adjust as needed)
//	    driver.findElement(By.id("react-select-2-input")).sendKeys(Keys.ENTER);
//	    driver.findElement(By.id("react-select-3-input")).sendKeys("Indore");
//	    Thread.sleep(1000); // Add a delay of 1 second (adjust as needed)
//	    driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
//	    
//		 driver.findElement(By.xpath("//button[@name='mobilesearch']")).click();
	    
	 //*********************************************************************************************************   
	 // TC 22    selecting domestic city by dropdown and random date
//		    Thread.sleep(4000);
//			driver.findElement(By.id("react-select-2-input")).click();
//			driver.findElement(By.id("react-select-2-option-4")).click();
//		    driver.findElement(By.xpath("//input[@id='react-select-3-input']")).click();
//		    driver.findElement(By.id("react-select-3-option-10")).click();
//		   
//		    driver.findElement(By.xpath("//input[@name='departdate' and @placeholder='Onward Date']")).click();
//		 
//		   driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--009']")).click();
//		   
//		    driver.findElement(By.xpath("//input[@name='arrivaldate' and @placeholder='Return Date']")).click();
//		
//		    Thread.sleep(5000);
//			driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day') and @aria-label='Choose Friday, May 12th, 2023']")).click();
//			 Thread.sleep(3000);
//			driver.findElement(By.className("home-heading")).click();  
//		    driver.findElement(By.xpath("//button[@name='mobilesearch']")).click();
	    
	//**************************************************************************************************************	   
    // TC 23 Selecting random city, with random date
	        
//		    driver.findElement(By.id("react-select-2-input")).sendKeys("Pune");
//		    Thread.sleep(1000); // Add a delay of 1 second (adjust as needed)
//		    driver.findElement(By.id("react-select-2-input")).sendKeys(Keys.ENTER);
//		    driver.findElement(By.id("react-select-3-input")).sendKeys("Indore");
//		    Thread.sleep(1000); // Add a delay of 1 second (adjust as needed)
//		    driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
//		    driver.findElement(By.xpath("//input[@name='departdate' and @placeholder='Onward Date']")).click();
//			 
//			driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--009']")).click();
//			   
//			driver.findElement(By.xpath("//input[@name='arrivaldate' and @placeholder='Return Date']")).click();
//			
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day') and @aria-label='Choose Friday, May 12th, 2023']")).click();
//		    
//			 driver.findElement(By.xpath("//button[@name='mobilesearch']")).click();
			 
	//**************************************************************************************************************		
    //TC 24  Selecting random city, with random date, max adult
	    
	    
//	    driver.findElement(By.id("react-select-2-input")).sendKeys("Pune");
//	    Thread.sleep(1000); // Add a delay of 1 second (adjust as needed)
//	    driver.findElement(By.id("react-select-2-input")).sendKeys(Keys.ENTER);
//	    driver.findElement(By.id("react-select-3-input")).sendKeys("Indore");
//	    Thread.sleep(1000); // Add a delay of 1 second (adjust as needed)
//	    driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
//	    driver.findElement(By.xpath("//input[@name='departdate' and @placeholder='Onward Date']")).click();
//		 
//		driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--009']")).click();
//		   
//		driver.findElement(By.xpath("//input[@name='arrivaldate' and @placeholder='Return Date']")).click();
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day') and @aria-label='Choose Friday, May 12th, 2023']")).click();
//	    
//		driver.findElement(By.xpath("//input[@value='1 Passenger']")).click();
//        int i=1;
//        while(i<10)
//        {
//     	
//        driver.findElement(By.xpath("//button[@name='adult' and contains(@class, 'sc-dicizt') and contains(@class, 'eECEbI') and contains(@class, 'btn') and contains(@class, 'quantity-right-plus') and contains(@class, 'border-0')]")).click();
//     	i++;
//        }
//        driver.findElement(By.xpath("//img[@alt='arrowdown' and contains(@class, 'sc-bgqQcB') and contains(@class, 'gFDEWi') and contains(@class, 'ctm-icon') and contains(@class, 'ctm-slct')]")).click();
//		driver.findElement(By.xpath("//button[@name='mobilesearch']")).click();
	    
		//******************************************************************************************************************
	    // TC 25 Selecting random city, with random date, max adult, max infant
	  
//		   driver.findElement(By.id("react-select-2-input")).sendKeys("Pune");
//		    Thread.sleep(1000); // Add a delay of 1 second (adjust as needed)
//		    driver.findElement(By.id("react-select-2-input")).sendKeys(Keys.ENTER);
//		    driver.findElement(By.id("react-select-3-input")).sendKeys("Indore");
//		    Thread.sleep(1000); // Add a delay of 1 second (adjust as needed)
//		    driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
//		    driver.findElement(By.xpath("//input[@name='departdate' and @placeholder='Onward Date']")).click();
//			 
//			driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--009']")).click();
//			   
//			driver.findElement(By.xpath("//input[@name='arrivaldate' and @placeholder='Return Date']")).click();
//			
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day') and @aria-label='Choose Friday, May 12th, 2023']")).click();
//		    
//			driver.findElement(By.xpath("//input[@value='1 Passenger']")).click();
//	        int i=1;
//	        while(i<10)
//	        {
//	     	
//	        driver.findElement(By.xpath("//button[@name='adult' and contains(@class, 'sc-dicizt') and contains(@class, 'eECEbI') and contains(@class, 'btn') and contains(@class, 'quantity-right-plus') and contains(@class, 'border-0')]")).click();
//	        driver.findElement(By.xpath("//button[@class='sc-dicizt eECEbI btn quantity-right-plus' and @data-type='plus']")).click();  
//	     	i++;
//	        }
//	        driver.findElement(By.xpath("//img[@alt='arrowdown' and contains(@class, 'sc-bgqQcB') and contains(@class, 'gFDEWi') and contains(@class, 'ctm-icon') and contains(@class, 'ctm-slct')]")).click();
//			driver.findElement(By.xpath("//button[@name='mobilesearch']")).click();
		
	//***********************************************************************************************************************	
	//TC 26 Selecting random city, with random date, max adult, max child
		
//	    driver.findElement(By.id("react-select-2-input")).sendKeys("Pune");
//	    Thread.sleep(1000); // Add a delay of 1 second (adjust as needed)
//	    driver.findElement(By.id("react-select-2-input")).sendKeys(Keys.ENTER);
//	    driver.findElement(By.id("react-select-3-input")).sendKeys("Indore");
//	    Thread.sleep(1000); // Add a delay of 1 second (adjust as needed)
//	    driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
//	    driver.findElement(By.xpath("//input[@name='departdate' and @placeholder='Onward Date']")).click();
//		 
//		driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--009']")).click();
//		   
//		driver.findElement(By.xpath("//input[@name='arrivaldate' and @placeholder='Return Date']")).click();
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day') and @aria-label='Choose Friday, May 12th, 2023']")).click();
//	    
//		driver.findElement(By.xpath("//input[@value='1 Passenger']")).click();
//		 int i=1;
//	        while(i<9)
//	        {
//	        driver.findElement(By.xpath("//button[@name='child' and contains(@class, 'sc-dicizt') and contains(@class, 'eECEbI') and contains(@class, 'btn') and contains(@class, 'quantity-right-plus') and contains(@class, 'border-0')]")).click();
//	        
//	     	i++;
//	        }
//       driver.findElement(By.xpath("//img[@alt='arrowdown' and contains(@class, 'sc-bgqQcB') and contains(@class, 'gFDEWi') and contains(@class, 'ctm-icon') and contains(@class, 'ctm-slct')]")).click();
//	   driver.findElement(By.xpath("//button[@name='mobilesearch']")).click();  
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}    
	    
	    
	}


