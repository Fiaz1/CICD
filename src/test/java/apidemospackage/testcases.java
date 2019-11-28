package apidemospackage;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.remote.MobileCapabilityType;


import pageObjects.AppObjects;

import static java.time.Duration.ofSeconds;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
 
import java.net.URL;

public class testcases extends apidemobase {
	@Test
//-----------------------------------------------LIVE TV Section-------------------------------------------------------//
	public void tc_one() throws MalformedURLException, InterruptedException {     

			AndroidDriver<AndroidElement> driver=Capabilities();

			  AppObjects ap=new AppObjects(driver);
			  
			  WebDriverWait optionswait1 = new WebDriverWait(driver, 30);
			  optionswait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Views']")));
			  
			  ap.selectoption1.get(8).click();
			  
			  WebDriverWait optionswait2 = new WebDriverWait(driver, 30);
			  optionswait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='7. Fragment']")));
			  ap.selectoption1.get(2).click();
			  
			  ap.checkbox.click();
			  ap.wifisetting.click();
			  ap.editfield.sendKeys("QA Derpartment");
			  ap.okbutton.click();
			  
			  
	
	
	}
	}
