package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage() { // Pagefactory code
	}

	public void enterUsername(String data) {
		
		WebElement elUsername = locateElement("id", "username");
		clearAndType(elUsername, data);

	}

public void enterPassword(String data) {
		
		WebElement elpassword = locateElement("id", "password");
		clearAndType(elpassword, data);

	}

public void clickLogin() {
	
	WebElement Login = locateElement("LinkText", "Login");
	click(Login);
	
}
}
