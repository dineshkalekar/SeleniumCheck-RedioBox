package Demo_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {
 public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	// driver.get("https://www.demo.guru99.com/V4/");
	
	 String WebSit="https://www.demo.guru99.com/V4/"; 
	
	 driver.get(WebSit);
	 
	 String title=driver.getTitle();
	 System.out.println(title);
	 
	 driver.findElement(By.name("uid")).sendKeys("mngr518775");
	 
	 driver.findElement(By.name("password")).sendKeys("nAqepYd");
	 
	 driver.findElement(By.name("btnLogin")).click();
		
	    //driver.close();
		
//		driver.get("https://www.facebook.com/");
//		
//		String currentURl=driver.getCurrentUrl();
//		
//		String ExpectedURL="https://www.facebook.com/";
//		
//		if(currentURl.equals(ExpectedURL)) {
//			System.out.println("Test Case pass");
//		}else
//			System.out.println("Test case Fail");
//		
}
}
