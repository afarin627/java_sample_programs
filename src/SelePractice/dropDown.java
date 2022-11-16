package SelePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
 System.setProperty("webdriver.chrome.driver", "/home/ewings/Afreen/chromedriver_linux64/chromedriver");
 WebDriver driver = new ChromeDriver();
		
 driver.get("https://www.facebook.com/");
  Thread.sleep(1000);
  
  driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
 Thread.sleep(2000);
 
 WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
 Select s = new Select(day);
 Thread.sleep(2000);
 s.selectByValue("6");
 Thread.sleep(1000); 
 
 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
 Select s1=new Select(month);
 Thread.sleep(1000);
 s1.selectByVisibleText("Aug");
 Thread.sleep(1000);
 
 WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
 Select s2=new Select(year); 
 Thread.sleep(2000);
 s2.selectByVisibleText("1997");
	}

}
