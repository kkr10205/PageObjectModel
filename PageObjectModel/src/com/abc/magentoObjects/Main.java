package com.abc.magentoObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main {
	WebDriver driver=null;
	By logout=By.linkText("Logout");
	public Main(WebDriver driver) {
		this.driver=driver;
		
	}
	public void clickOnLogout() {
		driver.findElement(logout).click();
	}
	

}
