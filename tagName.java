package Demo_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement email2=driver.findElement(By.name("email"));
		email2.sendKeys("dineshkalekar33@gmail.com");
	
		WebElement pass2=driver.findElement(By.name("pass"));
		pass2.sendKeys("Sunnydinu@33");
		
		WebElement tagname=driver.findElement(By.tagName("button"));
		tagname.click();

	}

}
