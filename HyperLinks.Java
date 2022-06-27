package Week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		// Go to Home Page
		WebElement link1 = driver.findElement(By.linkText("Go to Home Page"));
		link1.click();

		// back to links page

		WebElement link2 = driver.findElement(By.xpath("//img[@src='images/link.png']"));
		link2.click();

		// Find where i am going without clicking me

		WebElement link3 = driver.findElement(By.partialLinkText("Find where"));
		System.out.println("Find where i am going without clicking me :" + link3.getAttribute("href"));

		// Verify am I broken?
		WebElement link4 = driver.findElement(By.xpath("//a[@href='error.html']"));
		link4.click();
		WebElement text = driver.findElement(By.xpath("//h1[contains(text(),'404')]"));

		if (text.getText().contains("404"))

			System.out.println("The link is broken");
		else
			System.out.println("Link is not broken");
		driver.navigate().back();
		
					
		//Go to Home page
		
		WebElement link5 = driver.findElement(By.xpath("(//a[@href='../home.html'])[3]"));
		link5.click();

		WebElement link6 = driver.findElement(By.xpath("//img[@src='images/link.png']"));
		link6.click();
		
		//number of links available in the page
		System.out.println("Number of links in this page :"+driver.findElements(By.tagName("a")).size());
		
		
}
}
