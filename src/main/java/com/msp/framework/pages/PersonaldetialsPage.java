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
	
	@FindBy(xpath="//input[contains(@aria-required,'true')]")
	public WebElement accountName;
	@FindBy(xpath="(//input[contains(@type,'tel')])[1]")
	public WebElement phoneNum;
	@FindBy(xpath="(//input[contains(@data-interactive-lib-uid,'10')])[1]")
	public WebElement accountNum;
	@FindBy(xpath="(//div/a[contains(text(),'--None--')])[1]")
	public WebElement ratingDD;
	@FindBy(xpath="(//textarea[contains(@placeholder,'Billing Street')])[1]")
	public WebElement billingAdd;
	@FindBy(xpath="(//textarea[contains(@role,'textbox')])[3]")
	public WebElement descriptionTxt;
	@FindBy(xpath="(//div/a[contains(@href,'javascript:void(0);')])[5]")
	public WebElement custPriorityDD;
	@FindBy(xpath="(//div/a[contains(text(),'--None--')])[6]")
	public WebElement slaDD;
	@FindBy(xpath="(//button/span[contains(text(),'Save')])[3]")
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
	 public void userDetails(String accountname,String phone,String accountnumber,String billingaddress,String description)
	 {
		 this.accountName.clear();
		 this.accountName.sendKeys(accountname);
		 this.phoneNum.clear();
		 this.phoneNum.sendKeys(phone);
		 this.accountNum.clear();
		 this.accountNum.sendKeys(accountnumber);
		 this.ratingDD.click();
		 WebElement ratingDDList = driver.findElement(By.xpath("//li/a[contains(@title,'Hot')]"));
		 System.out.println(ratingDDList);
		 ratingDDList.click();
		 this.billingAdd.sendKeys(billingaddress);
//		 this.custPriorityDD.click();
//		 WebElement custList = driver.findElement(By.xpath("//li/a[contains(@title,'Low')]"));
//		 System.out.println(custList);
//		 custList.click();
//		 this.slaDD.click();
//		 WebElement slaList = driver.findElement(By.xpath("//li/a[contains(@title,'Gold')]"));
//		 System.out.println(slaList);
//		 slaList.click();
		 this.descriptionTxt.clear();
		 this.descriptionTxt.sendKeys(description);

	 }

		//method to click on Submit button
		public void SaveAccountBtn() {
			if (this.accountSaveBtn.isDisplayed()) {
				this.accountSaveBtn.click();
			}
		}
				
		//method to verify the message		
		public void verifyMessage() 
		{
		String title= successMessage.getText();
		System.out.println("Title is"+title);
		 }	
					 
}




