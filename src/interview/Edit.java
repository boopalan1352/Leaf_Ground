package interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "chromedriver");
		  driver= new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		  driver.get("http://www.leafground.com/");
		  driver.findElement(By.xpath("//*[@class='wp-categories-icon svg-image']")).click();
//		  driver.findElement(By.xpath("//*[@id='email']")).sendKeys("demodemo");
//		  driver.findElement(By.xpath("//*[@class='large-6 small-12 columns']//following::input[2]")).sendKeys("demo");
		  String text1=driver.findElement(By.xpath("//*[@class='large-6 small-12 columns']//following::input[3]")).getText();
		  System.out.println(text1);
//		  driver.findElement(By.xpath("//*[@class='large-6 small-12 columns']//following::input[4]")).clear();
//		  Boolean text2=driver.findElement(By.xpath("//*[@class='large-6 small-12 columns']//following::input[5]")).isEnabled();
//		  System.out.println(text2);
		  Thread.sleep(5000);
		  driver.quit();
	}
	
}
