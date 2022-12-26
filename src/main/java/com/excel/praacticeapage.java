package com.excel;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class praacticeapage {

	public static void main(String[] args, String firstTab) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("---diable notification);
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://selenium-prd.firebaseapp.com/");
		Thread.sleep(5000);
	if(driver.findElement(By.id("email_field")).isDisplayed()){
		Thread.sleep(3000);
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
		driver.findElement(By.id("password_field")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login_div\"]/button")).click();
	}else {
		System.out.println("username is not visible");
	}
	driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[1]/a[1]")).click();
	//example:JS Executor
	WebElement button= driver.findElement(By.xpath("//*[@id=\"login_div\"]/button")).click();
	driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[1]/a[1]")).click();
	WebElement tom= driver.findElement(By.xpath("//*['@id=\"drag1\']"));
	
	Actions action= new Actions(driver);
	action.clickAndHold(tom).moveToElement(driver.findElement(By.xpath("//*[@id='div1']"))).build().perform();
	action.dragAndDrop(tom, tom);
	//Robot r= new Robot();
	//r.keyPress(KeyEvent.VK_ENTER);
	
	
	//example:JS Executor
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window scrollby(0,700);");
	js.executeScript("alert('welcome to JAVA');)");
	js.executeScript("arguments(o).click();",button);
	js.executeScript("argument(0),value='mithun@gmail.com';",button);
	Robot r= new Robot();
	r.
	
	
	WebElement interaction= driver.findElement(By.xpath("(//button[@class='dropbtn'])[1]"));
	 Actions action= new Actions(driver);
	action.moveToElement(interaction).build().perform();
	
	driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[1]/a[2]")).click();
	driver.findElement(By.xpath("//*[@id='user_div']/div[2]/a[2]/button")).click();

	// window handles 
	Set<String> WindowID= driver.getWindowHandles();
	Iterator<String> itr= WindowID.iterator();
	String secondtab="";
	System.out.println(WindowID);
	while( itr.hasNext()) {
		System.out.println(itr.next());
		firstTab= itr.next();
		secondtab=itr.next();
	}
	// to return window 
	//driver.switch().parentframe();
	driver.switchTo().window(secondtab);
	driver.findElement(By.name("q")).sendKeys("selenium");
	
	driver.switchTo().window(firstTab);
	driver.close();
	
	 //iframe
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='contactInfocontentId']")));
	
	driver.switchTo().parentFrame();
	}
	
}
 
	
	
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[1]/a[1]")).click();
		
		//dropdown handling
				//Select s= new Select(driver.findElement(By.id("city")));
				//s.selectByIndex(2);
		//Mouse hover
				//WebElement interaction= driver.findElement(By.xpath("(//button[@class='dropbtn'])[1]"));
				 //Actions action= new Actions(driver);
				//action.moveToElement(interaction).build().perform();
				//Thread.sleep(2000);
				//driver.quit();
		// Alert handling 
				//driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[1]/div[1]/button")).click();
				//driver.findElement(By.xpath("//*[@id=\'user_div\']/div[2]/div/button[1]")).click();
				//Thread.sleep(3000);
				//Alert
				//driver.switchTo().alert().accept();
				//driver.switchTo().alert().sendKeys("XYZ");
				//Thread.sleep(5000);
				
				//driver.quit();
				
				
		//Explicit wait
				//WebDriverWait  wait = new WebDriverWait(driver, 30);
				//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("XYZ"))));

	

	