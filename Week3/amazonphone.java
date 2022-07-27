package Week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonphone {

	private static final String Duration = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// We have to call WDM for the browser driver !!
				WebDriverManager.chromedriver().setup(); // verify the version, download, set up !

				// Launch the browser (chrome)
				ChromeDriver driver = new ChromeDriver();

				// Load the URL 
				driver.get("https://amazon.in");
						
				// Maximize the browser 
				driver.manage().window().maximize();

				// Type phones -> id: twotabsearchtextbox
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones", Keys.ENTER);
				
				// Print price of every phone
				List<WebElement> allPhoneElements = driver.findElements(By.className("a-price-whole"));
				 
				List<Integer> phonePrices = new ArrayList<Integer>();
				for (int i = 0; i < allPhoneElements.size(); i++) {
					System.out.println(allPhoneElements.get(i).getText());
					String priceStr = allPhoneElements.get(i).getText().replace(",", "");
					int price = Integer.parseInt(priceStr);
					phonePrices.add(price);
				}

		Collections.sort(phonePrices);
				System.out.println(phonePrices.get(0));
}
}