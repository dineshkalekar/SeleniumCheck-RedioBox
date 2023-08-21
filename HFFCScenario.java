package Demo_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HFFCScenario {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		
		String CurrentURl=driver.getCurrentUrl();
		System.out.println(CurrentURl);
		
		String Expectedtitle="HDFC Bank – Personal Banking & Netbanking Services ";
		
		if(title.equals(title)) 
		{
			System.out.println("working");
			
			System.out.println("Test Case Pass");
			
		}else
			System.out.println("Test case failed");
		
		driver.close();
		
	
	}

}
