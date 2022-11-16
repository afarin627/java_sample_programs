package SelePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/ewings/Afreen/chromedriver_linux64/chromedriver");
		 WebDriver driver = new ChromeDriver();
				
		 driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		  Thread.sleep(4000);

		driver.switchTo().frame("packageListFrame");
		String text1= driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
		System.out.println(text1);
		 Thread.sleep(4000);
		 
		 driver.switchTo().defaultContent();
		 
		driver.switchTo().frame("packageFrame");
		 Thread.sleep(4000);
		String text2 = driver.findElement(By.xpath("//a[text()='AddHasCasting']")).getText();
		 Thread.sleep(4000);
		System.out.println(text2);
		
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame("classFrame");
		 Thread.sleep(4000);
		String text3 = driver.findElement(By.xpath("//span[text()='Interface Summary']")).getText();
		 Thread.sleep(4000);
		System.out.println(text3);
		 
	}

}
