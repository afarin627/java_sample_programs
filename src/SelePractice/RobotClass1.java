package SelePractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/ewings/Afreen/chromedriver_linux64/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.youtube.com/");
        
        Robot r= new Robot();
        r.keyPress(KeyEvent.VK_PAGE_DOWN);
        r.keyRelease(KeyEvent.VK_PAGE_DOWN);
        Thread.sleep(3000);
        r.keyPress(KeyEvent.VK_PAGE_DOWN);
        r.keyRelease(KeyEvent.VK_PAGE_DOWN);
        
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_PAGE_DOWN);
        r.keyRelease(KeyEvent.VK_PAGE_DOWN);
        
        driver.manage().window().maximize();
       
        		
	}

}
