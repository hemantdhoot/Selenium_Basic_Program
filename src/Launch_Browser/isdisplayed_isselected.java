package Launch_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed_isselected {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		WebElement Search_Txt = driver.findElement(By.name("q"));
		if(Search_Txt.isDisplayed() && Search_Txt.isEnabled())
		{
			Search_Txt.sendKeys("india");
		}
		Search_Txt.sendKeys(Keys.ENTER);
	}

}
