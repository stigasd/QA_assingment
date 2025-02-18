package Demo_site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Book_store extends Base {
	
	public void new_user()
	{
		driver.navigate().to("https://demoqa.com/login");
		WebElement newuserkey=driver.findElement(By.id("newUser"));
		newuserkey.click();
		
		WebElement firstname=driver.findElement(By.cssSelector("input[id=\"firstname\"]"));
		firstname.sendKeys("David");
		WebElement lastname=driver.findElement(By.cssSelector("input[id=\"lastname\"]"));
		lastname.sendKeys("Beckham");
		WebElement username=driver.findElement(By.cssSelector("input[id=\"userName\"]"));
		username.sendKeys("stigASD");
		WebElement password=driver.findElement(By.cssSelector("input[id=\"password\"]"));
		password.sendKeys("stig8735ASD**");
		
		WebElement notrobot=driver.findElement(By.xpath("//label[@role=\"presentation\"]"));
		notrobot.click();
		WebElement register=driver.findElement(By.cssSelector("button[id=\"register\"]"));
		register.click();
		
		WebElement backtologin=driver.findElement(By.cssSelector("button[id=\"gotologin\"]"));
		backtologin.click();
		
		
		
		
	}
	
	public void login()
	{
		
		
		
		WebElement username=driver.findElement(By.cssSelector("input[id=\"userName\"]"));
		username.sendKeys("stigASD");
		WebElement password=driver.findElement(By.cssSelector("input[id=\"password\"]"));
		password.sendKeys("stigASD8735**");
		WebElement login=driver.findElement(By.cssSelector("id=\"login\""));
		login.click();
		
		WebElement gotostore=driver.findElement(By.id("gotoStore"));
		gotostore.click();
		WebElement searchbar=driver.findElement(By.cssSelector("input[id=\"searchBox\"]"));
		searchbar.sendKeys("You Don't Know JS");
		WebElement book=driver.findElement(By.cssSelector("a[href=\"/books?book=9781491904244\"]"));
		book.click();
		
		
		
		
		
	}
	
		
		

	public static void main(String[] args)
	
	
	{
		
		Book_store bookstore=new Book_store();
		bookstore.initializerbrowser();
		bookstore.new_user();
		//bookstore.login();
		
	

	}

}
