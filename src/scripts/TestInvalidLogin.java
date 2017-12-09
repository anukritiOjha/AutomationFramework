package scripts;

import org.testng.annotations.Test;

import generic.BaseClass;
import generic.Lib;
import pom_pages.LoginPage;

public class TestInvalidLogin extends BaseClass {
	
	@Test
	public void testInvalidLogin() throws InterruptedException{
	
	LoginPage l=new LoginPage(driver);
	
	String un="";
	String pw="";
	
	int rowcount=Lib.getRowCount(EXCEL_PATH, "InvalidLogin");
	for(int i=1;i<=rowcount;i++){
	un=Lib.getCellValue(EXCEL_PATH, "InvalidLogin", i, 0);
	pw=Lib.getCellValue(EXCEL_PATH, "InvalidLogin", i, 1);
	l.setUsername(un);
	l.setPassword(pw);
	l.clickLogin();
	Thread.sleep(5000);
	}
	
	}
	

}
