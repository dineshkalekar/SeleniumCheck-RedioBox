package Demo_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURLMethod2 {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.get("https://www.instagram.com/");
			
			String currentURl2=driver.getCurrentUrl();
			
			System.out.println(currentURl2);
			
			

	}

}
