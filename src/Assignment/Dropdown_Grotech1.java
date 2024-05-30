package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Grotech1{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		WebElement demo = driver.findElement(By.name("Choice1"));
		Select s1 = new Select(demo);
		s1.selectByVisibleText("Demo2");
		WebElement sql = driver.findElement(By.name("Choice9"));
		Select s2 = new Select(sql);
		s2.selectByValue("SQL15");
		WebElement night = driver.findElement(By.name("Choice6"));
		Select s3 = new Select(night);
		s3.selectByValue("Night10");
	}
}
