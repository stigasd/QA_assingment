package Demo_site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Widget_hover_me extends Base {
	public void mousehover()
	{
		driver.navigate().to("https://demoqa.com/tool-tips");
		WebElement hover1=driver.findElement(By.xpath("//button[text()='Hover me to see']"));
		Actions action=new Actions(driver);
		action.moveToElement(hover1).build().perform();
		WebElement hover2=driver.findElement(By.xpath("//input[@id='toolTipTextField']"));
		action.moveToElement(hover2).build().perform();
		
		
	}

	public static void main(String[] args) {
		Widget_hover_me hoverme=new Widget_hover_me();
		hoverme.initializerbrowser();
		hoverme.mousehover();
		
		

	}

}
