package Demo_site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Frame extends Base
{
public void frame_handling()
{
	driver.navigate().to("https://demoqa.com/frames");
	WebElement iframe=driver.findElement(By.xpath("//iframe[@id=\"frame1\"]"));
    driver.switchTo().frame(iframe);
	
}
	public static void main(String[] args) 
	
	{
		Frame frame=new Frame();
		frame.initializerbrowser();
		frame.frame_handling();

	}

}
