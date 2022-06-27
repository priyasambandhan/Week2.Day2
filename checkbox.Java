package Week2.day2;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {
	
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver=new ChromeDriver();	
		//driver.get("www.google.com");
		driver.get("http://www.leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		if(driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected())
			System.out.println("The Selenium checkbox is checked");
		else
			System.out.println("The Selenium checkbox is not checked");
		
		if(driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).isSelected())
		{
			driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).clear();;
			System.out.println("The Not Selected checkbox was checked and unchecked now");
		}
			
		if(driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).isSelected())
		{
			driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
			System.out.println("The I am Selected checkbox was checked and unchecked now");
		}
		
		for(int i=9; i<15;i++)
		{
			String mypath="(//input[@type='checkbox'])["+i+"]";
			driver.findElement(By.xpath(mypath)).click();
		}
	
				
	}

}
