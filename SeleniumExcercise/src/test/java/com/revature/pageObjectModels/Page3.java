package com.revature.pageObjectModels;

import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page3 {

	public final String title = "User Inyerface - A worst-practice UI experiment";
	
//	public LocalDate ld = LocalDate.now();
	
	@FindBy(xpath="//div[text()='First name']/following-sibling::div/input")
	public WebElement firstName;
	@FindBy(xpath="//div[text()='Zip']/following-sibling::div/input")
	public WebElement zip;
	@FindBy(xpath="//div[@class='dropdown__field'][text()='Choose a title']")
	public WebElement dropdown;
	@FindBy(xpath="//div[@class='dropdown__list-item'][text()='Mr']")
	public WebElement dropdownSelect;
	@FindBy(xpath="//div[text()='City']/following-sibling::div/input")
	public WebElement city;
	@FindBy(xpath="//div[text()='Surname']/following-sibling::div/input")
	public WebElement surname;
	@FindBy(xpath="//span[text()='Choose a country']")
	public WebElement dropdownCountry;
	@FindBy(className="flag-af")
	public WebElement dropdownSelectFlag;
	@FindBy(xpath="//div[text()='Street']/following-sibling::div/input")
	public WebElement street;
	@FindBy(xpath="//div[@class='dropdown__header']/div[@class='dropdown__field'][text()='Day']")
	public WebElement day;
//	@FindBy(xpath="//div[@class='date-dropdown__container--day']/div[@class='dropdown']/div[@class='dropdown__list']/div[@class='dropdown__list-item'][text()='1']")
//	@FindBy(xpath="//div[@class='date-dropdown__container--day']/div[@class='dropdown']/div[@class='dropdown__list']/div[1]")
//	@FindBy(xpath="//div[contains(@class, 'date-dropdown__container--day')]/div[contains(@class, 'dropdown')]/div[@class='dropdown__list']/div[text()='20']")
//	public WebElement dropdownDay;
	@FindBy(xpath="//div[@class='dropdown__header']/div[@class='dropdown__field'][text()='Month']")
	public WebElement month;
	@FindBy(xpath="//div[@class='dropdown__header']/div[@class='dropdown__field'][text()='Year']")
	public WebElement year;
	@FindBy(xpath="//div[text()='Female']")
	public WebElement genderBut;
	@FindBy(xpath="//button[text()='Next']")
	public WebElement next;
	
	
	public JavascriptExecutor jse;
	public WebDriverWait wait;
	public Actions action;
	public Page3(WebDriver driver) {
		PageFactory.initElements(driver, this);
		jse = (JavascriptExecutor)driver;
		wait = new WebDriverWait(driver, 5000);
		action = new Actions(driver);
	}
	
	public void gettingPassPage3(WebDriver driver, String in) {
//		this.firstName.click();
		
//		try {
//			Thread.sleep(9000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		LocalDate ld = LocalDate.now();
		this.firstName.clear();
		this.firstName.sendKeys(in);
		this.zip.clear();
		this.zip.sendKeys(in);
		this.dropdown.click();
		this.dropdownSelect.click();
		this.city.clear();
		this.city.sendKeys(in);
		this.surname.clear();
		this.surname.sendKeys(in);
		this.dropdownCountry.click();
		this.dropdownSelectFlag.click();
		this.street.clear();
		this.street.sendKeys(in);
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.day.click();
		final String day = "//div[contains(@class, 'date-dropdown__container--day')]/div[contains(@class, 'dropdown')]/div[@class='dropdown__list']/div[text()='" + Integer.toString(ld.getDayOfMonth()) + "']";
		WebElement newDropdownDay = driver.findElement(By.xpath(day));
		newDropdownDay.click();
		
		this.month.click();
		final String month = "//div[contains(@class, 'date-dropdown__container--month')]/div[contains(@class, 'dropdown')]/div[@class='dropdown__list']/div[text()='" + getMonthName(ld.getMonthValue()) + "']";
		WebElement newDropdownMonth = driver.findElement(By.xpath(month));
		newDropdownMonth.click();
		
		this.year.click();
		final String year = "//div[contains(@class, 'date-dropdown__container--year')]/div[contains(@class, 'dropdown')]/div[@class='dropdown__list']/div[text()='" + Integer.toString(ld.getYear()) + "']";
		WebElement newDropdownYear = driver.findElement(By.xpath(year));
		newDropdownYear.click();
		
		this.genderBut.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement newNext = this.wait.until(ExpectedConditions.elementToBeClickable(this.next));
		newNext.click();
//		this.next.click();
	}
	
	public String getMonthName(int monthNum) {
		
		switch(monthNum) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
			
		}
		return null;
	}
}
