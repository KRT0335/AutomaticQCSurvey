package com.revature.pageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {

	public final String title = "User Inyerface - A worst-practice UI experiment";
	
	
	
	@FindBy(xpath="//input[@placeholder='Choose Password']")
	public WebElement passwordBox;
	@FindBy(xpath="//input[@placeholder='Your email']")
	public WebElement emailBox;
	@FindBy(xpath="//input[@placeholder='Domain']")
	public WebElement domainBox;
	@FindBy(className = "dropdown__field")
	public WebElement dropdown;
	@FindBy(xpath="//div[@class='dropdown__list-item'][text()='.org']")
	public WebElement dropdownSelect;
	@FindBy(className="checkbox__check")
	public WebElement termsAndCond;
	@FindBy(xpath="//a[@class='button--secondary'][text()='Next']")
	public WebElement next;
	@FindBy(xpath="//span[text()='to bottom']")
	public WebElement sendToBottom;
	
	public Page1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void gettingPassPage1(String password, String email, String domain) {
		this.sendToBottom.click();
//		try {
//			Thread.sleep(15000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		this.passwordBox.clear();
		this.passwordBox.sendKeys(password);
		this.emailBox.click();
		this.emailBox.clear();
		this.emailBox.sendKeys(email);
		this.domainBox.click();
		this.domainBox.clear();
		this.domainBox.sendKeys(domain);
		this.dropdown.click();
		this.dropdownSelect.click();
		this.termsAndCond.click();
		this.next.click();
		
	}
}
