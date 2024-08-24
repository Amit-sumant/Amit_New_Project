package com.inetbanking.Testcases;

import org.testng.annotations.Test;

import java.time.Duration;

import org.testng.Assert;
import com.ibanking.pageObject.*;
import com.ibanking.pageObject.LoginPage;

public class TC_LoginTest_01 extends BaseClass
{
	@Test
	public void loginTest()
	{
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.buttonLogin();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(false);
		}
		
		
	}

}
