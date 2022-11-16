package SelePractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/home/ewings/Afreen/chromedriver_linux64/chromedriver");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.amazon.com/");
		   driver.manage().window().maximize();
		   
		  TakesScreenshot ts = (TakesScreenshot)driver;
		  File src = ts.getScreenshotAs(OutputType.FILE);
		  File dest = new File("/home/ewings/Afreen/amazon.jpg");
		  
		  Files.copy(src, dest);
	}

}
