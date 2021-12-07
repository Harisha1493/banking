package scripts.po;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class MyFirstTestNGTest {
	WebDriver driver;
	@Test //test annotation
  
  public void wikiTest() {
	  //all the step write here
	  driver.get("https://www.wikipedia.org/");
			driver.findElement(By.id("js-link-box-en")).click();
			driver.findElement(By.id("searchInput")).sendKeys("Selenium");
			driver.findElement(By.id("searchButton")).click();
			String expectedOutput = "Selenium";
			String actualOutput = driver.findElement(By.id("firstHeading")).getText();
			
			assertEquals(actualOutput,expectedOutput);
			
			/*
			 * if(expectedOutput.equals(actualOutput)) {
			 * System.out.println("Test Case Passed."); } else {
			 * System.out.println("Test Case failed."); }
			 */
			
			String expectedPageTitle="Selenium - Wikipedia1";
			String actualPageTitle=driver.getTitle();
			
			assertEquals(actualPageTitle,expectedPageTitle,"Execution failed");
			
			/*
			 * if(expectedPageTitle.equals(actualPageTitle)) {
			 * System.out.println("Page title Test Case Passed."); } else {
			 * System.out.println("Page title Test Case failed."); }
			 */
  }
	//@Test
	public void googletest()
	{
		driver.get("https://www.google.com/");
		//driver.findElement(By.tagName("q")).sendKeys("Selenium jobs");
		driver.findElement(By.name("q")).sendKeys("Selenium jobs");
	
	}
	
	//@Test
	public void Yahootest()
	{
		driver.get("https://in.yahoo.com/");
		//driver.findElement(By.tagName("q")).sendKeys("Selenium jobs");
		//driver.findElement(By.name("q")).sendKeys("Selenium jobs");
	
	}
	
	
	
  @BeforeMethod //before annotation
  public void beforeMethod() {
	  // u should code pre-requisite here
	  //open browser
	  //System.setProperty("webdriver.chrome.driver","D:\\akshay_project\\Harisha\\WebDriverSession\\test\\resources\\chromedriver.exe");
	  //driver = new ChromeDriver();
	  
	  System.out.println("Inside Before Method");
  }
  
  @BeforeClass
  
  public void onlyOnceBeforeFirstMethod()
  {
	  System.setProperty("webdriver.chrome.driver","D:\\akshay_project\\Harisha\\WebDriverSession\\test\\resources\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  
  
  
  

  @AfterMethod //after annotation
  public void afterMethod() {
	  //test case clean up will here
	  // close browser
	  //driver.quit();
	  System.out.println("Inside After Method"); }
	  
  @AfterClass
	  public void afterLastTest()
	  {
		  driver.quit();
	  }
  

}
