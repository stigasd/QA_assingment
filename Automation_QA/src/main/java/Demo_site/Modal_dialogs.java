package Demo_site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Modal_dialogs extends Base {
	public void dialog_box()
	{
		driver.navigate().to("https://demoqa.com/modal-dialogs");
		
		WebElement small_madol=driver.findElement(By.xpath("//button[@id=\"showSmallModal\"]"));
		small_madol.click();
		driver.switchTo().alert().accept();
		
		WebElement large_modal=driver.findElement(By.xpath("//button[@id=\"showLargeModal\"]"));
		large_modal.click();
		driver.switchTo().alert().accept();
		
		
	}

	public static void main(String[] args) {
		
		Modal_dialogs dialogs=new Modal_dialogs();
		dialogs.initializerbrowser();
		dialogs.dialog_box();
		

	}

}
