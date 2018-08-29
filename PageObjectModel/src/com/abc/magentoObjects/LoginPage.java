package com.abc.magentoObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver=null;
	By email=By.id("email");
	By password=By.id("pass");
	By login=By.id("send2");
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public void sendEmail(String em) {
		driver.findElement(email).sendKeys(em);
	}
	public void sendPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickOnLogin() {
		driver.findElement(login).click();
	}
	
	

}
