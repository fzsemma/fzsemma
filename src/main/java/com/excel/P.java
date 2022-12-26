package com.excel;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class P {
	
	
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://login.salesforce.com");
			driver.findElement(By.id("username")).sendKeys("Nov30@tekarch.sandbox");
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("");
			driver.findElement(By.name("password")).sendKeys("Fmadot@2019");
			driver.findElement(By.name("Login")).click();
			
		}
}
//	static void TC2() {
//	String expectedText=" welcome to trial period";
//		driver.get("https://login.salesforce.com");
//		driver.findElement(By.id("username")).sendKeys("Nov30@tekarch.sandbox");
//		driver.findElement(By.name("password")).sendKeys("Fmadot@2019");
//		driver.findElement(By.id("login")).click();
//		
//		if (actaulText.equals(expectedText)) {
//			System.out.println("TC2 is passed");
//			
//		}else
//			System.out.println("TC2 is failed");
//	}
//	static void TC3() throws InterruptedException {
//		driver.get("https://login.salesforce.com/");
//		driver.findElement(By.id("usename")).sendKeys("Nov30@tekarch.sandbox");
//		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("");
//		driver.findElement(By.name("password")).sendKeys("Fmadot@2019");
//		driver.findElement(By.xpath("//*[@id='login_form']/div[4]/label")).click();
//		driver.findElement(By.xpath("//*[@id='userNavLabel']")).click();
//		driver.findElement(By.xpath("//*[@id='userNav-menuItems']/a[5]")).click();
//
//		Boolean value= driver.findElement(By.id("username")).isDisplayed();
//		if (value) {
//		System.out.println("signout succesfull and username is on the field");
//		}else
//		System.out.println("TC3 is failed");
//	}
//	
//		static void TC4A()throws InterruptedException {
//			driver.findElement(By.id("username")).sendKeys("Nov30@tekarch.sandbox");
//			driver.findElement(By.name("password")).clear();
//			driver.findElement(By.name("//*[@id='forgot_password_link]'")).click();
//			driver.findElement(By.className("//*[@id='header']")).isDisplayed();
//			driver.findElement(By.id("//*[@id='un']")).sendKeys("//*[@id='un']");
//			driver.findElement(By.id("//*[@id=\"continue\"]")).click();			
	//Boolean value= driver.findElement(By.id("passge reset message")).isDisplayed();
//			if (value) {
//			System.out.println(" email send to associated with account to resest");
//			}else
//				System.out.println("TC4A is failed");
//		}
//	
//		
//			static void TC4B() throws InterruptedException{
//			String expectedError="Your login attempt has failed, please conatct adminitrator";
//			driver.findElement(By.id("username")).sendKeys("123");
//			driver.findElement(By.id("passwrwod")).sendKeys("22131");
//			driver.findElement(By.xpath("//*[@id='Login']")).click();
//			String actaulError= driver.findElement(By.xpath("//*[@id='error']")).getText();
//			Boolean value= actaulError.equals(expectedError);
//				if (value) {
//					System.out.println("TC4B is pass");
//				}
//				 else
//			
//					System.out.println("TC4B is failed");}
//				static void TC5() throws InterruptedException{
//					driver.findElement(By.id("username")).sendKeys("Nov30@tekarch.sandbox");
//					driver.findElement(By.name("password")).sendKeys("Fmadot@2019");	
//					driver.findElement(By.xpath("//*[@id='Login']")).click();
//					driver.findElement(By.xpath("//*[@id='userNavLabel' ]")).click();
//					Boolean value=driver.findElement(By.xpath("//*[@id='userNavMenu']")).isDisplayed();
//					if (value) {
//					System.out.println("TC5 is passed");
//					}else
//						System.out.println("TC5 is failed");
//			}
//			static void TC6() throws InterruptedException {
//				driver.findElement(By.id("username")).sendKeys("Nov30@tekarch.sandbox");
//				driver.findElement(By.name("password")).sendKeys("Fmadot@2019");
//				driver.findElement(By.xpath("//*[@id='userNavLabel]")).click();
//			}
		

			
			
			