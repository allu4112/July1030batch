package org.tst;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

       public class Data1 {
		static WebDriver d;
		
		@BeforeClass
		public static void beforeClass() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Optimus\\eclipse-workspace\\Emplo\\lib\\chromedriver.exe");
			d=new ChromeDriver();
			d.get("http://demo.automationtesting.in/Register.html");
		}
		
		@Test
		public void test() {
			Assert.assertTrue("verify the URL", d.getCurrentUrl().contains("automationtesting"));
			Assert.assertTrue("verify the Title", d.getTitle().contains("Register"));

			WebElement firstName = d.findElement(By.className("//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched']"));
			firstName.sendKeys("Mohamed");
			WebElement lastName = d.findElement(By.xpath("(//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required'])[1]"));
			lastName.sendKeys("Althaf");
			WebElement address = d.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
		    address.sendKeys("labour colony guindy");
		    WebElement email = d.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']"));
		    email.sendKeys("mdallu@gmail.com");
		    WebElement phone = d.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']"));
		    phone.sendKeys("8754323776");

			}
		@Before
		public void befor() {
			Date date=new Date();
			System.out.println(date);
		}
		@After
		public void afterr() {
			Date date=new Date();
			System.out.println(date);
		}
		@AfterClass
		public static void after() throws InterruptedException {
			Thread.sleep(3000);
			d.quit();
		}
		
	}
