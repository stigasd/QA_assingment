package Demo_site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Buttons extends Base {
	
	public void press()
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

	public static void main(String[] args) {
		
		Buttons button=new Buttons();
		button.initializerbrowser();
		button.press();
		
		

	}

}
