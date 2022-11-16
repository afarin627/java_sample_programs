package DynamicElement;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/ewings/Afreen/chromedriver_linux64/chromedriver");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	    driver.get("https://www.flipkart.com/");
		//click on cancel btn
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//search for mobiles
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles under 20000",Keys.ENTER);
	    //print the price of first mobile
		String price = driver.findElement(By.xpath("//div[@class='col col-5-12 nlI3QM']/descendant::div[3]")).getText();
		System.out.println(price);
	}

}
