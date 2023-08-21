package checkBoxesHandal;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxTask {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		// launched url
		driver.get("https://total-qa.com/checkbox-example/");
		
		//Store in A Box
		List<WebElement> CheckBox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		
		for(int i=0;i<CheckBox.size();i++) {
			
			WebElement oneByOne=CheckBox.get(i);
			
			boolean optioncondition=oneByOne.isSelected();
			
			//if condition false then select it
			if(optioncondition==false) {
				
				// select of element 
				oneByOne.click();
				
			} 
			
		}
		

	}

}
