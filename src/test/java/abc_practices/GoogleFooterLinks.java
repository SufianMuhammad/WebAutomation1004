package abc_practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFooterLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		/*System.setProperty("webdriver.chrome.driver", "C:/Users/ACER/Desktop/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Privacy")).click();
		*/Thread.sleep(2000);
		
		

		/*System.setProperty("webdriver.chrome.driver", "C:/Users/ACER/Desktop/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Terms")).click();
		*/Thread.sleep(2000);
	
		

		System.setProperty("webdriver.chrome.driver", "C:/Users/ACER/Desktop/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Settings")).click();
		Thread.sleep(2000);
	
		
		Thread.sleep(12000);
		driver.close();
		
		
		
	}

}
