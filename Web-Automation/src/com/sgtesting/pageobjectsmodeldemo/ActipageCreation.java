package com.sgtesting.pageobjectsmodeldemo;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActipageCreation {

	
	public ActipageCreation()
	{
		PageFactory.initElements(gettingStartedShortcutsPanelId, this);
		
	}
	//create WebElement for UserName
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	//create WebElement for password
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
   //create WebElement for Login button
	@FindBy(xpath= "//*[@id=\"loginButton\"]/div")
	private WebElement ologin;
	public WebElement getLoginButton()
	{
		return ologin;
		
	}
	//create WebElement for FlyoutWindow
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyoutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	//create WebElement for Logoutlink()
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogoutButton()
	{
		return oLogout;
	}
	
}
