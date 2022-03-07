package com.TGApp.Repository;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * 
 * @author TG1719
 *
 */
public class Testing {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "..//TRUGlobal/src/main/resources/chromedriver.exe");

		/*
		 * DesiredCapabilities caps = new DesiredCapabilities();
		 * caps.setCapability("browserName", "chrome"); caps.setCapability("version",
		 * "98.0"); RemoteWebDriver driver = new RemoteWebDriver(new
		 * URL("http://10.60.23.64/wd/hub"), caps);
		 */
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://10.60.20.8/tgaprdv9/");
		driver.findElement(By.id("id_sc_field_login")).sendKeys("QA_TEST_USER");
		driver.findElement(By.id("id_sc_field_password")).sendKeys("qtU63432");
		driver.findElement(By.id("sub_form_b")).click();

		/*
		 * driver.switchTo().frame(1); //driver.switchTo().frame("")
		 * driver.switchTo().frame("nm_iframe_liga_E_home_page_my_tasks");
		 * driver.findElement(By.id("SC_fast_search_top")).sendKeys("226054");
		 */

		driver.switchTo().frame("main_menu_iframe");
		driver.switchTo().frame("dbifrm_widget12");
		// Thread.sleep(3000);
		driver.findElement(By.xpath(" //*[@id='SC_fast_search_top']")).sendKeys("226054");
		driver.findElement(By.xpath("//*[@id='SC_fast_search_submit_top']")).click();

		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//img[@id='id_img_bmenu' and @align]")).click();
		// driver.findElement(By.xpath("//*[@class='jstree-anchor scMenuTItem
		// jstree-clicked']")).click(); //
		// driver.findElement(By.xpath("(//*[@unselectable='on'])[2]")).click();

		Thread.sleep(2000);
		// driver.findElement(By.id("//*[@id='item_12']")).click();

		driver.findElement(By.xpath("//a[@id='bmenu']")).click();
		// Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@id='item_12']")).click(); // My Home
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='bmenu']")).click();
		driver.findElement(By.xpath("//a[@id='item_257']")).click(); // My profile
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='bmenu']")).click();
		driver.findElement(By.xpath("//a[@id='item_239']")).click(); // Quick Search
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='bmenu']")).click();
		driver.findElement(By.xpath("//a[@id='item_241']")).click(); // My Task;
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='bmenu']")).click();
		driver.findElement(By.xpath("//span[text()='My Activity']")).click(); // My Activity
		Thread.sleep(2000);

		driver.findElement(By.id("item_65")).click(); // My DSR
		// driver.switchTo().frame("iframe_main_menu");
		// Thread.sleep(2000);

		WebElement Parent = driver.findElement(By.xpath("//*[@id ='Iframe_control']//iframe[@id='iframe_item_65']"));

		driver.switchTo().frame(Parent);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@id='sc_SC_btn_2_top']")).click();

		Thread.sleep(5000);
		driver.quit();
	}

}
