package PractiseTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NokariTest {

	@Test
	public void test()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/mnjuser/homepage");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		allLinks.size();
		for(WebElement link:allLinks)
		{
			String txt = link.getText();
			System.out.println(txt);
			
	driver.findElement(By.className(txt));
	
	System.out.println("got the pull");
	
	
	
			
		}
		driver.close();
		
		System.out.println("This is pradeeps laptop");
		
		
	}
}
