package Demo_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethod {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String title=driver.getTitle(); // getTitle method Save in String variable
	System.out.println(title);
	
	String ExpectedTitle="Facebook – log in or sign up";
	
	if(ExpectedTitle.equals(title)) // Verifying title 
	{
		System.out.println("Test case Pass");
	}else
		System.out.println("Test case fail");
	
	
		
	
}
}
