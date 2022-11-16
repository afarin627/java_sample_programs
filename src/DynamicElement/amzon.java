package DynamicElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amzon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/ewings/Afreen/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        driver.get("https://www.amazon.com/");
        
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile under 20,000",Keys.ENTER);
	 String price = driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-none a-spacing-top-micro s-price-instructions-style\"])[3]")).getText();
     System.out.println(price);
	
	}

}
