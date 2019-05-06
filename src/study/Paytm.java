package study;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Paytm {

	
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		 System.setProperty("webdriver.chrome.driver", "E:\\Client_Study\\Selenium_Basic\\All_driver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.get("https://paytm.com/");
	        
           driver.findElement(By.xpath("//a[@title='Bus']//img[@class='_1s60']")).click();
           Thread.sleep(2000);
           
           driver.findElement(By.xpath("//div[@class='fl-input-container _9KqY']//div[@class='_2k43']")).click();
           Thread.sleep(2000);
           
           WebElement element =driver.findElement(By.xpath("//div[@class='react-datepicker']//a"));
           Actions action = new Actions(driver);
           
       	
           action.moveToElement(element).moveByOffset(250,0).click().build().perform();
           
           Thread.sleep(5000);
           System.out.println("Got it ans");
           //MoveByOffset(124, 0).Click().Build().Perform();
           

	}

}
