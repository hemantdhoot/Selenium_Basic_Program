package Launch_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselectedex {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/aakash%20dhoot/Downloads/learningHTML1.html");
		WebElement boy_chkbox = driver.findElement(By.id("123"));
		boolean b1 = boy_chkbox.isSelected();
				if(b1 == true)
				{
					System.out.println("is selected");
				}
				else
				{
					System.out.println("not selected");
				}
				boy_chkbox.click();
		System.out.println("i have selected");

	}

}
