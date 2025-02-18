package Demo_site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Interaction extends Base {
	
	public void sortable()
	{
		driver.navigate().to("https://demoqa.com/sortable");
		WebElement list_drag=driver.findElement(By.xpath("(//div[@class='list-group-item list-group-item-action'])[5]"));
		WebElement list_drop=driver.findElement(By.xpath("(//div[@class='list-group-item list-group-item-action'])[1]"));
		Actions action=new Actions(driver);
		action.dragAndDrop(list_drag, list_drop).build().perform();
		System.out.println("list 3 moved to list 1");
		
		WebElement grid=driver.findElement(By.xpath("//a[text()='Grid']"));
		grid.click();
		WebElement drag=driver.findElement(By.xpath("//div[@class='create-grid']/div[@class='list-group-item list-group-item-action'][text()='One']"));
		WebElement drop=driver.findElement(By.xpath("//div[@class='create-grid']/div[@class='list-group-item list-group-item-action'][text()='Six']"));
		action.dragAndDrop(drag, drop).build().perform();
		action.dragAndDrop(drag, drop).build().perform();
		System.out.println("block 1 moved to block 6");
		
		
		
		
	}
	
	public void dropable()
	{
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement dragme=driver.findElement(By.cssSelector("div[id=\"draggable\"]"));
		WebElement dropme=driver.findElement(By.cssSelector("div[ id=\"droppable\"]"));
		Actions action2=new Actions(driver);
		action2.dragAndDrop(dragme, dropme).build().perform();
		
		System.out.println("Dropped successfully ");
		
	}
	
	public void accept_drop()
	{
		
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement acceptable=driver.findElement(By.xpath("//a[@id='droppableExample-tab-accept']"));
		acceptable.click();
		WebElement drage2=driver.findElement(By.xpath("//div[@id='acceptable']"));
		WebElement drop2=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions action3=new Actions(driver);
		action3.dragAndDrop(drage2, drop2).build().perform();
		System.out.println("accept dropped successfully");
		
		
		
	}

	public static void main(String[] args)
	{
		Interaction interaction=new Interaction();
		interaction.initializerbrowser();
		interaction.sortable();
		interaction.dropable();
		interaction.accept_drop();
		

	}

}
