package com.revature.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.revature.pageObjectModels.Survey;

public class QCSurveyScript {

	public static WebDriver driver;
	public final String URL = "https://docs.google.com/forms/d/e/1FAIpQLSfBY8I-vdrW3tZVv-Z58Fcbwjx5RRRtjxsy7vFfSADdp_ectg/viewform?embedded=true&fbzx=-6445297158101610970";
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(URL);
	}
	
	@Test
	public void doesntNeedToBeATestButIAlreadyMadeThisJavaFile() {
		Survey survey = new Survey(driver);
		survey.annoy();
		Assert.assertEquals(survey.title, driver.getTitle());
	}
	
	@AfterClass
	public void closeWindow() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
}
