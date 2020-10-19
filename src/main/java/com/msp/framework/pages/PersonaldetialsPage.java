package com.msp.framework.pages;

import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.msp.framework.base.TestBase;

public class PersonaldetialsPage extends TestBase {
	/**
	 * Created by Dhruba Deka  on 30/07/2019.
	 */
	
	 public PersonaldetialsPage(WebDriver driver) throws Exception
	 {
		 PageFactory.initElements(driver, this);
	  }
	
	@FindBy(xpath="//a[@title ='Information']")
	public WebElement MyPIbtn;
	
	@FindBy(xpath="//a[@title='Manage my personal information']")
	public WebElement Manage_my_personal_information;
	
	@FindBy(xpath="// input[contains(@id,'1497:0')]")
	public WebElement accountName;
	@FindBy(xpath="// input[contains(@id,'1513:0')]")
	public WebElement phoneNum;
	@FindBy(xpath="// input[contains(@id,'1629:0')]")
	public WebElement accountNum;
	@FindBy(xpath="// div[contains(@id,'1463:0')]")
	public WebElement ratingDD;
	@FindBy(xpath="//textarea[contains(@id,'1945:0')]")
	public WebElement billingAdd;
	@FindBy(xpath="//textarea[contains(@id,'2348:0')]")
	public WebElement descriptionTxt;
	@FindBy(xpath="//div[contains(@id,'2082:0')]")
	public WebElement custPriorityDD;
	@FindBy(xpath="//div[contains(@id,'2128:0')]")
	public WebElement slaDD;
	@FindBy(xpath="//button[contains(@class,'slds-button slds-button--neutral uiButton--brand uiButton forceActionButton')]")
	public WebElement accountSaveBtn;


	@FindBy(name="submitIdentity")
	public WebElement Submitbtn;
	
	@FindBy(id = "old_passwd")
	public  WebElement textOldPassword;

	@FindBy(id = "passwd")
	public WebElement textNewPassword;
	
	@FindBy(id = "confirmation")
	public WebElement textConfirmation;
	
	@FindBy(xpath="//p[@class=\"alert alert-success\"]")
	public WebElement successMessage;
	
		
	//All Methods
	
	//method to verify manage my personal infrmation section
	public void Manage_my_personal_information()
	{
		this.Manage_my_personal_information.click();
	}
	//method to verify firstname field
	 public void userDetails(String accountname,String phone,String accountnumber,String rating,String billingaddress,String customerpriority,String sla,String description)
	 {
		 this.accountName.clear();
		 this.accountName.sendKeys(accountname);
		 this.phoneNum.clear();
		 this.phoneNum.sendKeys(phone);
		 this.accountNum.clear();
		 this.accountNum.sendKeys(accountnumber);
		 this.ratingDD.click();
		 WebElement ratingDDList = driver.findElement(By.xpath("//li/a[contains(text(),"+rating+")]"));
		 ratingDDList.click();
		 this.billingAdd.sendKeys(billingaddress);
		 this.custPriorityDD.click();
		 WebElement custList = driver.findElement(By.xpath("//li/a[contains(text(),"+customerpriority+")]"));
		 custList.click();
		 this.slaDD.click();
		 WebElement slaList = driver.findElement(By.xpath("//li/a[contains(text(),"+sla+")]"));
		 slaList.click();
		 this.descriptionTxt.clear();
		 this.descriptionTxt.sendKeys(description);

	 }
	
		//method to verify change password  field
		public void ChangePassword() throws IOException
		 {		 
		 textOldPassword.sendKeys(prop.getProperty("old_passwd"));
		 textNewPassword.sendKeys(prop.getProperty("passwd"));	
		 textConfirmation.sendKeys(prop.getProperty("confirmation"));
			 
		FileOutputStream fio= new FileOutputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\msp\\framework\\config\\cofig.properties");
		prop.setProperty("old_passwd", prop.getProperty("passwd"));
		prop.store(fio, null);
		fio.close();		 
		 }
		//method to click on Submit button
		public void SaveAccountBtn()
		{
			this.accountSaveBtn.click();
		}
				
		//method to verify the message		
		public void verifyMessage() 
		{
		String title= successMessage.getText();
		System.out.println("Title is"+title);
		 }	
					 
}




