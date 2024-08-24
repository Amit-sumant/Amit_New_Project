package com.ibanking.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	
	@FindBy(name="uid")
	WebElement txtuid;
	
	@FindBy(name="password")
	WebElement txtPwd;
	
	@FindBy(name="btnLogin")
	WebElement loginButton;
	
	public LoginPage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void setUserName(String uname)
	{
		txtuid.sendKeys("uname");
	}
	
	public void setPassword(String pwd)
	{
		txtPwd.sendKeys("pwd");
	}
	
	public void buttonLogin()
	{
		loginButton.click();
	}

}
