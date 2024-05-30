package Launch_Browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("india");
		Thread.sleep(2000);
		List<WebElement> autosugg = driver.findElements(By.xpath("//div[@class ='OBMEnb']/ul/li"));
		int count = autosugg.size();
		System.out.println(count);
		autosugg.get(4).click();
		
		

	}

}
