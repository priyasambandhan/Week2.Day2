package Week2.day2;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Image {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver=new ChromeDriver();		
		driver.get("http://www.leafground.com/pages/Image.html");
		driver.manage().window().maximize();
	
	
	WebElement image1= driver.findElement(By.xpath("//img[@src='../images/home.png']"));
	image1.click();
	driver.navigate().back();
	
	WebElement image2= driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
	driver.get(image2.getAttribute("src"));;
	if(driver.getTitle().contains("404"))
		System.out.println("Link is broken");
	else
		System.out.println("Link is not broken");
	driver.navigate().back();
	
	
	WebElement image3= driver.findElement(By.xpath("//img[@src='../images/keyboard.png']"));
	image3.click();
	driver.navigate().back();
	System.out.println("Test success");
	}
}
