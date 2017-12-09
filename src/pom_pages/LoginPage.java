package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[contains(text(),'Login')][1]")
	private WebElement loginButton;
	
	//initialization
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void setUsername(String un){
		unTB.sendKeys(un);
	}
	public void setPassword(String pw){
		pwTB.sendKeys(pw);
	}
	public void clickLogin(){
		loginButton.click();
	}
	

}
