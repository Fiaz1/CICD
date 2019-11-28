package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AppObjects {
	
	public AppObjects(AppiumDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="android:id/text1")
	public List<WebElement> selectoption1;
	
	
	@AndroidFindBy(id="android:id/text1")
	public List<WebElement> selectoption2;
	
	
	@AndroidFindBy(className="android.widget.CheckBox")
	public WebElement checkbox; 
	
	@AndroidFindBy(xpath = ".//*[@text='WiFi settings']")
	public WebElement wifisetting;
	
	
	@AndroidFindBy(id="android:id/edit")
	public WebElement editfield;
	
	@AndroidFindBy(xpath=".//*[@text='OK']")
	public WebElement okbutton;

	}
