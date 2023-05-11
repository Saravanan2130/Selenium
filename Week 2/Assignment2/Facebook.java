package Week2.Assignment2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("XYZ");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(" xyz");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("xyz123@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("xyz123@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Xyz@123");
		
		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		d.selectByValue("21");
		
		WebElement mon = driver.findElement(By.id("month"));
		Select m = new Select(mon);
		m.selectByVisibleText("Apr");
		
		
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByIndex(20);
		
	    driver.findElement(By.className("_58mt")).click();
	    driver.findElement(By.name("websubmit")).click();
	    
	    System.out.println("Facebook account is created successfully");
	    
	}

}
