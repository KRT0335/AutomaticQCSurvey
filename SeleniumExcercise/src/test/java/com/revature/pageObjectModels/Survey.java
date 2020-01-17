package com.revature.pageObjectModels;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Survey {

	public final String title = "Training feedback";
	
	@FindBy(xpath="//input[@aria-label='Name (Optional)']")
	public WebElement name;
	@FindBy(xpath="//input[@aria-label='Email (Optional)']")
	public WebElement email;
	@FindBy(xpath="//div[@role='radio'][@data-value='Week 9']")
	public WebElement week;
	@FindBy(xpath="//div[@role='radio'][@data-value='5']")
	public WebElement satisfied;
	@FindBy(xpath="//textarea[@aria-label='Topics from the previous week you feel like you understand well:']")
	public WebElement prevWeekUnder;
	@FindBy(xpath="//textarea[@aria-label='Topics from the previous week you feel like you do not understand well:']")
	public WebElement prevWeekNoUnder;
	@FindBys(@FindBy(xpath="//div[@role='radio'][@data-value='Strongly agree']"))
	public List<WebElement> stronkAgees;
	@FindBy(xpath="//div[@role='radio'][@data-value='Yes']")
	public WebElement portfilioooooo;
	@FindBy(xpath="//textarea[@aria-label='Any additional comments regarding above ratings ']")
	public WebElement comment;
	@FindBy(xpath="//textarea[@aria-label='Any overall feedback (Training / Trainer / QC)']")
	public WebElement feedback;
	
	public Survey(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void annoy() {
		this.name.clear();
		this.name.sendKeys("Selenium Did This Not Me Smith");
		this.email.clear();
		this.email.sendKeys("Whatever the email for Selenium is.");
		this.week.click();
		this.satisfied.click();
		for(WebElement iStronkAgees : stronkAgees) {
			iStronkAgees.click();
		}
		this.prevWeekUnder.clear();
		this.prevWeekUnder.sendKeys("How to create a Selenium script to do exactly this.");
		this.prevWeekNoUnder.clear();
		this.prevWeekNoUnder.sendKeys("Understanding the difference between Selenium Grid and Selenium Grits.");
		this.portfilioooooo.click();
		this.comment.clear();
		this.comment.sendKeys("░░░░░░░░░░░░░░░░░░░░░░░ \n"
				+ "░░░▄▄░░░░░░░░░░░▄▄░░░░░ \n"
				+ "░░░█░▀▄░░░░░░░▄▀░█░░░░░ \n"
				+ "░░░█░░░▀█▀▀▀▀█░░░█░░░░░ \n"
				+ "░░▄▀░░░░▀░░░░░░░░░█░░░░ \n"
				+ "░░█░░░░░░░░░░░░░░░░█░░░ \n"
				+ "░▄▀░░░░░▄▄░░░░██░▄▄░█░░ \n"
				+ "░█░░░▀▀░▀▀░░░░░░▄░░░░█░ \n"
				+ "░█░░░░░░▄░░░███░░█░░░█░ \n"
				+ "░█░░░░░░░█▄▄▄█▄▄▀░░░░█░ \n"
				+ "░█░░░░░░▀▄▀█▀▀█▀░░░░░█░ \n"
				+ "░█░░░░░░░░▀█▄▄▀░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░HI░░░░░░░░░░█░ \n"
				+ "░█░░░░░░KEVIN░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░ \n"
				+ "░█░░░░░░░░░░░░░░░░░░░█░");
		this.feedback.clear();
		this.feedback.sendKeys("aaaaaaaaaaaaaaa");
	}
}
