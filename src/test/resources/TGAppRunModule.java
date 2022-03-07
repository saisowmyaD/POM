package com.TGApp.Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.TRUGlobal.genericUtility.webDriverUtility;

/**
 * 
 * @author TG1719
 *
 */
public class TGAppRunModule
{
	@Test
	public void VerifiHomePage() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "../POM/src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		webDriverUtility wb=new webDriverUtility();
		wb.waitUntilPageLoad(driver);
		driver.get("https://10.60.20.8/tgaprdv9/");
		
		LoginPage ln=new LoginPage(driver);
		ln.getUserNameTextLink().sendKeys("QA_TEST_USER");
		ln.getUserPasswordTextLink().sendKeys("qtU63432");
		ln.getLoginButtonLink().click();
		
		MyDSR dsr=new MyDSR(driver);
		dsr.getMenuLink().click();
		dsr.getMyProfileLink().click();
		Thread.sleep(4000);
		dsr.getMenuLink().click();
		dsr.getQuickSearcheLink().click();
		Thread.sleep(4000);
		dsr.getMenuLink().click();
		dsr.getMyTaskLink().click();
		Thread.sleep(4000);
		dsr.getMenuLink().click();
		Thread.sleep(4000);
		dsr.getMyActivityLink().click();
		Thread.sleep(4000);
		dsr.getMyDSRLink().click();
		Thread.sleep(4000);
		driver.switchTo().frame("parentWindow");
		
		WebElement Parent = driver.findElement(By.xpath("//*[@id ='Iframe_control']//iframe[@id='iframe_item_65']"));

		driver.switchTo().frame(Parent);
		Thread.sleep(2000);
		
		dsr.getCreateDSRLink().click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		dsr.getCreateButtonDSRLink().click();
		Thread.sleep(4000);
		dsr.getTaskDetailsLink().click();
	}
}
