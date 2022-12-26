package com.excel;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SFDC {
	public static WebDriver driver;
	private static Object actualText;
	static void louchApp(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
	}
	static void TC1() throws InterruptedException  {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Nov30@tekarch.sandbox");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Login']")).click();		
		Thread.sleep(2000);
		String expectedError="please enter your password";
		String actaulError= driver.findElement(By.id("error")).getText();
		if (actaulError.equals(expectedError)) {
			System.out.println("TC1 is passed");
		}else
			System.out.println("TC1 is failed");
	}
	static void TC2() throws InterruptedException {
		String expectedText=" welcome to trial period";
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Nov30@tekarch.sandbox");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Fmadot@2019");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Login']")).click();
			if (actualText.equals(expectedText)) {				
				System.out.println("TC2 is passed");
			}else
			System.out.println("TC2 is failed");
	}
	static void TC3() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Nov30@tekarch.sandbox");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("Fmadot@2019");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='userNavLabel']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='userNav-menuItems']/a[5]")).click();
		Boolean value= driver.findElement(By.id("username")).isDisplayed();
		if (value) {
		System.out.println("signout succesfull and username is on the field");
		}else
		System.out.println("TC3 is failed");
	}
static void TC4A()throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("Nov30@tekarch.sandbox");
		driver.findElement(By.xpath("//*[@id=\'password\']")).clear();
	driver.findElement(By.xpath("//*[@id=\'forgot_password_link\']")).click();
		driver.findElement(By.xpath("//*[@id='header']")).isDisplayed();
		//driver.findElement(By.xpath("//*[@id='un']")).sendKeys("//*[@id='un']");
		//.findElement(By.xpath("//*[@id=\"continue\"]")).click();			
		Boolean value= driver.findElement(By.xpath("//*[@id=\'wrapper\']")).isDisplayed();
		if (value) {
		System.out.println(" Trouble signin email send to reset");
		}else
		System.out.println("TC4A is failed");
	
}
	static void TC4B() throws InterruptedException{
		String expectedError="Your login attempt has failed, please conatct adminitrator";
		driver.findElement(By.id("username")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("22131");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		String actaulError= driver.findElement(By.xpath("//*[@id=\'error\']")).getText();
		Boolean value= actaulError.equals(expectedError);
			if (value) {
				System.out.println("TC4B is pass");
			}else
				System.out.println("TC4B is failed");
			}
	static void TC5() throws InterruptedException{
		driver.findElement(By.id("username")).sendKeys("Nov30@tekarch.sandbox");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Fmadot@2019");	
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		driver.findElement(By.xpath("//*[@id='userNavLabel' ]")).click();
		Boolean value=driver.findElement(By.xpath("//*[@id='userNavMenu']")).isDisplayed();
		if (value) {
		System.out.println("TC5 is passed");
		}else
			System.out.println("TC5 is failed");
}
	static void TC6() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("Nov30@tekarch.sandbox");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Fmadot@2019");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		driver.findElement(By.xpath("//*[@id='userNavLabel' ]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='userNav-menuItems']/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\'chatterTab\']/div[2]/div[2]/div[1]/h3/div/div/a/img")).click();
		driver.findElement(By.xpath("/html/body//*[@id=\'aboutTab\']/a")).click();
		driver.findElement(By.xpath("//*[@id=\'lastName\']")).sendKeys("semma");
		driver.findElement(By.xpath("//*[@id='TabPanel']/div/div[2]/form/div/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("driver.findElement(By.xpath")).isDisplayed();
		driver.findElement(By.xpath("//*[@id=\'publisherAttachTextPost\']/span[1]")).click();
		driver.findElement(By.xpath("/html")).sendKeys("Jesus is lord");
}
	
		static void TC7()throws InterruptedException{
		driver.findElement(By.id("username")).sendKeys("Nov30@tekarch.sandbox");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Fmadot@2019");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		driver.findElement(By.xpath("//*[@id='userNavButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='userNav-menuItems']/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'PersonalInfo\']/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='LoginHistory_font']")).click();
		//driver.findElement(By.xpath("//*[@id=\'RelatedUserLoginHistoryList_body\']/div")).click();
		driver.findElement(By.xpath("//*[@id='DisplayAndLayout']/a")).click();
		driver.findElement(By.xpath("//*[@id='CustomizeTabs_font']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//*[@id='p4']/option[9]")).click(); 
		Boolean value=driver.findElement(By.xpath("//*[@id='duel_select_0']/option[77]")).isDisplayed();
		if (value) {
			System.out.println("TC7 is failed");
		}
		
		}
		static void TC8()  throws	InterruptedException {
			driver.findElement(By.id("username")).sendKeys("Nov30@tekarch.sandbox");
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Fmadot@2019");	
			driver.findElement(By.xpath("//*[@id='Login']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userNavLabel']")).click();
			driver.findElement(By.xpath("//*[@id='userNav-menuItems']/a[3]")).click();
			driver.findElement(By.xpath("//*[@id='ext-gen1361']")).isDisplayed();
			driver.findElement(By.xpath("//*[@id='ext-gen1361']]")).clear();
			// how do we close the developer window browser
			
		}
		static void TC9()  throws	InterruptedException {	
			driver.findElement(By.id("username")).sendKeys("Nov30@tekarch.sandbox");
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Fmadot@2019");	
			driver.findElement(By.xpath("//*[@id='Login']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userNavLabel']")).click();
			driver.findElement(By.xpath("//*[@id='userNav-menuItems']/a[5]")).click();
			Boolean value= driver.findElement(By.xpath("//*[@id='main']")).isDisplayed();
			if (value) {
				System.out.println("TC9 is passed");
			}else
				System.out.println("TC9 is failed");
		}

		static void TC10()  throws	InterruptedException {	
			driver.findElement(By.id("username")).sendKeys("Nov30@tekarch.sandbox");
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Fmadot@2019");	
			driver.findElement(By.xpath("//*[@id='Login']")).click();
			driver.findElement(By.xpath("//*[@id='Account_Tab']/a")).click();
			driver.findElement(By.xpath("//*[@id='createNewButton']")).click();
			driver.findElement(By.xpath("//*[@id=\'bodyCell\']")).isDisplayed();
			driver.findElement(By.xpath("//*[@id=\'acc2\']")).sendKeys("Fiker");
			driver.findElement(By.xpath("//*[@id='bottomButtonRow']/input[1]")).click();
			Boolean value= driver.findElement(By.xpath("//*[@id='contentWrapper']/div[2]")).isDisplayed();
			if (value)
				System.out.println("TC10 is passed");
			}Else
			System.out.println("TC10 is failed");
}
}

		public static void main(String[] args) throws InterruptedException {
		//SFDC.louchApp();
		//SFDC.TC1();
		//SFDC.louchApp();
		//SFDC.TC2();
		//SFDC.louchApp();
		//SFDC.TC3();
    	//SFDC.louchApp();
		//SFDC.TC4A();
		//SFDC.louchApp();
		//SFDC.TC4B();
		//SFDC.louchApp();
		//SFDC.TC5();
		//SFDC.louchApp();
		//SFDC.TC6();
		//SFDC.louchApp();
		//SFDC.TC6();
		//SFDC.louchApp();
		//SFDC.louchApp();
		//SFDC.TC7();
		//SFDC.louchApp();
		//SFDC.TC8();
		//SFDC.louchApp();
		//SFDC.TC9();
		SFDC.louchApp();
		SFDC.TC10();
		}
}

