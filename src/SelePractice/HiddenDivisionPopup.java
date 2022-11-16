package SelePractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/home/ewings/Afreen/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://chercher.tech/practice/hidden-division-popup");
		
		driver.findElement(By.xpath("//a[@class='cd-popup-trigger']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hidden Division Text");
	}

}