package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_pharmacy 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://pharmeasy.in");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("(//div[@class='c-PJLV c-bXbWpx c-bXbWpx-lfylVv-direction-row c-bXbWpx-fMErMJ-justify-left c-bXbWpx-joJbDg-align-center c-bXbWpx-ielOayq-css'])[2]"));
		search.click();
		WebElement search1 = driver.findElement(By.id("topBarInput"));
		search1.sendKeys("para");
		Thread.sleep(2000);
		List<WebElement> autosugg = driver.findElements(By.xpath("//div[@class='c-PJLV c-bXbWpx c-bXbWpx-bZJlhX-direction-column c-bXbWpx-iieFQlv-css']/div/a"));
		int count = autosugg.size();
		System.out.println(count);
		autosugg.get(1).click();

	}

}
