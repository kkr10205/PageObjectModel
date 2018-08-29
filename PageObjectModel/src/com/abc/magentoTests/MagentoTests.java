package com.abc.magentoTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.magentoObjects.Home;
import com.abc.magentoObjects.LoginPage;
import com.abc.magentoObjects.Main;

public class MagentoTests 
{
	public static void main(String[]args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String url="https:\\www.magento.com";
	driver.get(url);
	Home h=new Home(driver);
	h.clickOnMyAcct();
	LoginPage l=new LoginPage(driver);
	l.sendEmail("sucheendra.abc@gmail.com");
	l.sendPassword("Welcome123");
	l.clickOnLogin();
	Main m=new Main(driver);
	m.clickOnLogout();
	
	}

}
