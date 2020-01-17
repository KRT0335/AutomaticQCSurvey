package com.revature.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.revature.pageObjectModels.Index;
import com.revature.pageObjectModels.Page1;
import com.revature.pageObjectModels.Page2;
import com.revature.pageObjectModels.Page3;
import com.revature.pageObjectModels.Page4;

public class UserinyerfaceScript {

	public static WebDriver driver;
	public final String URL = "https://userinyerface.com/";
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(URL);
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test
	public void clickHere() {
		Index index = new Index(driver);
		Page1 page1 = new Page1(driver);
		index.hereLink.click();
		Assert.assertEquals(index.title, page1.title);
		
	}
	
	@Test
	public void page1Test() {
		Page1 page1 = new Page1(driver);
		page1.gettingPassPage1("Password123", "myEmail", "gmailoutlook");
		Assert.assertEquals(page1.title, driver.getTitle());
	}
	
	@Test
	public void page2Test() {
		Page2 page2 = new Page2(driver);
		String link = "C:"+"\\"+"Users"+"\\"+"kevin"+"\\"+"Pictures"+"\\"+"luigi.png";
		page2.gettingPassPage2(link);
		Assert.assertEquals(page2.title, driver.getTitle());
	}
	
	@Test
	public void page3Test() {
		Page3 page3 = new Page3(driver);
		page3.gettingPassPage3(driver, "s");
		Assert.assertEquals(page3.title, driver.getTitle());
	}
	
	@Test
	public void page4Test() {
		Page4 page4 = new Page4(driver);
		page4.gettingPassPage4(driver);
		Assert.assertEquals(page4.title, driver.getTitle());
	}
	
	@AfterClass
	public void tearDown() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}
}
