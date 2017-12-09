package scripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.BaseClass;
import generic.Lib;
import pom_pages.LoginPage;

public class TestLogin extends BaseClass {
	
	@Test
	public void testLogin() throws InterruptedException{
		LoginPage l=new LoginPage(driver);
		
		String un=Lib.getCellValue(EXCEL_PATH, "ValidLogin", 1, 0);
		String pw=Lib.getCellValue(EXCEL_PATH, "ValidLogin", 1, 1);
		String expectedtitle=Lib.getCellValue(EXCEL_PATH, "ValidLogin", 1, 2);
		l.setUsername(un);
		l.setPassword(pw);
		l.clickLogin();
		Thread.sleep(3000);
		
		/*int rowcount=Lib.getRowCount(EXCEL_PATH, "InvalidLogin");
		for(int i=1;i<=rowcount;i++){
		un=Lib.getCellValue(EXCEL_PATH, "InvalidLogin", i, 0);
		pw=Lib.getCellValue(EXCEL_PATH, "InvalidLogin", i, 1);
		l.setUsername(un);
		l.setPassword(pw);
		l.clickLogin();
		}*/
		
		String actualtitle=driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualtitle, expectedtitle);
		s.assertAll();
		//test.takeScreenshot("testLogin");
		
	}

}
