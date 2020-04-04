package loans;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalLoantTest {

	WebDriver driver;
	
	@Test
	public void loanCal() throws InterruptedException {   
		
        //1. Open chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//2. Navigate to https://moneyfacts.co.uk/loans/loan-calculator/ url
		driver.get("https://moneyfacts.co.uk/loans/loan-calculator/");  
		
		//3. Enter Amount you wish to borrow
		driver.findElement(By.id("loansRepaymentCalculatorAmountToBorrow")).sendKeys("1000");
		
		//4. Enter how many month
		driver.findElement(By.id("loansRepaymentCalculatorNumberOfMonths")).sendKeys("11");
		
		//5. Enter APR Interest Rate annually
		driver.findElement(By.id("loansRepaymentCalculatorInterestRate")).sendKeys("50");
		
		Thread.sleep(3000);  
		//6. Click Calculate
		driver.findElement(By.id("loansRepaymentCalculatorCalculate")).click(); 
		
		driver.quit();
    }
}