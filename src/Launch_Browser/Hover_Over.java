package Launch_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover_Over {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement account_List = driver.findElement(By.xpath("//span[@class ='nav-line-2 ']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(account_List).perform();
		WebElement signin = driver.findElement(By.xpath("(//span[@class ='nav-action-inner'])[1]"));
		signin.click();
		WebElement un =	driver.findElement(By.id("ap_email"));
		un.sendKeys("hemantdhoot0@gmail.com");
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		WebElement pw = driver.findElement(By.id("ap_password"));
		pw.sendKeys("shkjhfkjhek");
		WebElement sign = driver.findElement(By.id("signInSubmit"));
		sign.click();
		
	}

}
