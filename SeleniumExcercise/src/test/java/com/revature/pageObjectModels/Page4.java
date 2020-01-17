package com.revature.pageObjectModels;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page4 {

	public final String title = "User Inyerface - A worst-practice UI experiment";
	
	@FindBy(xpath="//button[text()='Validate']")
	public WebElement validate;
	
	JavascriptExecutor js;
	
	public Page4(WebDriver driver) {
		PageFactory.initElements(driver, this);
		js = ((JavascriptExecutor) driver);
	}
	
	public void gettingPassPage4(WebDriver driver) {
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		List<WebElement> checks = driver.findElements(By.xpath("//label[@class='checkbox__label']"));
		for(WebElement check : checks) {
			check.click();
		}
		this.validate.click();
	}
}
