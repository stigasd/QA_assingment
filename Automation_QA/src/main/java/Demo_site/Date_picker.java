package Demo_site;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Date_picker  extends Base{
	public void select_date()
	{
		driver.navigate().to("https://demoqa.com/date-picker");
		WebElement selectdate=driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']"));
		selectdate.click();
		WebElement year=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select selectyear=new Select(year);
		selectyear.selectByValue("1947");
		WebElement month=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select selectmonth=new Select(month);
		selectmonth.selectByIndex(3);
		WebElement day=driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--022']"));
		day.click();
		
		
		
		
		WebElement time=driver.findElement(By.xpath("//div[@class='react-datepicker__time']//li[text()='10:15']"));
		Select selecttime=new Select(time);
		selecttime.selectByValue("10:15");
	
	
	}
	
	

	public static void main(String[] args) 
	{
		Date_picker date=new Date_picker();
		date.initializerbrowser();
		date.select_date();

	}

}
