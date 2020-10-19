	package com.msp.framework.pages;
	
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
    import org.openqa.selenium.JavascriptExecutor;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import com.msp.framework.base.TestBase;
	
	/**
	 * Created by Dhruba Deka  on 30/07/2019.
	 */	
	public class AccountOperationsPage extends TestBase{
	public AccountOperationsPage(WebDriver driver) throws Exception
				 {
			 PageFactory.initElements(driver, this);
				 }
		
		 @FindBy(xpath="//div[contains(@class,'slds-r5')]")
		  public WebElement AppLauncherLink;
		@FindBy(xpath="//input[contains(@placeholder,'Search apps and items...')]")
		public WebElement searchApps;
		@FindBy(xpath="//p/b[contains(text(),'Accounts')]")
		public WebElement AccountsLink;
		@FindBy(xpath="//div[contains(text(),'New')]")
		public WebElement NewBtn;
				
		 @FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
		 public	 WebElement AddToCartbtn;
				 
		 @FindBy(xpath="//a[@title='Proceed to checkout']")
		 public  WebElement ProceedToChkOutBtn;
				 
		 @FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']")
		 public  WebElement ProceedToChkOutBtn1;
		
		 @FindBy(name="processAddress")
		 public  WebElement ProceedToChkOutBtn2;
				 
		 @FindBy(xpath="//input[@type='checkbox']")
		 public WebElement Checkbox;
				 
		 @FindBy(xpath="//button[@name='processCarrier']")
		 public  WebElement ProceedToChkOutBtn3;
				 
		 @FindBy(xpath="//a[@class='bankwire']")
		 public  WebElement BankWirePaymentTab ;
				 
		 @FindBy(xpath="//button[@class='button btn btn-default button-medium']")
		 public  WebElement ConfirmOrderbtn;
				 
		 @FindBy(xpath="//strong[contains(text(),'Your order on My Store is complete.')]")
		 public  WebElement YourOrder;
				 
		 @FindBy(xpath="//a[@class='button-exclusive btn btn-default']")
		 public  WebElement BackToOrderslnk;
				 
		 @FindBy(xpath="//h1[contains(text(),'Order history')]")
		 public  WebElement OrderHistory;
				 
		 @FindBy(xpath="//div/h1[contains(text(),'Shopping-cart summary')]")
		 public  WebElement ShopCartSumyPage;
		 
		 @FindBy(xpath="//*[@id='columns']/div[1]/span[2]")
		 public  WebElement AddressesPage;
				
		 @FindBy(xpath="//span[@class='navigation_page']")
		 public  WebElement ShippingSectn;
				
		 @FindBy(xpath="//span[@class='navigation_page']")
		 public  WebElement PaymentSectn;
			
		 @FindBy(xpath="//span[@class='navigation_page']")
		 public  WebElement  OrderSumryPg;				 
		
		 @FindBy(xpath=" //*[@id='center_column']/ul/li[1]/a/span")
		 public  WebElement  BackBtn;
		  
 	 //All Methods 
		 
   //Method to  verify the Sroll down & T-shirts My-Store Page existance 
	  public void AccountsPage(WebDriver driver) throws InterruptedException
		 {
		 	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      String title= driver.getTitle();
		  System.out.println("Title is --- > "+title);
		  if(title.equals("Recently Viewed | Accounts | Salesforce"))
		  { System.out.println("Page verified ");
			}else
		   {System.out.println("Page not available");
		   }
		 }

		public void HomePage(WebDriver driver) throws InterruptedException
		{
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String title= driver.getTitle();
			System.out.println("Title is --- > "+title);
			if(title.equals("Home | Salesforce"))
			{ System.out.println("Page verified ");
			}else
			{System.out.println("Page not available");
			}
		}

	 
		//method for Mouse Hover 
		 public void  clickNewBtn(WebDriver driver )
		 {
			 if (this.NewBtn.isDisplayed()) {

			 	this.NewBtn.click();
				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 }
//		 Actions action = new Actions(driver);
//		 action.moveToElement(driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"))).build().perform();
//		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		 driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		 }		

		public void Click_on_AppLauncherLinkSearchAccounts()
		{
			if(this.AppLauncherLink.isDisplayed()) {
				this.AppLauncherLink.click();
			}
		this.searchApps.sendKeys("Accounts");
		if(this.AccountsLink.isDisplayed()){
			this.AccountsLink.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		}

		public void Back_To_Myaccount()
		{
		this.BackBtn.click();
		}						
}

