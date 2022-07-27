package Week3;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			// We have to call WDM for the browser driver !!
			WebDriverManager.chromedriver().setup(); // verify the version, download, set up !
			
			// Launch the browser (chrome)
			ChromeDriver driver = new ChromeDriver();
			
			// Load the URL 
			driver.get("http://www.leafground.com/pages/Dropdown.html");
				
			// Maximize the browser 
			driver.manage().window().maximize();
			
			
			// Find the first dropdown
			WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
			
			// Convert to Select (Class)
			Select select = new Select(dropdown1);
			
			// Print how many Options are available
			List<WebElement>options=select.getOptions();
		}
	}
	
