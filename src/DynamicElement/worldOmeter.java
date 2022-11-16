package DynamicElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class worldOmeter {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","/home/ewings/Afreen/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        driver.get("https://www.worldometers.info/coronavirus/country/uk");
       String corona_case = driver.findElement(By.xpath("(//div[@class=\"maincounter-number\"])[1]")).getText();
       System.out.println(corona_case);
       
      String recoverd = driver.findElement(By.xpath("(//div[@class=\"maincounter-number\"])[3]")).getText();
      System.out.println(recoverd);
	}

}
