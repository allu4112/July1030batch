import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class AddDetails {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Optimus\\eclipse-workspace\\Snapdeal\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.snapdeal.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		WebElement item = d.findElement(By.xpath("//input[@id='inputValEnter']"));
		item.sendKeys("i phone 6");
		WebElement button1 = d.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		button1.click();
		WebElement iphone = d.findElement(By.xpath("//p[text()='Apple iphone 6s plus ( 16GB , 2 GB ) Gold']"));
		iphone.click();
		
		String parent = d.getWindowHandle();
		Set<String> child = d.getWindowHandles();
		System.out.println(parent+"\n"+child);
		for (String x : child) {
			if(!x.equals(parent));
			d.switchTo().window(x);
			
		}
		Thread.sleep(3000);
	WebElement k = d.findElement(By.xpath("//span[text()='add to cart']"));
	k.click();
	
	
	
	
	
	
	}
	
	
	
	
 

}
