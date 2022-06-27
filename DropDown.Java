package Week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver=new ChromeDriver();		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		//Select Training program using index
		
		WebElement listbox1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select dd1=new Select(listbox1);
		dd1.selectByIndex(1);		
		
		//select Training program using Text
		WebElement listbox2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select dd2=new Select(listbox2);
		dd2.selectByVisibleText("Appium");	
		
		//Select Training program using value
		WebElement listbox3 = driver.findElement(By.xpath("//select[@name='dropdown3']"));
		Select dd3=new Select(listbox3);
		dd3.selectByValue("4");
						
		//Get number of options
		WebElement listbox4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select dd4=new Select(listbox4);
		List<WebElement> options = dd4.getOptions();
		System.out.println(options.size());
		
		
		//Send keys to select
		WebElement listbox5 = driver.findElement(By.xpath("//option[contains(text(),'sendKeys')]//parent::select"));
		listbox5.sendKeys("Loadrunner");
		
		//select your programs
		
		WebElement listbox6 = driver.findElement(By.xpath("//option[contains(text(),'programs')]//parent::select"));
		listbox6.sendKeys("Selenium");
		listbox6.sendKeys("Appium");
		
	}

}
