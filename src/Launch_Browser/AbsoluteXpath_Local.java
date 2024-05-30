package Launch_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath_Local {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/aakash%20dhoot/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement un = driver.findElement(By.xpath("/html/body/input[1]"));
		un.sendKeys("dghshk");
		WebElement h = driver.findElement(By.xpath("/html/body/input[2]"));
		h.sendKeys("hheke");
		WebElement pw = driver.findElement(By.xpath("/html/body/input[3]"));
		pw.sendKeys("12345");
		WebElement fn = driver.findElement(By.xpath("(/html/body/form/input)[1]"));
		fn.sendKeys("hemant");
		WebElement cb1 = driver.findElement(By.xpath("(/html/body/form/input)[4]"));
		cb1.click();
		WebElement cb2 = driver.findElement(By.xpath("(/html/body/form/input)[5]"));
		cb2.click();
		WebElement cb3 = driver.findElement(By.xpath("(/html/body/form/input)[6]"));
		cb3.click();

	}

}
