package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_amazon {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		Thread.sleep(2000);
		List<WebElement> autosugg = driver.findElements(By.xpath("//div[@class ='two-pane-results-container']/div/div"));
		int count = autosugg.size();
		System.out.println(count);
		autosugg.get(6).click();

	}

}
