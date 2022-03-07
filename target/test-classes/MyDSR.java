/**
 * 
 */
package com.TGApp.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author TG1719
 *
 */
public class MyDSR 
{
	WebDriver driver;
	public MyDSR(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="bmenu")
	private WebElement menuLink;
	
	@FindBy(id="item_257")
	private WebElement myProfileLink;
	
	@FindBy(id="item_239")
	private WebElement quickSearcheLink;
	
	@FindBy(id="item_241")
	private WebElement myTaskLink;
	
	@FindBy(xpath="//span[text()='My Activity']")
	private WebElement myActivityLink;
	
	@FindBy(id="item_65")
	private WebElement myDSRLink;
	
	
	@FindBy(xpath="//*[@id ='Iframe_control']//iframe[@id='iframe_item_65']")
	private WebElement parentWindow;
	
	@FindBy(id="sc_SC_btn_2_top")
	private WebElement createDSRLink;
	
	@FindBy(xpath="//a[@id='sc_b_ins_t' and @class='sc-unique-btn-3 scButton_ok ']")
	private WebElement createButtonDSRLink;
	
	@FindBy(id="sc_b_new_t")
	private WebElement TaskDetailsLink;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getMenuLink() {
		return menuLink;
	}

	public WebElement getMyProfileLink() {
		return myProfileLink;
	}

	public WebElement getQuickSearcheLink() {
		return quickSearcheLink;
	}

	public WebElement getMyTaskLink() {
		return myTaskLink;
	}

	public WebElement getMyActivityLink() {
		return myActivityLink;
	}

	public WebElement getMyDSRLink() {
		return myDSRLink;
	}

	public WebElement getParentWindow() {
		return parentWindow;
	}

	public WebElement getCreateDSRLink() {
		return createDSRLink;
	}

	public WebElement getCreateButtonDSRLink() {
		return createButtonDSRLink;
	}

	public WebElement getTaskDetailsLink() {
		return TaskDetailsLink;
	}
	
	

}
