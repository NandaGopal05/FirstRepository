package org.pom;

import org.maven.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends LibGlobal {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name = "username")
	private WebElement usrName;
	
	@FindBy(name = "password")
	private WebElement usrPassWord;
	
	@FindBy(name = "login")
	private WebElement loginBtn;

	public WebElement getUsrName() {
		return usrName;
	}

	public WebElement getUsrPassWord() {
		return usrPassWord;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
}
