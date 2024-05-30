package Launch_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Shoes {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement s = driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"));
		s.sendKeys("shoes");
		s.sendKeys(Keys.ENTER);
	}

}
