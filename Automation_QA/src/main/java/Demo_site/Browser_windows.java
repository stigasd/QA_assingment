package Demo_site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Browser_windows extends Base {
	public void window()
	{
		driver.navigate().to("https://demoqa.com/browser-windows");
		WebElement newtab=driver.findElement(By.xpath("//button[text()='New Tab']"));
		newtab.click();
		
		WebElement newwindow=driver.findElement(By.xpath("//button[@id=\"windowButton\"]"));
		newwindow.click();
		
		WebElement newwindowmessage=driver.findElement(By.xpath("//button[text()='New Window Message']"));
		newwindowmessage.click();
		
		
		
	}
	

	public static void main(String[] args) {
		Browser_windows browserwindows=new Browser_windows();
		browserwindows.initializerbrowser();
		browserwindows.window();

	}

}
