package apidemospackage;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.model.Log;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import junit.framework.Assert;
//import pageObjects.AppObjects;

import static java.time.Duration.ofSeconds;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class mixed {
//	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException
//	{
//		File file = new File("src");
//		File location = new File(file,"ApiDemos-debug.apk");
//		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel2");
//		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
//		cap.setCapability(MobileCapabilityType.APP, location.getAbsolutePath());
//		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
//		return driver;
//	}
//	@Test
//	//-----------------------------------------------APi Demo-------------------------------------------------------//
//	public void tc_one() throws MalformedURLException, InterruptedException {     
//
//		AndroidDriver<AndroidElement> driver=Capabilities();
//		WebDriverWait optionswait1 = new WebDriverWait(driver, 30);
//		optionswait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Views']")));
//		driver.findElements(By.id("android:id/text1")).get(8).click();
//		WebDriverWait optionswait2 = new WebDriverWait(driver, 30);
//		optionswait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='7. Fragment']")));
//		driver.findElements(By.id("android:id/text1")).get(2).click();
//
//		WebDriverWait optionswait3 = new WebDriverWait(driver, 30);
//		optionswait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='WiFi']")));
//
//		driver.findElement(By.id("android:id/checkbox")).click();
//		driver.findElement(By.xpath("//*[@text='WiFi settings']")).click();
//
//		WebDriverWait optionswait4 = new WebDriverWait(driver, 30);
//		optionswait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='WiFi settings']")));
//
//		driver.findElement(By.id("android:id/edit")).sendKeys("QA Department"); 
//		driver.findElement(By.xpath("//*[@text='OK']")).click(); 
//
//		//assertion
//
//		WebDriverWait optionswait5 = new WebDriverWait(driver, 30);
//		optionswait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='WiFi settings']")));
//
//		driver.findElement(By.xpath("//*[@text='WiFi settings']")).click();
//
//		WebDriverWait optionswait6 = new WebDriverWait(driver, 30);
//		optionswait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='QA Department']")));
//		String lastText=    driver.findElement(By.xpath("//*[@text='QA Derpartment']")).getText();
//
//		Assert.assertEquals("QA Department", lastText);
//	}
//	public void tc_two() throws InterruptedException
//	{	
//		Assert.assertFalse(true, "fail test");
//	}
//	public void tc_three() throws InterruptedException
//	{	
//		Assert.assertFalse(false, "passed test");
//	}
	@Test
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException
	{			
		File allureDir = new File("allure-results");
		DeleteAllure.deleteDir(allureDir);
		
		File file = new File("src");
		File location = new File(file,"ApiDemos-debug.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel2");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		cap.setCapability(MobileCapabilityType.APP, location.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	//	return driver;
		Assert.assertFalse(false, "fail test");
		return driver;
	}
	@Test
	//-----------------------------------------------APi Demo-------------------------------------------------------//
	public void tc_one() throws MalformedURLException, InterruptedException 
	{     
		AndroidDriver<AndroidElement> driver=Capabilities();

		WebDriverWait optionswait = new WebDriverWait(driver, 30);
		optionswait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Views']")));


		driver.findElements(By.id("android:id/text1")).get(8).click();

		optionswait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='7. Fragment']")));
		driver.findElements(By.id("android:id/text1")).get(2).click();

		optionswait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='WiFi']")));

		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("//*[@text='WiFi settings']")).click();

		optionswait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='WiFi settings']")));

		driver.findElement(By.id("android:id/edit")).sendKeys("QA Department"); 
		driver.findElement(By.xpath("//*[@text='OK']")).click(); 

		//assertion
		
		optionswait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='WiFi settings']")));
		
		
		driver.findElement(By.xpath("//*[@text='WiFi settings']")).click();

		optionswait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='QA Department']")));
		String lastText=    driver.findElement(By.xpath("//*[@text='QA Department']")).getText();

		Assert.assertEquals("QA Department", lastText);
	}
	@Test
	public void tc_two() throws InterruptedException
	{	
//		Assert.assertFalse(false, "fail test");
		assertTrue(true);

	}
	@Test
	public void tc_three() throws InterruptedException
	{	
//		Assert.assertFalse(false, "fail test");
		assertTrue(true);

	}
	@Test
	public void tc_four() throws InterruptedException
	{	
//		Assert.assertFalse(false, "fail test");
		assertTrue(true);

	}
	@Test
	public void tc_five() throws InterruptedException
	{	
//		Assert.assertFalse(false, "fail test");
		assertTrue(true);

	}
	@Test
	public void tc_six() throws InterruptedException, MalformedURLException
	{	
//		Assert.assertFalse(false, "fail test");
		AndroidDriver<AndroidElement> driver=Capabilities();
		
		
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(f, new File("D:\\Appium-Setups\\apidemo\\allure-results\\Test.png"));
		}
		catch (Exception ex) 
		{
			System.out.println("Exception " + ex.toString());
		}
		assertTrue(false);
	}
	
	
	
}
