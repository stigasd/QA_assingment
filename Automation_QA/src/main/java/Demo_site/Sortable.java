package Demo_site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Sortable extends Base {
	public void grid()
	{
		driver.navigate().to("https://demoqa.com/sortable");
		WebElement grid=driver.findElement(By.cssSelector("a[id=\"demo-tab-grid\"]"));
		grid.click();
		WebElement drag=driver.findElement(By.xpath("//div[@class='create-grid']/div[@class='list-group-item list-group-item-action'][text()='One']"));
		Actions action=new Actions(driver);
		action.clickAndHold();
		WebElement drop=driver.findElement(By.xpath("//div[@class='create-grid']/div[@class='list-group-item list-group-item-action'][text()='Six']"));
		action.moveToElement(drop).build().perform();
		action.release().build().perform();
		// try using clickAndHold(), moveToElement(), and release().
		
		
	}

	public static void main(String[] args) {
		Sortable sortable=new Sortable();
		sortable.initializerbrowser();
		sortable.grid();

	}

}
