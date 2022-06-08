package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
public LoginPage() {
}
public LoginPage typeUserName(String username) {
	driver.findElement(By.id("username")).sendKeys(username);
	return this;
//return new LoginPage();
//	LoginPage page = new LoginPage();
//	return page;
}
public LoginPage typePassword(String password) {
	driver.findElement(By.id("password")).sendKeys(password);
	return this;
}
public WelcomePage clickLoginButton() {
	driver.findElement(By.className("decorativeSubmit")).click();
	return new WelcomePage();
}

}