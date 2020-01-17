package com.revature.pageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Index {

	public final String title = "User Inyerface - A worst-practice UI experiment";
	
	@FindBy(className="start__link")
	public WebElement hereLink;
	
	public Index(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
}
