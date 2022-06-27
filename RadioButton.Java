package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver=new ChromeDriver();		
		driver.get("http://www.leafground.com/pages/radio.html");
		driver.manage().window().maximize();
	
	
	WebElement rbutton1= driver.findElement(By.id("yes"));
	rbutton1.click();
	
	WebElement rbutton2= driver.findElement(By.xpath("(//input[@name='news'])[1]"));
	if(rbutton2.isSelected())
		System.out.println("Unchecked is the default selected");
	else
		System.out.println("checked is the default selected");
	
	WebElement rbutton3= driver.findElement(By.xpath("(//input[@name='age'])[1]"));
	WebElement rbutton4= driver.findElement(By.xpath("(//input[@name='age'])[2]"));
	WebElement rbutton5= driver.findElement(By.xpath("(//input[@name='age'])[3]"));
	boolean isSelected= false;
	if(rbutton3.isSelected())
		isSelected=true;
	else if(rbutton4.isSelected())
		isSelected=true;
	else if(rbutton5.isSelected())
		isSelected=true;
	if(isSelected)
	{
		System.out.println("Value is already selected");
	}
	else
		rbutton4.click();
	System.out.println("Test Success");
	
   
}

}
