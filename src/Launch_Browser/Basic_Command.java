package Launch_Browser;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Command {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		String ID1 = driver.getWindowHandle();
		System.out.println(ID1);
		
		Set<String> ID2 = driver.getWindowHandles();
		System.out.println(ID2);
		
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		driver.quit();
	}

}
