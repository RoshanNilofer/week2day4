package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("HCL");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Roshan");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Nilofer");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("J");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("CSE");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("hai");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("roshannilofer7471@gmail.com");
		WebElement source = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drop = new Select(source);
		drop.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("This is Roshan");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}
		
	}		

