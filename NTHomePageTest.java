package scripts.po;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;

public class NTHomePageTest {
	NTHomePage myHomePage;
  @Test
  public void ntHomePageTest() {
	  myHomePage.login("stc123", "12345");
	  String expectedTitle = "My account";
	  String actualTitle = myHomePage.getPageTitleAfterLogin();
	  assertEquals(actualTitle,expectedTitle);
  }
  @BeforeMethod
  public void beforeMethod() {
	  myHomePage = new NTHomePage();	  
  }

  @AfterMethod
  public void afterMethod() {
	  myHomePage.closeBrowser();
  }

}
