package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop_Grojson {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop");
		driver.manage().window().maximize();
		WebElement drag = driver.findElement(By.xpath("(//div[@id='container'])[11]"));
		WebElement drop = driver.findElement(By.xpath("//div[@class='w3-container '][2]"));
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		WebElement drag1 = driver.findElement(By.xpath("//div[@class='w3-container '][2]"));
		WebElement drop1 = driver.findElement(By.xpath("(//div[@id='container'])[11]"));
		a1.dragAndDrop(drag1, drop1).perform();
	}

}
