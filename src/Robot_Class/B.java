package Robot_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/home/ewings/Afreen/chromedriver_linux64/chromedriver");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.amazon.com/");
	   driver.manage().window().maximize();
	   
	   Robot r = new Robot();
	   
	   r.keyPress(KeyEvent.VK_PAGE_DOWN);
	   r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	   
	   Thread.sleep(5000);
	   
	   r.keyPress(KeyEvent.VK_PAGE_DOWN);
	   r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	   
	   
	
	}

}
