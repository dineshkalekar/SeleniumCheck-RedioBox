package checkBoxesHandal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class singleCheckBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		
		WebElement pen=driver.findElement(By.xpath("(//input[@value='Pen'])[2]"));
		Boolean value=pen.isSelected();
		if(!value) {
			
			pen.click();
		}

	}

}
