package Launch_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Keys {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement Allcategories = driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(Allcategories);
		Allcategories.sendKeys(Keys.ARROW_DOWN);
		Allcategories.sendKeys(Keys.ARROW_DOWN);
		Allcategories.sendKeys(Keys.ARROW_DOWN);
		Allcategories.sendKeys(Keys.ARROW_DOWN);

	}

}
