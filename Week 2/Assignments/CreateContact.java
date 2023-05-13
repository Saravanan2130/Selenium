package Week2.Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		
		 //Pseudo Code

		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		//2. Enter UserName and Password Using Id Locator
		//3. Click on Login Button using Class Locator
		//4. Click on CRM/SFA Link
		//5. Click on contacts Button
		//6. Click on Create Contact
		//7. Enter FirstName Field Using id Locator
		//8. Enter LastName Field Using id Locator
		//9. Enter FirstName(Local) Field Using id Locator
		//10. Enter LastName(Local) Field Using id Locator
		//11. Enter Department Field Using any Locator of Your Choice
		//12. Enter Description Field Using any Locator of your choice
		//13. Enter your email in the E-mail address Field using the locator of your choice
		//14. Select State/Province as NewYork Using Visible Text	
		//15. Click on Create Contact
		//16. Click on edit button
		//17. Clear the Description Field using .clear
		//18. Fill ImportantNote Field with Any text
		//19. Click on update button using Xpath locator	 
		//20. Get the Title of Resulting Page
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("saravanakannan");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("b");
		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("saravanakannan");
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("b");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("IT-Software");
		
		driver.findElement(By.id("createContactForm_description")).sendKeys("Test Engineer");
		
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("abc@gmail.com");
		
		WebElement Statecode = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select state = new Select(Statecode);
		state.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.partialLinkText("Edit")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Update the contact details");
	
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		
		System.out.println(driver.getTitle());
		
		
		
	}
}
