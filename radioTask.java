package radioBoxHandal;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radioTask {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

		// launched url
		driver.get("http://omayo.blogspot.com/");
		
	     List<WebElement>radioBox=driver.findElements(By.xpath("//input[@id='radio2']")); //List Allowed Dublicat String 
	     
	     

	}

}
