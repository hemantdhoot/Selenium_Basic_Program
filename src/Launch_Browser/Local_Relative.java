package Launch_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Local_Relative {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/aakash%20dhoot/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement un = driver.findElement(By.xpath("//input[@id='1']"));
		un.sendKeys("dghshk");
		WebElement h = driver.findElement(By.xpath("//input[@id='2']"));
		h.sendKeys("hheke");
		WebElement pw = driver.findElement(By.xpath("//input[@name ='password']"));
		pw.sendKeys("12345");
		WebElement fn = driver.findElement(By.xpath("//input[@name='fname']"));
		fn.sendKeys("hemant");
		WebElement cb1 = driver.findElement(By.xpath("//input[@name = 'name1']"));
		cb1.click();
		WebElement cb2 = driver.findElement(By.xpath("//input[@name = 'name2']"));
		cb2.click();
		WebElement cb3 = driver.findElement(By.xpath("//input[@name = 'name3']"));
		cb3.click();
		WebElement r1 = driver.findElement(By.xpath("(//input)[11]"));
		r1.click();
		WebElement r2 = driver.findElement(By.xpath("(//input)[12]"));
		r2.click();
	}

}
