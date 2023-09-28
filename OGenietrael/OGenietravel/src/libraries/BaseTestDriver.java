package libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;
import testData.TestDataReader;



public class BaseTestDriver  {
	
	// make the path dynamic
	// get the browser from properties file

	
	public static Properties prop;
	public static WebDriver driver;
	
 //  public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentTest childTest;

	
	
	// Initialize the driver
	public void driverInitialization() {
		
	
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\chromedriver.exe");
    	ChromeOptions options = new ChromeOptions();	
		
		WebDriverManager.chromedriver().create();
	    driver = new ChromeDriver();
        driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://bial.genietalk.ai");
		
		
		
	}
	
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
//	 public void handleAlertAndQuit() throws InterruptedException {
//	  Thread.sleep(4000);      try {
//	        	Alert al = driver.switchTo().alert(); 
//	    		System.out.println("Message:Request flight is not longer available.Please try different flight:"+al.getText());
//	            al.accept();
//	            driver.quit();
//	        } catch (Exception e) {
//	            System.out.println("No alert found. Proceeding to the next step.");
//	        }
//	    }
	
	 

	// get the data from property file to 'prop' object.
//	public void readPropertyFile() {
//		try {
//			//
//			FileInputStream propFile = new FileInputStream("C:\\Users\\hp\\BialFlightBooking\\src\\main\\java\\com\\bial\\qa\\config\\config.properties");
//			prop = new Properties();
//			prop.load(propFile);
//		} catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//	}
	
	
	//Setup extend report v4
//	public void setExtentReport() {
//		 
//		  htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/extentReports/bialFunctionalTestReport.html");
//		  htmlReporter.config().setDocumentTitle("Bial Automation Report"); // Title
//		  htmlReporter.config().setReportName("Functional Testing"); // Report Name
//		  htmlReporter.config().setTheme(Theme.DARK);
//		  
//		  extent = new ExtentReports();
//		  extent.attachReporter(htmlReporter);
//		  
//		  extent.setSystemInfo("Host name", "localhost");
//		  extent.setSystemInfo("Environemnt", "QA");
//		  extent.setSystemInfo("user", "Neeraj");
//		
//}
	
	
	
	
}

