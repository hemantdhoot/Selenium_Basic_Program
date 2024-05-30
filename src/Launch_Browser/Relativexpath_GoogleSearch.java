package Launch_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath_GoogleSearch {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		WebElement a1 =	driver.findElement(By.xpath("//textarea[@class = 'gLFyf']"));
		a1.sendKeys("ram");
		a1.sendKeys(Keys.ENTER);
	}

}
