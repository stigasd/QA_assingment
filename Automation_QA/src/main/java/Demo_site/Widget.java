package Demo_site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Widget extends Base {
	public void progress_bar()
	{
		driver.navigate().to("https://demoqa.com/progress-bar");
		WebElement start_stop=driver.findElement(By.xpath("//button[@id=\"startStopButton\"]"));
		start_stop.click();
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		start_stop.click();
		
	}
	
	public void widgetmenu()
	{
		driver.navigate().to("https://demoqa.com/select-menu");
		WebElement menubar=driver.findElement(By.xpath("//div[text()='Select Option']"));
		Select dropdown1=new Select(menubar);
		dropdown1.selectByVisibleText("Group 1, option 1");
	}
	

	public static void main(String[] args) 
	{
		Widget widget=new Widget();
		widget.initializerbrowser();
		widget.progress_bar();
		widget.widgetmenu();
		

	}

}
