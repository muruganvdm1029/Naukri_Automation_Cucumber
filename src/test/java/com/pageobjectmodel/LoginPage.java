package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.base.Base_Class;
import com.utility.ExcelUtility;
import com.utility.FileReaderManager;

public final class LoginPage extends Base_Class implements com.interfaceelements.LoginPage{
	
	@FindBy (xpath=login_xpath)
	private WebElement login;
	
	@FindBy(xpath=username_xpath)
	private WebElement username;
	
	@FindBy(xpath=password_xpath)
	private WebElement password;   
	
	@FindBy(xpath=loginb_xpath)
	private WebElement loginb;
	
	@FindBy(xpath=title_xpath)
	private WebElement title;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void  getLogin() {
		clickElement(login);
	}

	public void getUsername(String loginusername) {
		passInput(username,loginusername);
	}

	public void getPassword(String loginpassword) {
		passInput(password, loginpassword);
	}

	public void  getLoginb() {
		javaScriptClick(loginb);
	}

	public void  getTitle() {
		getTitle();
		
	}
	
	
	
	
	
	
	
	
	
	
    
//	public  boolean ValidLogin(ExtentTest extentTest ) throws Exception {
//
//		try {
//			FileReaderManager data = new FileReaderManager();
//			clickElement(login);
//			passInput(username,data.getDataProperty("loginusername"));
//			passInput(password, data.getDataProperty("loginpassword"));
//            clickElement(loginb);
//	        Thread.sleep(5000);
//			validation(title.getText(), ExcelUtility.getCellValue("DATA", "ID", "Title"));
//			extentTest.log(Status.PASS, "Login SuccessFull");
//		} catch (Exception e) {
//			extentTest.log(Status.FAIL, "Login Failed" + e.getMessage());
//			return false;
//		}
//		return true;
//
//
//	}
    
       }
            
    	
    	
    	
    	

	
	
	

    
