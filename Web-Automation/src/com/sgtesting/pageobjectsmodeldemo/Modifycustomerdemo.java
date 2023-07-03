package com.sgtesting.pageobjectsmodeldemo;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Modifycustomerdemo {
		public Modifycustomerdemo(WebDriver o)
		{
			
			PageFactory.initElements(o, this);
		}
		//Create WebElement for UserName
		private  WebElement username;
		public WebElement getuserName()
		{
			return username;
		}
		//Create WebElement for password
		private WebElement pwd;
		public WebElement getPassword()
		{
			return pwd;
		}
		//create WebElement for Login button
		@FindBy(xpath="//*[@id=\"loginButton\"]/div")
		private WebElement OLogin;
		public WebElement getLoginButton()
		{
			return OLogin;
		}
		//create WebElement for Flyoutwindow
		private WebElement gettingStartedShortcutsPanelId;
		public WebElement getFlyOutwindow()
		{
			return gettingStartedShortcutsPanelId;
		}
		//create webelement for CreateCustomer
		@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a/div[1]")
		private WebElement Task;
		public WebElement getTask()
		{
			return Task;
		}
		@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")
		private WebElement AddNew;
		public WebElement getAddNew()
		{
			return  AddNew;
		}
		@FindBy(xpath="/html/body/div[14]/div[1]")
		private WebElement Newcustomer;
		public WebElement getNewcustomer()
		{
			return Newcustomer;
		}
		private WebElement customerLightBox_nameField;
		public WebElement getName()
		{
			return customerLightBox_nameField;
		}
		private WebElement customerLightBox_descriptionField;
		public WebElement getDescription()
		{
			return customerLightBox_descriptionField;
		}
		@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
		private WebElement Createcustomer;
		public WebElement getCreatecustomer()
		{
			return Createcustomer;
		}
		
		//create webelement for Modifycustomer
		@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		private WebElement edit;
		public WebElement getedit()
		{
			return edit;
		}
		@FindBy(xpath="//div[text()='ACTIONS']")
		private WebElement Actionbutton;
		public WebElement getAction1()
		{
			return Actionbutton;
		}
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
		private WebElement clrdescription;
		public WebElement getdescripction()
		{
			return clrdescription;
		}
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
		private WebElement NewDescription;
		public WebElement getDescription1()
		{
			return NewDescription;
		}
		
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]")
		private WebElement CLose;
		public WebElement getCLose()
		{
			return CLose;
		}
		//create webelement for DeleteModifycustomer
		@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		private WebElement edit1;
		public WebElement getedit1()
		{
			return edit1;
		}
		@FindBy(xpath="//div[text()='ACTIONS']")
		private WebElement Actionbutton1;
		public WebElement getAction()
		{
			return Actionbutton1;
		}
		
		@FindBy(xpath="//div[text()='Delete']")
		private WebElement delete;
		public WebElement getDelete()
		{
			return delete;
		}
		
		private WebElement customerPanel_deleteConfirm_submitTitle;
		public WebElement getConfirm()
		{
			return customerPanel_deleteConfirm_submitTitle;
		}
		//create webelement for logout
		@FindBy(linkText="Logout")
		private WebElement oLogout;
		public WebElement getLogoutButton()
		{
			return oLogout;
		}
	    //create WebElement for Close()	
		private WebElement close;
		public WebElement Close()
		{
			return close;
		}
		
	}



