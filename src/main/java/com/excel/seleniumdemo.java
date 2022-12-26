package com.excel;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
public class seleniumdemo {
	public static void main(String[] args) throws InterruptedException {
	//set the path of executable browser driver
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fikerete\\Downloads\\chromewebdriver\\chromedriver.exe");
		//create an object of chromedriver
	//set the system property of chromedriver
	//WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();//parent p= new child(Webdriver is parent and chromedriver is child
		//WebDriver driver1= new RemoteWebDriver();
			
		driver.get("https://google.com");// opening url
		System.out.println(driver.getTitle());// printing tittle 
		//driver.quit();//clsoing browser
		driver.get("https://login.salesforce.com");
		//driver.findElement(By.xpath("//input[@name=username])")).sendKeys("")//for xpath
		//driver.findElement(By.cssSelector("//input[@name=username])")).sendKeys("")//for css
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//locate and user name element and enter emailID
		driver.findElement(By.id("username")).sendKeys("Nov30@tekarch.sandbox");
		//locate a password element and enter password
		driver.findElement(By.name("pw")).sendKeys("Fmadot@2019");
		//locate a login button and click on it
		driver.findElement(By.name("Login")).click();
	
	//driver.quit();
		
	}
}

