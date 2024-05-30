package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Grotech2 {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		WebElement energy = driver.findElement(By.name("Choice4"));
		Select s1 = new Select(energy);
		s1.selectByVisibleText("Energy15");
		WebElement qtp = driver.findElement(By.name("Choice8"));
		Select s2 = new Select(qtp);
		s2.selectByValue("QTP10");

	}

}
