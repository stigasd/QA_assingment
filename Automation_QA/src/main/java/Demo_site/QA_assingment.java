package Demo_site;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class QA_assingment extends Base {
	public void userDetails()                                    //userdetails
	{  
		
		driver.navigate().to("https://demoqa.com/text-box");
		WebElement fullname=driver.findElement(By.xpath("//input[@id=\"userName\"]"));
		fullname.sendKeys("The Stig");
		WebElement email=driver.findElement(By.xpath("//input[@id=\"userEmail\"]"));
		email.sendKeys("stigbbc@gmail.com");
		WebElement currentaddress=driver.findElement(By.xpath("//textarea[@id=\"currentAddress\"]"));
		currentaddress.sendKeys("Exhibit Technologies PVT LTD, Lotus Signature, Suite 702, Captain Suresh Sawant Marg, Veera Desai Road, Andheri West, 400053");
		WebElement permanentaddress=driver.findElement(By.xpath("//textarea[@id=\"permanentAddress\"]"));
		permanentaddress.sendKeys("same as above");
		WebElement submit=driver.findElement(By.xpath("//button[text()='Submit']"));
		submit.click();
	
		System.out.println("Text box done successfully");
		
	}
	public void checkBox()                                    //checkbox
	{
		driver.navigate().to("https://demoqa.com/checkbox");//navigating to checkbox
		WebElement check=driver.findElement(By.className("rct-title"));
		if(check.isSelected())
		{
			System.out.println("checkbox is already selected");
		}else
			
		{
			System.out.println("selecting check box");
			check.click();
			
		}
		System.out.println("Check box done successfully");
	}
		
	
	public void radioButton()                                  //radiobutton
	{
		driver.navigate().to("https://demoqa.com/radio-button");//navigating to radio button
		WebElement button=driver.findElement(By.xpath("//label[@for=\"impressiveRadio\"]"));
		if(button.isSelected())
		{
			System.out.println("radio button is already selected");
		}else
		{
			System.out.println("selecting radio button");
			button.click();
		}
		System.out.println("Radio button done successfully");
	}
	
	public void webTable()                                   //table
	{
		driver.navigate().to("https://demoqa.com/webtables");//navi to webtable
		WebElement table=driver.findElement(By.cssSelector("button[id=\"addNewRecordButton\"]"));
		table.click();
		WebElement firstname=driver.findElement(By.cssSelector("input[id=\"firstName\"]"));
		firstname.sendKeys("Jeremy");
		WebElement lastname=driver.findElement(By.cssSelector("input[id=\"lastName\"]"));
		lastname.sendKeys("Clarkson");
		
		WebElement email=driver.findElement(By.cssSelector("input[id=\"userEmail\"]"));
		email.sendKeys("jclarkson@amazon.com");
		WebElement age=driver.findElement(By.cssSelector("input[id=\"age\"]"));
		age.sendKeys("64");
		WebElement salary=driver.findElement(By.cssSelector("input[id=\"salary\"]"));
		salary.sendKeys("35000");
		WebElement department=driver.findElement(By.cssSelector("input[id=\"department\"]"));
		department.sendKeys("Automobile journalist");
		WebElement submit=driver.findElement(By.cssSelector("button[id=\"submit\"]"));
		submit.click();
		
		WebElement searchbox=driver.findElement(By.cssSelector("input[id=\"searchBox\"]"));
		searchbox.sendKeys("45");
		
		System.out.println("Webtable done successfully");
		
	}
	
	public void buttons()                               //buttons
	{
		driver.navigate().to("https://demoqa.com/buttons");
		WebElement doubleclick=driver.findElement(By.cssSelector("button[id=\"doubleClickBtn\"]"));
		Actions action=new Actions(driver);
		action.doubleClick(doubleclick).build().perform();
	   
	    WebElement rightclick1=driver.findElement(By.xpath("//button[@class='btn btn-primary'][text()='Right Click Me']"));
		action.contextClick(rightclick1).build().perform();
		
	    WebElement click1=driver.findElement(By.xpath("//button[text()='Click Me']"));
		 click1.click();
		 
		 
	
	System.out.println("Buttons done successfully");
	}
public void upload_and_download()               //download
{
	driver.navigate().to("https://demoqa.com/upload-download");
	WebElement download=driver.findElement(By.cssSelector("a[id=\"downloadButton\"]"));
	download.click();
//	
//	WebElement upload=driver.findElement(By.cssSelector("input[id=\"uploadFile\"]"));
//	upload.click();

	
	
	System.out.println("Download done successfully");

}

public void link()
{
	driver.navigate().to("https://demoqa.com/links");
	WebElement home_link=driver.findElement(By.id("simpleLink"));
	home_link.click();
	WebElement home_hurax=driver.findElement(By.id("dynamicLink"));
	home_hurax.click();
	WebElement api_link=driver.findElement(By.xpath("//a[text()='Bad Request']"));
	api_link.click();

	
	//doubt
	WebElement link_response=driver.findElement(By.id("linkResponse"));
	String tt=link_response.getText();
	System.out.println(tt);
	
}
	

	public static void main(String[] args) 
	{
		QA_assingment details=new QA_assingment();
		details.initializerbrowser();
		details.userDetails();
		details.checkBox();
		details.radioButton();
		details.webTable();
		details.buttons();
	    details.upload_and_download();
	  //  details.link();
		
		

	}

}
