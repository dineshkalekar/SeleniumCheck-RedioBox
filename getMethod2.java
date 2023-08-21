package Demo_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethod2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
		
		driver.get("https://www.angelone.in/login/");
		
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String CurrentURL=driver.getCurrentUrl();
		
		System.out.println(CurrentURL);
		
		String  ExpectedURl="https://kite.zerodha.com/";
		
		if(ExpectedURl.equals(CurrentURL)) {
			System.out.println("My Test Case is Pass");
		}else
			System.out.println("My Test case Is failed");

		String PageSource=driver.getPageSource();
		System.out.println(PageSource);
		
		driver.close();
		
		
		
	}

}
