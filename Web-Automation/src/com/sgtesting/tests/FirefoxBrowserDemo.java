package com.sgtesting.tests;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemo {

	private static FirefoxDriver oBrowser;
	public static void main(String[] args) {
		lunchBrowser();
		navigate();
		closeApplication();

	}
    private static void lunchBrowser()
    {
    	try
    	{
    		oBrowser=new FirefoxDriver();
    		
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void navigate()
    {
    	try
    	{
    		oBrowser.get("http://localhost/login.do");
    		Thread.sleep(5000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void closeApplication()
    {
    	try
    	{
    		oBrowser.close();
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    		
    }



