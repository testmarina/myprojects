package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class expidia {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
//Custom search flight from Houston TX to London UK
		driver.get("https://www.expedia.com//");
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		driver.findElement(By.id("flight-type-one-way-label-hp-flight")).click();
		
		
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id='traveler-selector-hp-flight']/div/ul/li/button")).click();
		
			int i=1;
			while(i<5)
		    {
			driver.findElement(By.xpath("//*[@id='traveler-selector-hp-flight']/div/ul/li/div/div/div/div[1]/div[4]/button")).click();
			i++;
		    }
			for(int i1=1;i1<2;i1++)
			{
				driver.findElement(By.xpath("//*[@id='traveler-selector-hp-flight']/div/ul/li/div/div/div/div[2]/div[1]/div[4]/button")).click();
			}
	
			driver.findElement(By.id("flight-age-select-1-hp-flight")).click();
			driver.findElement(By.xpath("//*[@id='flight-age-select-1-hp-flight']/option[4]")).click();
				
			driver.findElement(By.id("flight-advanced-options-hp-flight")).click();
			driver.findElementById("flight-advanced-preferred-airline-hp-flight").click();
			driver.findElementByXPath("//*[@id=\"flight-advanced-preferred-airline-hp-flight\"]/option[47]").click();		  
			  
			driver.findElementById("flight-advanced-preferred-class-hp-flight").click();
		  
			driver.findElementById("flight-departing-single-hp-flight").sendKeys("09/12/2020");
		  
			driver.findElement(By.xpath("//input[@id='flight-origin-hp-flight']")).sendKeys("HOUSTON");
			Thread.sleep(2000L);
			driver.findElement(By.xpath("//input[@id='flight-origin-hp-flight']")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("//input[@id='flight-origin-hp-flight']")).sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//input[@id='flight-destination-hp-flight']")).sendKeys("LONDON");
			Thread.sleep(2000L);
			driver.findElement(By.xpath("//input[@id='flight-destination-hp-flight']")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("//input[@id='flight-destination-hp-flight']")).sendKeys(Keys.ENTER);
			
			//search result
			driver.findElementByXPath("//*[@id=\"gcw-flights-form-hp-flight\"]/div[7]/label/button").click();
			Thread.sleep(2000L);
			System.out.println(driver.findElementById("titleBar").getText());
	}

}
	
