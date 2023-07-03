package com.sgtesting.pageobjectsmodeldemo;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutacti {
	public static WebDriver o=null;
	public static ActipageCreation opage=null;

	public static void main(String[] args) {
		Launch();
		Navigate();
		 login();
		 minimize();
		 logout();
		 close();
	}
	private static void Launch()
	{
		try {
			o=new ChromeDriver();
			opage=new ActipageCreation();
			
		} catch (Exception e) {
			
		}
	}
	private static void Navigate()
	{
		try {
			 o.get("http://localhost/login.do");
			 Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    private static void login()
    {
    	try {
    		opage.getUserName().sendKeys("admin");
    		Thread.sleep(2000);
    		opage.getPassword().sendKeys("manager");
    		Thread.sleep(2000);
    		opage.getLoginButton().click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    private static void minimize()
	{
		try {
			 opage.getFlyoutWindow().click();
			 Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    private static void logout()
   	{
   		try {
   			 opage.getLogoutButton().click();
   			 Thread.sleep(5000);
   			
   		} catch (Exception e) {
   			e.printStackTrace();
   		}
   	}
    private static void close()
   	{
   		try {
   			 
   			o.close();
   			
   		} catch (Exception e) {
   			e.printStackTrace();
   		}
   	}
    
}
