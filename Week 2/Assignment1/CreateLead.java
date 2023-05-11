package Week2.Assignment1;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
	
	//1. Initiate the WebDriverManager
	//2. Load the Browser
	//3. Call the URL
	//4. Enter UserName and Password Using Id Locator
    //5. Click on Login Button using Class Locator
    //6. Click on CRM/SFA Link
	//7. Click on Leads Button
    //8. Click on Create Lead 
	//9. Enter CompanyName Field Using id Locator
    //10. Enter FirstName Field Using id Locator
	//11. Enter LastName Field Using id Locator
    //12. Enter FirstName(Local) Field Using id Locator
	//13. Enter Department Field Using any Locator of Your Choice
	//14. Enter Description Field Using any Locator of your choice 
	//15. Enter your email in the E-mail address Field using the locator of your choice
    //16. Select State/Province as NewYork Using Visible Text
    //17. Click on Create Button
	//18. Get the title of the page.
		
		
	
		WebDriverManager.edgedriver();		
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saravanakannan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("B");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Saravanakannan");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("B");
		driver.findElement(By.name("departmentName")).sendKeys("IT-Software");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Lead Analyst Software Engineer");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("saravanan2130@gmail.com");
		
	
		WebElement Marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sec1 = new Select(Marketing);
		sec1.selectByVisibleText("Automobile");
		
		WebElement Statecode = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select state = new Select(Statecode);
		state.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		

	}

}
