package Launch_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook_account {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("hemant");
		driver.findElement(By.name("lastname")).sendKeys("dhoot");
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select s1 = new Select(day);
		s1.selectByValue("28");
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s2 = new Select(month);
		s2.selectByVisibleText("Jun");
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select s3 = new Select(year);
		s3.selectByVisibleText("2005");
		WebElement gender = driver.findElement(By.xpath("(//label[@class = '_58mt'])[2]"));
		gender.click();
		
		
		

	}

}
