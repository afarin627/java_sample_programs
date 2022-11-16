package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findEle_Drawback {
	public static void main(String[] args) {
		
		
    System.setProperty("webdriver.chrome.driver", "/home/ewings/Afreen/chromedriver_linux64/chromedriver");
    WebDriver driver = new ChromeDriver();
    
    driver.get("https://demo.actitime.com/login.do");
    
    //refreh the page
    
    driver.navigate().refresh();
    
    WebElement UN = driver.findElement(By.id("username"));
    
    UN.sendKeys("admin");
    
	}

}
