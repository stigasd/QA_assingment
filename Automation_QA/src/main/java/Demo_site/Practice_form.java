package Demo_site;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Practice_form extends Base 
{
	public void form()
	{
		
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		
		WebElement firstname=driver.findElement(By.cssSelector("input[id=\"firstName\"]"));
		firstname.sendKeys("Jeremy");
		WebElement lastname=driver.findElement(By.cssSelector("input[id=\"lastName\"]"));
		lastname.sendKeys("Clarkson");
		
		WebElement email=driver.findElement(By.cssSelector("input[class=\"mr-sm-2 form-control\"]"));
		email.sendKeys("jclarkson@amazon.com");
		WebElement gender=driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
		gender.click();
		WebElement mobileNumber=driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobileNumber.sendKeys("7561053532");
		
		
		//date of birth
		WebElement dateofbirth=driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dateofbirth.click();
		WebElement yeardropdown=driver.findElement(By.cssSelector("select[class=\"react-datepicker__year-select\"]"));	
		Select selectyear=new Select(yeardropdown);          
		selectyear.selectByValue("2001");
				
		WebElement monthdropdown=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select selectmonth=new Select(monthdropdown);
		selectmonth.selectByVisibleText("January");
			
		WebElement datedropdown=driver.findElement(By.xpath("//div[@class='react-datepicker__month']//div[@role='option'][text()='2']"));	
		datedropdown.click();			
	
	
		/*
	    dateofbirth.sendKeys(Keys.CONTROL+"a");//select all input from keyboard
		//dateofbirth.sendKeys(Keys.DELETE);
		
		dateofbirth.clear();
		dateofbirth.sendKeys("10 Apr 1903");
	*/
	
		WebElement subject=driver.findElement(By.xpath("//div[contains(@class,'subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3')]"));
		subject.sendKeys("selenium");
		subject.sendKeys(Keys.ENTER);
		
		WebElement hobbies=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
		hobbies.click();
		//choosing file not done
		
		WebElement address=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		address.sendKeys("Exhibit Technologies PVT LTD, Lotus Signature, Suite 702, Captain Suresh Sawant Marg, Veera Desai Road, Andheri West, 400053");
	
		
		WebElement dropdown_state=driver.findElement(By.cssSelector("div[class=\\\" css-1uccc91-singleValue\\\"]"));
	
		
		WebElement dropdown_city=driver.findElement(By.cssSelector("div[class=\" css-1wa3eu0-placeholder\"]"));
		
		WebElement submit=driver.findElement(By.cssSelector("button[id=\"submit\"]"));
		submit.click();
		
		System.out.println("practice form done successfully");

	}

	public static void main(String[] args)
	
	{
		Practice_form practiceForm=new Practice_form();
		practiceForm.initializerbrowser();
		practiceForm.form();
		
		

	}

}

