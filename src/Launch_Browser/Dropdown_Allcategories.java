package Launch_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.language.Selection;

public class Dropdown_Allcategories {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(e1);
		s1.selectByVisibleText("Electronics");
		s1.selectByValue("search-alias=todays-deals");
		s1.selectByIndex(5);
	}
}
