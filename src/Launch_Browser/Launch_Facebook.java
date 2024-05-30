package Launch_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Facebook {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("hemantdhoot0@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12354568408");
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
	}

}
