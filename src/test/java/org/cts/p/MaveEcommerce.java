package org.cts.p;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.dom4j.dom.DOMNodeHelper.EmptyNodeList;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class MaveEcommerce {
//	static WebDriver  driver;/
	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://www.mwave.com.au/");
//		WebDriverWait driverWait = new WebDriverWait(driver, 20);
//		driver.findElement(By.xpath("//*[text()='No Thanks']")).click();
//		driver.findElement(By.xpath("https://www.mwave.com.au/")).sendKeys("laptoop");
//		driver.findElement(By.xpath("//*[@src='/content/img/magnifying-glass.png']")).submit();

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("enter no");
//		String nextLine = scanner.nextLine();
//		try {
//			Long.parseLong(nextLine);
//			int length = nextLine.length();
//			System.out.println(length);
//			
//		} catch (Exception e) {
//			System.out.println("invalid no");
//		}

		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("govindasrini");
		driver.findElement(By.id("password")).sendKeys("srini@123");
		driver.findElement(By.id("login")).click();
		WebElement findElement = driver.findElement(By.xpath("//b[contains(text(),'Invalid ')]"));
		Assert.assertEquals(findElement, "Invalid Login details or Your Password might have expired.");

//		WebElement findElement = driver.findElement(By.xpath("//option[text()='Google']"));
//		Select select = new Select(findElement);
//		select.selectByVisibleText("Google");
//		WebElement findElement2 = driver.findElement(By.xpath("//select[@id='first']"));
//		Select select2 = new Select(findElement2);
//		List<WebElement> options = select2.getOptions();
//		for (int i = 0; i <= options.size(); i++) {
//			WebElement webElement = options.get(i);
//			boolean selected = webElement.isSelected();
//			String valueOf = String.valueOf(selected); 
//			System.out.println(valueOf);
//
//		}
	}

}
