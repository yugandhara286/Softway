package Assignment;

import java.util.List;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.chrome.ChromeDriverService;

public class Flipkart 
{
	public static void main(String[] args) 
	{
		String browserName = "Chrome";
		WebDriver driver = null;
		
		if(browserName.equals("Chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 System.setProperty( ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true"); 
			 driver = new ChromeDriver();
			 System.out.println("Chrome browser launched successfully");
		 }
		driver.get("https://www.flipkart.com/");
		System.out.println("Flipkart open successfully");
		
		//to close the frame
			driver.switchTo().frame().close();
			driver.switchTo().defaultContent();
			
		//to search iphone 12
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input//div[2]")).sendKeys("iphone12 green 128gb");//Search box inputs
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg")).click(); //Search button click functionality
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).click(); //to Open the first item link
		
		//to print phone price
		String IphonePrice = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[4]/div[1]/div/div[1]")).getText(); 
		System.out.println("Price : "+IphonePrice);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[2]/div/div[5]/div[1]/div/button[2]")).click(); //to Increase the quantity by 1
		String BothIphonePrice = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[5]/div/span/div/div/span")).getText(); 
		System.out.println("Price : "+BothIphonePrice);
	}

}
