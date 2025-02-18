package Demo_site;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;// globally declaring
	public void initializerbrowser()
	{
		driver=new ChromeDriver();//launching browser
		driver.get("https://demoqa.com/");// get site
		driver.manage().window().maximize();//maximize window
		
	}
	public void quitandclose()
	{
		driver.quit();
		driver.close();
	}

	public static void main(String[] args)
	{
		Base obj=new Base();
		obj.initializerbrowser();
		
	}

}
